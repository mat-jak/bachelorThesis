<template>
    <div class="docstring-container">
        <span class="label">Comment to Be Classified</span>
        <span class="docstring-content" id="docstring">{{ content }}</span>
        <span class="label">Comment with Surrounding Source Code </span>
        <span class="small-label">(You can use the button to jump to the right spot)</span>
        <div class="context-container">
            <div v-if="!loaded" class="overlay">
                <span class="loading">Loading...</span>
            </div>
            <div class="context-wrapper" id="gist-container"></div>
        </div>
        <button v-show="loaded" @click="jumpToContext" class="go-to-context-button">Find in Context</button>
        <button v-show="loaded" @click="jumpToComment" class="go-to-comment-button">Back to Top</button>
    </div>
</template>

<script>


    import postscribe from 'postscribe'
    import ToolButton from './ToolButton'

    export default {

        components: {
            ToolButton
        },

        data() {
            return {
                text: 'empty text',
                showContext: false,
                scrollAmount: 0,
                loaded: false,
                gistLines: 0,
                docstringLines: 0
            }
        },

        props: {
            url: {
                type: String
            },
            startLine: {
                type: Number
            },
            content: {
                type: String
            },
            docstringType: {

            }
        },

        computed: {
            contentUrl() {
                return this.url;
            },
            buttonText() {
                if(this.showContext) {
                    return 'show docstring'
                }
                else {
                    return 'show context'
                }
            }
        },

        mounted() {
                postscribe('#gist-container', `<script id="gist" src="https://gist-it.appspot.com/${this.contentUrl}"><\/script>`)
                let gist = document.getElementById('gist')
                gist.addEventListener('load', () => {
                    let textarea = document.getElementById('gist-container');
                    let allStrings = textarea.querySelectorAll('.str')
                    let splittedContent = this.content.split(/\r\n|\r|\n/);
                    if (splittedContent.length > 1) {
                        let firstRow = splittedContent[0].replace(/^\s+/, function (m) {
                            return m.replace(/\s/g, '');
                        })
                        let secondRow = splittedContent[1].replace(/^\s+/, function (m) {
                            return m.replace(/\s/g, '');
                        })
                        allStrings.forEach(span => {
                            if (span.innerText.includes(firstRow) && span.innerText.includes(secondRow)) {
                                span.style.backgroundColor = "yellow";
                            }
                        })
                    }
                    else {
                        let firstRow = splittedContent[0].replace(/^\s+/, function (m) {
                            return m.replace(/\s/g, '');
                        })
                        allStrings.forEach(span => {
                            if (span.innerText.includes(firstRow)) {
                                span.style.backgroundColor = "yellow";
                            }
                        })
                    }
                    this.loaded = true;
                    this.emitGistLoaded()
                    window.scrollTo(0,0)
                })
        },

        methods: {

            goToDocstring() {
                let textArea = document.getElementById('gist-container')
                textArea.scrollTop = this.scrollAmount;
            },

            jumpToContext() {
                let docstringArea = document.getElementById('docstring');
                let gistText = document.getElementById('gist-container');
                this.docstringLines = docstringArea.innerText.split(/\r\n|\r|\n/).length;
                this.gistLines = gistText.innerText.split(/\r\n|\r|\n/).length;
                this.$emit('scroll', {docstringLines: this.docstringLines, gistLines: this.gistLines, startLine: this.startLine})

            },

            jumpToComment() {
                window.scrollTo(0,0)
            },

            emitGistLoaded() {
                this.$emit('gistLoaded');
            }
        }
    }
</script>

<style lang="scss">

    @import '@/styles/global.scss';

    .docstring-container {

        width: 100%;
        display: flex;
        flex-direction: column;
        justify-content: space-between;

        text-align: left;

        .label {
            display: block;
        }

        .small-label {
            margin-top: -0.4rem;
            font-size: 0.5rem;
        }



        .docstring-content {
            -moz-box-sizing: border-box;
            -webkit-box-sizing: border-box;
            box-sizing: border-box;
            padding: 0 0.8rem;
            width: 100%;
            height: fit-content;
            background-color: white;
            color: green;
            white-space: pre;
            display: block;
            margin-bottom: 1.25rem;
        }

        .context-container {
            width:100%;
            position: relative;
            min-height: 13.34rem;

            .overlay {
                width: 100%;
                height: 33.34rem;
                position: absolute;
                background-color: lightgray;
                display: flex;
                justify-content: center;
                align-items: center;

                .loading {
                    font-size: 2rem;
                }
            }

            .context-wrapper {
                height: 100%;
                background-color: white;
                line-height: 1;
            }
        }
        .go-to-context-button {
            position: fixed;
            top: 0.8rem;
            right: 43%;
            width: auto;
            height: auto;
            padding: 0.4rem;
            font-size: 1rem;
            border-radius: 0.4rem;
        }
        .go-to-comment-button {
            position: fixed;
            top: 0.825rem;
            right: 55%;
            width: auto;
            height: auto;
            padding: 0.4rem;
            font-size: 1rem;
            border-radius: 0.4rem;
        }
    }

    .gist-file{


        .gist-data {
            -moz-box-sizing: border-box;
            -webkit-box-sizing: border-box;
            box-sizing: border-box;
            padding: 0 0.4rem;
            .pln {
                color: black;
            }

            .kwd {
                color: blue;
            }

            .str {
                color: green;
            }
        }
    }






</style>