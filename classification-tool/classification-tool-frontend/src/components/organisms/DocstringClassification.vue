<template xmlns:v-tooltip="http://www.w3.org/1999/xhtml">
    <div class="docstring-classification-container">
        <div class="left-side">
            <docstring-container :url="docstring.url"
                                 v-if="docstring && rerender"
                                 :startLine="docstring.startLine"
                                 :content="docstring.content"
                                 :docstringType="docstring.docstringContainerType"
                                 class="docstring-container"
                                 @gistLoaded="setGistLoaded"
                                 @scroll="emitScroll"/>
        </div>
        <div class="right-side">
            <span class="label">Which information does the comment contain?</span>
            <div class="checkbox-container">
                <div class="checkboxes"
                     v-for="(taxonomy, index) in taxonomies"
                     :key="index">
                    <div class="checkbox-wrapper">
                        <input v-model="classification.classes"
                               type="checkbox"
                               class="tool-checkbox"
                               @change="fillChecked"
                               :value="taxonomy.name">
                        <label class="tool-checkbox-input">
                            {{taxonomy.name}}
                        </label>
                    </div>
                    <img v-tooltip="{
                        content: taxonomy.description,
                        placement: 'left',
                        classes: ['info'],
                        targetClasses: ['it-has-a-tooltip'],
                        offset: 10,
                        trigger: 'hover',
                        hideOnTargetClick: false,
                        delay: {
                            show: 300,
                            hide: 100,
                        },}"
                         :src="questionMark"
                         class="question-mark"/>
                </div>
            </div>
            <span class="label">Do you have any comments?</span>
            <textarea v-model="classification.comment"
                      placeholder="comment"
                      class="user-classification-comment"></textarea>
            <div class="tool-buttons-container">
                <div class="upper-buttons">
                    <tool-button class="button-back" :disabled="!gistLoaded" @click.native="emitPrevious">Back</tool-button>
                    <tool-button v-if="counter < docstrings.length-1" :disabled="disableNext || !gistLoaded" class="button-next" @click.native="emitNext">Next</tool-button>
                    <tool-button v-else class="button-next" :disabled="disableNext || !gistLoaded" @click.native="emitContact">Next</tool-button>
                </div>
            </div>
        </div>
    </div>
</template>

<script>

    import DocstringContainer from '@/components/atoms/DocstringContainer'
    import ToolCheckbox from '@/components/atoms/ToolCheckbox'
    import ToolButton from '@/components/atoms/ToolButton'
    import { mapState, mapGetters } from 'vuex'


    export default {

        data() {
            return {
                rerender: true,
                checked: [],
                comment: '',
                questionMark: require('@/assets/icons/questionMark.svg'),
                disableNext: true,
                gistLoaded: false,
            }
        },

        components: {
            DocstringContainer,
            ToolCheckbox,
            ToolButton
        },

        props: {
            docstring: {
                type: Object
            },
            taxonomies: {
                type: Array
            },
            classificationList: {
                type: Array
            }
        },

        computed: {
            ...mapState({
                user: state => state.user,
                classifiedDocstrings: state => state.classifiedDocstrings,
                counter: state => state.counter,
                docstrings: state => state.docstrings,
                moreDocstrings: state => state.moreDocstrings
            }),
            ...mapGetters({
                getClassification: 'getClassesById'
            }),
            classification() {
                return this.getClassification(this.docstring.id)
            }
        },

        created() {
            this.forceRerender()
            this.fillChecked()
            this.gistLoaded = false;
            this.checkGist()
        },

        methods: {
            forceRerender() {
                this.rerender = false
                this.$nextTick(() => {
                    this.rerender = true;
                })
            },

            checkGist() {
                setTimeout(() => {
                    if(this.gistLoaded === false) {
                        this.gistLoaded = true
                    }
                }, 3500)

            },

            fillChecked() {
                this.checked = this.classification.classes
                if( this.checked.length !== 0) {
                    this.disableNext = false
                }
                else {
                    this.disableNext = true
                }
                this.$store.dispatch('updateClassifiedList', this.classification)
            },

            setGistLoaded() {
                this.gistLoaded = true
            },

            isEmpty(obj) {
                for(let prop in obj) {
                    if(obj.hasOwnProperty(prop)) {
                        return false;
                    }
                }
                return true;
            },

            emitPrevious() {
                this.$emit('previous')
            },
            emitNext() {
                this.$emit('next')
            },
            emitContact() {
                this.$emit('toContact')
            },
            emitScroll(data) {
                this.$emit('scroll', data)
            }

        }
    }
</script>

<style lang="scss">

    @import '@/styles/global.scss';

    .docstring-classification-container {

        font-size: 0.7rem;
        width: 100%;
        height: 100%;
        display: flex;
        flex-direction: row;
        align-items: start;

        .left-side {
            overflow: hidden;
            position: relative;
            height: 100%;
            width: 60%;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        .right-side {
            position: fixed;
            right: rem(100px);
            width: 26%;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
            color: #000;
            margin-left: 4.167rem;
            margin-right: 2rem;


            .user-classification-comment {
                min-height: 3vh;
                max-height: 10vh;
                width: 100%;
                font-size: 0.75rem;
            }

            .checkbox-container {
                min-height: 30vh;
                max-height: 45vh;
                display: flex;
                flex-direction: column;
                justify-content: space-between;
                margin-bottom: 0.8rem;
                .checkboxes {
                    display: flex;
                    flex-direction: row;
                    align-items: baseline;
                    justify-content: space-between;

                    .question-mark {
                        width: 0.75rem;
                        height: 0.75rem;
                        margin-left: rem(30px);
                    }

                    .checkbox-wrapper {
                        text-align: left;

                        input[type='checkbox'] {
                            -webkit-appearance: none;
                            -moz-appearance: none;
                            margin-right: rem(20px);
                        }

                        input[type=checkbox]::-ms-check {
                            display: none;
                        }
                        input[type=checkbox] {
                            position: relative;
                            width: 0.75rem;
                            height: 0.75rem;
                            border: 1px solid gray;
                            vertical-align: -2px;
                            color: green;
                        }

                        input[type=checkbox]::before {
                            content: "✔";
                            position: absolute;
                            font-size: 0.75rem;
                            right: 0;
                            top: -0.2rem;
                            visibility: hidden;
                        }

                        input[type=checkbox]:checked::before {
                            visibility: visible;
                        }
                        input[type=checkbox]:disabled {
                            border-color: black;
                            background: #ddd;
                            color: gray;
                        }
                    }
                }
            }

            .tool-buttons-container {
                margin-top: rem(20px);
                width: 100%;
                height: rem(120px);
                display: flex;
                flex-direction: column;
                justify-content: space-between;

                .upper-buttons {
                    display: flex;
                    flex-direction: row;
                    justify-content: flex-end;

                    .button-back {
                        margin-right: rem(30px);
                    }
                }

            }


        }
    }

    .tooltip {
        display: block !important;
        z-index: 10000;
        font-size: rem(16px);


        .tooltip-inner {
            border-radius: rem(16px);
            width: rem(250px);
            height: fit-content;
            padding: rem(5px);
        }

        .tooltip-arrow {
            width: 0;
            height: 0;
            border-style: solid;
            position: absolute;
            margin: 5px;
            border-color: black;
            z-index: 1;
        }

        &[x-placement^="left"] {
            margin-right: 5px;

            .tooltip-arrow {
                border-width: 5px 0 5px 5px;
                border-top-color: transparent !important;
                border-right-color: transparent !important;
                border-bottom-color: transparent !important;
                right: -5px;
                top: calc(50% - 5px);
                margin-left: 0;
                margin-right: 0;
            }
        }

        &[aria-hidden='true'] {
            visibility: hidden;
            opacity: 0;
            transition: opacity .15s, visibility .15s;
        }

        &[aria-hidden='false'] {
            visibility: visible;
            opacity: 1;
            transition: opacity .15s;
        }

        &.info {
            $color: lightgray;
            .tooltip-inner {
                background: $color;
                color: black;
                padding: 24px;
                border-radius: 5px;
                box-shadow: 0 5px 30px rgba(black, .1);
            }

            .tooltip-arrow {
                border-color: $color;
                color: $color;
                z-index: 10;
                visibility: visible;
            }
        }
    }
</style>