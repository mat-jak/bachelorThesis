<template>
    <div class="taxonomy-description-container">
        <div class="text-wrapper">
            <div class="intro-upper" v-html="introUpper"></div>
            <div class="image-wrapper">
                <div class="intro-img">
                    <h3>Left side:</h3>
                    <img :src="leftSide" class="image">
                </div>
                <div class="intro-img">
                    <h3>Right side:</h3>
                    <img :src="rightSide" class="image">
                </div>
            </div>
        </div>
        <tool-button class="tool-button" @click.native="startClassification">{{ buttonText }}</tool-button>
    </div>
</template>

<script>

    import ToolButton from '@/components/atoms/ToolButton'
    import {mapState} from 'vuex'
    import {Texts} from '@/constants/HTMLTexts.const.js'
    export default {

        data() {
            return {
                introUpper: Texts.introUpper,
                rightSide: require('@/assets/images/rightSide.png'),
                leftSide: require('@/assets/images/leftSide.png')
            }
        },

        components: {
            ToolButton
        },

        computed: {
            ...mapState({
                docstrings: state => state.docstrings,
                user: state => state.user,
                counter: state => state.counter,
            }),
            buttonText() {
                if(this.counter !== 0) {
                    return 'Continue Classification'
                }
                else {
                    return 'Start'
                }
            }
        },

        mounted() {
        },

        methods: {
            startClassification() {
                this.$router.push({name: 'home', params: {id: this.docstrings[this.counter].id}});
            },

            isEmpty(obj) {
                for(let prop in obj) {
                    if(obj.hasOwnProperty(prop)) {
                        return false;
                    }
        }
        return true;
    }

        }
    }
</script>

<style lang="scss" scoped>

    @import '@/styles/global.scss';

    .taxonomy-description-container {
        margin-left: 4.167rem;
        position: relative;

        .text-wrapper {
            text-align: left;
            margin-right: 9.167rem;
            height: 100%;
        }

        .tool-button {
            position: absolute;
            right: 0;
            bottom: 0;
        }

        .image-wrapper {
            display: flex;
            flex-direction: row;
            align-items: flex-start;

            .intro-img {
                width: 50%;

                .image {
                    width: 100%;
                }
        }
        }
    }

</style>