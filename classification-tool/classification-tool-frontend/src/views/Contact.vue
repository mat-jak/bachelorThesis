<template>
    <div class="contact-container">
        <div class="comment-container">
            <div class="comment-label" v-html="contact1"></div>
            <textarea v-model="comment"
                      placeholder="missing categories"
                      class="user-comment"></textarea>
        </div>
        <div class="comment-container">
            <div class="comment-label" v-html="contact2"></div>
            <textarea v-model="missingCategory"
                      placeholder="your remark"
                      class="user-comment"></textarea>
        </div>
        <div class="contact-wrapper">
            <div class="contact-text" v-html="contact3"></div>
            <label class="email-label">E-mail</label>
            <input class="email" v-model="email" placeholder="john.smith@gmail.com">
        </div>
        <div class="finalize-container">
            <div class="finalize-text" v-html="contact4"></div>
            <div class="tool-button-container">
                <tool-button class="finalize-button" @click.native="updateUser">Finalize</tool-button>
            </div>
        </div>
    </div>
</template>

<script>

    import ToolButton from '@/components/atoms/ToolButton'
    import {mapState} from 'vuex'
    import {Texts} from '@/constants/HTMLTexts.const.js'
    export default {

        components: {
            ToolButton
        },

        data() {
            return {
                email: '',
                comment: '',
                contact1: Texts.contact1,
                contact2: Texts.contact2,
                contact3: Texts.contact3,
                contact4: Texts.contact4,
                missingCategory: ''
            }
        },

        computed: {
            ...mapState({
                user: state => state.user,
                counter: state => state.counter,
                docstrings: state => state.docstrings
            })
        },

        watch: {
            docstrings(value)  {
                this.$router.push({name: 'home', params: {id: this.docstrings[this.counter].id}})
            }
        },

        mounted() {
            this.email = this.user.email;
            this.comment = this.user.comment;
            this.missingCategory = this.user.missingCategory;
        },

        methods: {
            updateUser() {
                this.$store.dispatch('updateUser', {user: this.user, email: this.email, comment: this.comment, missingCategory: this.missingCategory})
                this.$router.push({name: 'completion'})
            },

        }

    }
</script>

<style lang="scss" scoped>

    @import '@/styles/global.scss';

    .contact-container {
        position: relative;
        margin-left: 4.167rem;
        height: 100%;
        text-align: left;


        .comment-container {
            margin-bottom: 1.25rem;
            .comment-label {
                margin-right: 9.167rem;
                margin-bottom: 1rem;
            }

            .user-comment {
                width: 20.8rem;
                height: 4.167rem;
                font-size: 0.75rem;
            }
        }


        .contact-wrapper {
            margin-bottom: 1.25rem;
            .contact-text {
                margin-bottom: 1rem;
                margin-right: 9.167rem;
            }


            input, label {
                display: block;
                font-size: 0.75rem;
            }
            .email {
                width: 10.4rem;
                height: 1rem;

            }
        }

        .finalize-container {

            .finalize-text {
                margin-right: 9.167rem;

            }

            .tool-button-container {


                .finalize-button {
                    position: absolute;
                    right: 7.5rem;
                    bottom: 0;
                }
            }
        }

    }
</style>