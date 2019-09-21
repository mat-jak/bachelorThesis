<template>
    <div class="welcome-container">
        <div class="welcome-text" v-html="htmlText">
        </div>
        <div class="image-wrapper">
            <img :src="myself" class="image">
        </div>
        <img :src="uzh_logo" class="logo">
        <tool-button @click.native="nextView"
                     class="tool-button">Next</tool-button>
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
                htmlText: Texts.welcomeText,
                uzh_logo: require('@/assets/images/uzh_logo.png'),
                myself: require('@/assets/images/matej_jakovljevic.png')
            }
        },

        computed: {
            ...mapState({
                user: state => state.user,
                counter: state => state.counter,
            }),
        },

        mounted() {

        },

        methods: {
            isEmpty(obj) {
                for(let prop in obj) {
                    if(obj.hasOwnProperty(prop)) {
                        return false;
                    }
                }
                return true;
            },

            nextView() {
                this.$router.push({name: 'demography'});

            }


        }

    }
</script>

<style lang="scss" scoped>

    @import '@/styles/global.scss';
    .welcome-container {
        position: relative;
        height: 100%;
        margin-left: 4.167rem;


        .welcome-text {
            text-align: left;
            margin-right: 9.167rem;
        }

        .image-wrapper {
            display: flex;
            flex-direction: row;
            height: 7.08rem;
            justify-content: flex-start;
            align-items: center;
            margin-right: 9.167rem;

            .image {
                height: 100%;
                margin-right: 1.25rem;
            }
        }
        .logo {
            height: 2.5rem;
            position: absolute;
            top: -0.4rem;
            right: 2.08rem;
        }

        .tool-button {
            position: absolute;
            right: 0;
            bottom: 0;
        }
    }

</style>