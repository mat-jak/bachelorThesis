<template>
    <div class="submission-container">
        <div class="submission-text"
             v-html="completion"></div>
        <button class="repeat-button"
                     @click="loadNewDocstrings">Give me more Comments!</button>
    </div>
</template>

<script>
    import {Texts} from '@/constants/HTMLTexts.const.js'
    import ToolButton from '@/components/atoms/ToolButton'
    import {mapState} from 'vuex'
    export default {

        components: {
            ToolButton
        },

        data() {
            return {
                completion: Texts.completion
            }
        },

        computed: {
            ...mapState({
                user: state => state.user,
                docstrings: state => state.docstrings,
                counter: state => state.counter,
            })
        },

        watch: {
            docstrings(value)  {
                this.$router.push({name: 'home', params: {id: this.docstrings[this.counter].id}})
            }
        },

        methods: {
            loadNewDocstrings() {
                this.$store.commit('setMoreDocstrings');
                this.$store.dispatch('loadNewDocstrings', this.user)
                this.$store.dispatch('increaseCounter')
                this.$nextTick(() => {
                })

            }
        }
    }
</script>

<style lang="scss" scoped>
    @import '@/styles/global.scss';

    .submission-container {
        position: relative;
        height: 100%;
        margin-left: 4.167rem;

        .submission-text {
            text-align: left;
            margin-right: 9.167rem;
        }

        .repeat-button {
            position: absolute;
            right: 0;
            bottom: 0;
            background-color: orange;
            border-radius: 1.125rem;
            width: 10rem;
            height: 5rem;
            font-size: 1.2rem;


        }
    }

</style>