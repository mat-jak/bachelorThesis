import HTTP from '@/services/http/http-common';

export default {
    create() {
        return HTTP.post('/users')
    },

    assignDocstrings(id, docstrings) {
        return HTTP.put(`users/${id}/docstrings`, docstrings)
    },

    addClassification(id, docstring) {
        return HTTP.put(`users/${id}/classifications`, docstring)
    },

    update(id, user) {
        return HTTP.put(`users/${id}`, user)
    },

    addClassifiedDocstring(id, docstring) {
        return HTTP.put(`users/${id}/docstrings/classification`, docstring, {
        })
    },

    updateDemography(id, user) {
        return HTTP.put(`users/${id}/demographies`, user)
    }
}