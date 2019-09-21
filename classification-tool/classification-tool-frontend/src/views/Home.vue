<template>
    <div class="home">
        <docstring-classification v-if="rerender && docstrings"
                                  :docstring="docstring"
                                  :taxonomies="taxonomy"
                                  :classificationList="classificationList"
                                  @previous="previousDocstring"
                                  @next="nextDocstring"
                                  @toContact="goToContact"
                                  @scroll="emitScroll"/>
    </div>
</template>

<script>

    import DocstringClassification from '@/components/organisms/DocstringClassification'
    import ToolButton from '@/components/atoms/ToolButton'
    import {mapState, mapGetters} from 'vuex'

    export default {

        data() {
            return {
                rerender: true,
                docstring: {},
                alreadyClassified: false,
                disableNext: true
            }
        },

        components: {
            DocstringClassification,
            ToolButton
        },

        computed: {
            ...mapState({
                docstrings: state => state.docstrings,
                counter: state => state.counter,
                taxonomy: state => state.taxonomy,
                user: state => state.user,
                moreDocstrings: state => state.moreDocstrings,
                maxDocstrings: state => state.maxDocstrings,
                classificationList: state => state.classifications,
            }),
            ...mapGetters({
                getDocstring: 'getById',
                getClassification: 'getClassesById'
            }),
            classification() {
                return this.getClassification(this.docstring.id)
            }
        },

        created() {

            this.docstring = this.getDocstring(this.$route.params.id)
            if(!this.docstring) {
                this.$router.push('/404')
            }
        },

        mounted() {
            this.alreadyClassified = this.classification.classes.length !== 0;
            if(this.counter !== this.getIndex(this.$route.params.id)) {
                this.$store.dispatch('setCounter', this.getIndex(to.params.id))
                this.forceRerender()
            }
        },

        watch: {
            '$route' (to, from) {
                this.docstring = this.getDocstring(to.params.id)
                this.disableNext = true;
                this.alreadyClassified = this.classification.classes.length !== 0;
                if(this.counter !== this.getIndex(this.$route.params.id)) {
                    this.$store.dispatch('setCounter', this.getIndex(to.params.id))
                    this.forceRerender()
                }
                if(!this.docstring) {
                    this.$router.push('/404')
                }
            },
        },

        methods: {

            nextDocstring() {
                if(this.counter < this.docstrings.length-1) {
                    let classification = {docstringDTO: this.docstring, userDTO: this.user, classes: this.classification.classes, comment: this.classification.comment}
                    this.$nextTick(() => {
                        if(!this.alreadyClassified) {
                            this.$store.dispatch('createClassification', classification);
                            this.$store.dispatch('addClassifiedDocstringToUser', classification)
                        }
                        else {
                            this.$store.dispatch('updateClassification', {id: this.classification.classificationId, classes: this.classification.classes, comment: this.classification.comment})
                        }
                        this.$store.dispatch('increaseCounter');
                        this.$router.push({name: 'home', params: {id: this.docstrings[this.counter].id}})
                        this.forceRerender()
                    })
                    if(this.counter === this.docstrings.length -2 && this.moreDocstrings) {
                        this.$store.dispatch('loadNewDocstrings', this.user)
                    }

                }

            },

            goToContact() {
                if(this.counter !== this.maxDocstrings - 1) {
                    let classification = {docstringDTO: this.docstring, userDTO: this.user, classes: this.classification.classes, comment: this.classification.comment}
                    if(!this.alreadyClassified) {
                        this.$store.dispatch('createClassification', classification);
                        this.$store.dispatch('addClassifiedDocstringToUser', classification)
                    }
                    else {
                        this.$store.dispatch('updateClassification', {id: this.classification.classificationId, classes: this.classification.classes, comment: this.classification.comment})
                    }
                    this.$router.push({name: 'contact'})
                }
                else {
                    this.$router.push({name: 'completion'})
                }
            },

            previousDocstring() {
                if (this.counter > 0) {
                    this.$store.dispatch('decreaseCounter');
                    this.$router.push({name: 'home', params: {id: this.docstrings[this.counter].id}})
                    this.forceRerender()
                }
                else {
                    this.$router.push({name: 'introduction'})
                }
            },

            getIndex(id) {
                return this.docstrings.indexOf(this.getDocstring(id))
            },

            emitScroll(data) {
                this.$emit('scroll', data)
            },

            forceRerender() {
                this.rerender = false
                this.$nextTick(() => {
                    this.rerender = true;
                })
            }
        }

    }
</script>

<style lang="scss" scoped>

    @import '@/styles/global.scss';

    .home {
        width: 100%;
        height: 100%;

        .tool-buttons-container {
            margin-top: 0.825rem;
            width: 100%;
            display: flex;
            flex-direction: row;
            justify-content: flex-end;
            position: relative;

            .left-buttons {
                width: 60%;
                display: flex;
                flex-direction: row;
                justify-content: center;
                .button-back {
                    margin-right: 2rem;
                }
            }

            .right-buttons {
                width: 30%;
                position: relative;
                .button-end {
                    position: absolute;
                    right: 0;
                }
            }
        }
    }

</style>