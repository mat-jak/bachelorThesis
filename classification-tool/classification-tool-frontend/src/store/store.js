import Vue from 'vue';
import Vuex from 'vuex';
import API from '@/services/api/api';
import createPersistedState from 'vuex-persistedstate'
import docstrings from "../services/api/modules/docstrings";
import classifications from "../services/api/modules/classifications";

Vue.use(Vuex);

export const store = new Vuex.Store( {

    plugins: [createPersistedState()],

    state: {

        user: {},

        docstrings: [],

        classifications: [],

        taxonomy: [
            {name: 'General Description ("What")', description: 'Describes what the method/function, class, or module does (not how) and/or when it is used, or a summary'},
            {name: 'Technical Documentation ("How")', description: 'Describes in a technical way what is done and how it is done'},
            {name: 'Recap of Algorithmic Details ("Background")', description: 'Recap of the used algorithm, provides background'},
            {name: 'Description of Special Cases', description: 'Description of what happens when special cases occur, for example when a wrong input is given'},
            {name: 'Input Parameter(s)', description: 'The Input Parameters category contains everything related to the input parameters of methods/functions or classes. Therefore, descriptions of input parameters, input parameter types, defaults if no input parameters are given, examples for input parameters, or description of requirements which have to be fulfilled by an input parameter.'},
            {name: 'Return Value', description: 'The Return category contains everything related to the return of a method/function. Hence, descriptions of what is returned, return types, examples for returns, or also guaranteed returns.'},
            {name: 'Error Cases ("raise")', description: 'Describes which exceptions can be raised, or what can cause exceptions'},
            {name: 'Example Usage', description: 'Examples of usage, either code snippets or docTests'},
            {name: 'Metadata (author, creation date, version, etc.)', description: 'Everything what does not directly refer to the method/function, ccrele, or its usage. For Example author, creation date, version, etc.'},
            {name: 'Upgrade Instructions', description: 'Description of how to upgrade code in case of deprecation'},
            {name: 'Structural References', description: 'References or links to other methods/ functions, classes, or modules'},
            {name: 'Copyright/Licence', description: 'Information about the copyright and/or the licence'},
            {name: 'Other (Please explain in comment)', description: 'If no one of the above categories matches, select other. In this case, please describe in the comment box below what is contained in the comment'},
        ],

        counter: 0,

        moreDocstrings: false,

        classifiedDocstrings: [],

        maxDocstrings: 870
    },
    getters: {

        getById: state => id => {
            return state.docstrings.filter(docstring => {
                return docstring.id == id;
            }).shift()
        },
        getClassesById: state => id => {
            return state.classifiedDocstrings.filter(classification => {
                return classification.docstringId == id
            }).shift()
        }

    },
    actions: {
        resetStore({commit}) {
          commit('resetStore');
        },
        classifyDocstring({commit}, docstring) {
            commit('classifyDocstring', docstring)
        },

        updateClassifiedList({commit}, data) {
            commit('updateClassifiedList', data)
        },

        increaseCounter({commit}) {
            commit('increaseCounter');
        },

        decreaseCounter({commit}) {
            commit('decreaseCounter');
        },

        updateDemography({commit}, data) {
            return API.users.updateDemography(data.userDTO.id, data)
                .then((response) => {
                    commit('updateDemography', response.data)
                })
        },

        createUserAndAssignDocstrings({commit}, data) {
            return API.docstrings.sample()
                .then((docstrings) => {
                    commit('addClassifiedDocstring', docstrings.data)
                    commit('getDocstringSample', docstrings.data);
                    API.users.create()
                        .then((response) => {
                            API.users.assignDocstrings(response.data.id, docstrings.data)
                                .then((res) => {
                                    commit('createUserAndAssignDocstrings', res.data);
                                })
                            API.users.updateDemography(response.data.id, data)
                                .then((newUser) => {
                                    commit('updateDemography', newUser.data)
                                })
                        })
                })
        },

        createClassification({commit}, data) {
            return API.classifications.create(data)
                .then((response) => {
                    commit('createClassification', response.data)
                    API.classifications.assignDocstring(response.data.id, data.docstringDTO).then(() => {
                        API.classifications.assignUser(response.data.id, data.userDTO).then(() => {
                            commit('addClassificationIdToDocstring', {docstringId: data.docstringDTO.id, classificationId: response.data.id})
                        })
                    })

                })
        },

        updateClassification({commit}, data) {
            return API.classifications.update(data.id, data)
                .then((response) => {
                    commit('updateClassification', response.data)
                })
        },

        loadNewDocstrings({commit}, user) {
            return API.docstrings.moreDocstrings(user.id)
                .then((response) => {
                    commit('addDocstringsToSample', response.data)
                    commit('addClassifiedDocstring', response.data)
                    API.users.assignDocstrings(user.id, response.data)
                        .then((res) => {
                            commit('addAdditionalDocstrings', res.data);
                        })
                })
        },

        updateUser({commit}, data) {
            return API.users.update(data.user.id, data)
                .then((response) => {
                    commit('updateUser', response.data)
                })
        },



        setCounter({commit}, newCounter) {
            commit('setCounter', newCounter)
        },

        addClassifiedDocstringToUser({commit}, data) {
            return API.users.addClassification(data.userDTO.id, data.docstringDTO)
                .then((response) => {
                    commit('addClassifiedDocstringToUser', response.data)
                })
        }

    },
    mutations: {
        resetStore(state) {
          state.user = {};
          state.docstrings = [];
          state.classifications = [];
          state.counter = 0;
        },
        classifyDocstring(state, docstring) {
            state.docstrings.find(doc => doc.id === docstring.id).classes = docstring.classes;
        },

        updateClassifiedList(state, data) {
            state.classifiedDocstrings.find(doc => doc.docstringId === data.docstringId).classes = data.classes
            state.classifiedDocstrings.find(doc => doc.docstringId === data.docstringId).comment = data.comment
        },

        updateDemography(state, data)  {
            state.user = data
        },

        getDocstringSample(state, data) {
            if(data) {
                state.docstrings = data
            }
        },

        updateUsersDocstrings(state, data) {
            state.user = data
        },

        addDocstringsToSample(state, data) {
            let newSample = state.docstrings.concat(data)
            state.docstrings = newSample
        },

        assignDocstrings(state, data) {
            state.user.docstringSample = data;
        },

        createUserAndAssignDocstrings(state, data) {
            if(data) {
                state.user = data;
            }
        },

        createClassification(state, data) {
            let newClassifications = state.classifications
            newClassifications.push(data)
            state.classifications = newClassifications
        },

        updateClassification(state, data) {
            state.classifications.find(classification => classification.id === data.id).classes = data.classes
        },

        addClassifiedDocstring(state, data) {
            let tmpList = state.classifiedDocstrings
            data.forEach((doc) => {
                let newItem = {docstringId: doc.id, classes: [], comment: '', classificationId: null}
                tmpList.push(newItem)
            })
            state.classifiedDocstrings = tmpList;
        },

        addClassificationIdToDocstring(state, data) {
            state.classifiedDocstrings.find(doc => doc.docstringId === data.docstringId).classificationId = data.classificationId;
        },

        addAdditionalDocstrings(state, data) {
            state.user = data
        },

        addClassifiedDocstringToUser(state, data) {
            state.user = data
        },

        updateUser(state, data) {
            state.user = data;
        },

        setCounter(state, newCounter) {
            state.counter = newCounter;
        },

        increaseCounter(state) {
            state.counter++;
        },

        decreaseCounter(state) {
            state.counter--;
        },

        setMoreDocstrings(state) {
            state.moreDocstrings = true;
        },
    }
})