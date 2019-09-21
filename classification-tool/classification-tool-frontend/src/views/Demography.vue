<template>
    <div class="demography-container">
        <div class="text-wrapper" v-html="text"></div>
        <div class="form-wrapper">
            <span class="label">What is your highest degree related to computer science?</span>
            <div class="radio-wrapper" v-for="(degree, index) in degrees" :key="`degree${index}`">
                <input type="radio" class="radio-button" :value="degree" v-model="pickedDegree" @change="checkDegree">
                <label>{{degree}}</label>
            </div>
            <textarea class="textarea-wrapper" v-if="otherDegree" v-model="degreeSpecification"></textarea>
            <span class="label">How many years of professional programming experience do you have?</span>
            <input class="text-input" type="number" v-model="experience" @change="checkForm">
            <span class="label">What is your current job title?</span>
            <input class="text-input" v-model="jobTitle" @change="checkForm">
            <span class="label">How would you rate your Python skills?</span>
            <div class="radio-wrapper" v-for="(selfAssessment, index) in selfAssessments" :key="`assessment${index}`" @change="checkForm">
                <input type="radio" class="radio-button" :value="selfAssessment" v-model="pickedAssessment">
                <label>{{selfAssessment}}</label>
            </div>
            <span class="label">Which comment style do you usually use for Python comments?</span>
            <div class="radio-wrapper" v-for="(style, index) in formats" :key="`style${index}`">
                <input type="radio" class="radio-button" :value="style" v-model="pickedFormat" @change="checkStyle">
                <label>{{style}}</label>
            </div>
            <textarea class="textarea-wrapper" v-if="otherStyle" v-model="styleSpecification"></textarea>
        </div>
        <tool-button class="tool-button" @click.native="nextView" :disabled="disableButton">Next</tool-button>
    </div>
</template>

<script>

    import {Texts} from '@/constants/HTMLTexts.const.js'
    import {Inputs} from '@/constants/demographyInputs.const.js'
    import ToolButton from '@/components/atoms/ToolButton'
    import {mapState} from 'vuex'
    export default {
        components: {
            ToolButton
        },
        data() {
            return {
                selfAssessments: Inputs.pythonSkills,
                formats: Inputs.usedCommentFormat,
                degrees: Inputs.degree,
                pickedAssessment: '',
                pickedDegree: '',
                pickedFormat: '',
                experience: '',
                jobTitle: '',
                otherDegree: false,
                otherStyle: false,
                degreeSpecification: '',
                styleSpecification: '',
                disableButton: true,
                text: Texts.demography
            }
        },

        computed: {
            ...mapState({
                user: state => state.user
            })
        },

        mounted() {
            this.disableButton = true;
            this.pickedFormat = this.user.styleFormat;
            this.pickedDegree = this.user.highestDegree;
            this.pickedAssessment = this.user.selfAssessment;
            this.experience = this.user.experience;
            this.jobTitle = this.user.jobTitle;
            if(!Inputs.usedCommentFormat.includes(this.user.styleFormat) && this.user.styleFormat) {
                this.pickedFormat = 'Other (please specify)'
                this.styleSpecification = this.user.styleFormat;
            }
            if(!Inputs.degree.includes(this.user.highestDegree) && this.user.highestDegree) {
                this.pickedDegree = 'Other (please specify)'
                this.degreeSpecification = this.user.highestDegree;
            }
            this.checkDegree()
            this.checkStyle()
            this.checkForm()
        },

        methods: {
            nextView() {
                let degree = this.pickedDegree
                let style = this.pickedFormat
                if(this.otherDegree) {
                    degree = this.degreeSpecification
                }
                if(this.otherStyle) {
                    style = this.styleSpecification
                }
                let userDemography = {highestDegree: degree, styleFormat: style, experience: this.experience, selfAssessment: this.pickedAssessment, jobTitle: this.jobTitle}
                let existingUserDemography = {highestDegree: degree, styleFormat: style, experience: this.experience, selfAssessment: this.pickedAssessment, jobTitle: this.jobTitle, userDTO: this.user}
                if(this.isEmpty(this.user)) {
                    this.$store.dispatch('createUserAndAssignDocstrings', userDemography);
                }
                else {
                    this.$store.dispatch('updateDemography', existingUserDemography)
                }
                this.$router.push({name: 'introduction'})
            },

            checkDegree() {
                if(this.pickedDegree === 'Other (please specify)') {
                    this.otherDegree = true;
                }
                else {
                    this.otherDegree = false;
                    this.degreeSpecification = '';
                }
                this.checkForm()
            },

            checkStyle() {
                if(this.pickedFormat === 'Other (please specify)') {
                    this.otherStyle = true;
                }
                else {
                    this.otherStyle = false;
                    this.styleSpecification = '';
                }
                this.checkForm()
            },

            checkForm() {
                if(this.pickedAssessment && this.pickedDegree && this.pickedFormat && this.jobTitle && this.experience) {
                    this.disableButton = false
                }
            },

            isEmpty(obj) {
                for(let prop in obj) {
                    if(obj.hasOwnProperty(prop)) {
                        return false;
                    }
                }
                return true;
            },
        }
    }
</script>

<style lang="scss" scoped>
    @import '@/styles/global.scss';

    .demography-container {
        margin-left: 4.167rem;
        position: relative;

        .text-wrapper {
            text-align: left;
            margin-right: 9.167rem;
            margin-bottom: 1.25rem;
        }

        .form-wrapper {
            text-align: left;
            margin-right: 9.167rem;
            height: 100%;

            input[type='radio'] {
                width: 0.75rem;
                height: 0.75rem;
            }

            .radio-wrapper {
                margin-bottom: 0.4rem;
            }

            label {
                font-size: 0.8rem;
            }

            .label {
                font-size: 1rem;
            }

            .label:not(:first-child) {
                margin-top: 1.25rem;
            }

            .textarea-wrapper {
                width: 12.5rem;
                font-size: 0.7rem;
            }

            .text-input {
                width: 12.5rem;
                font-size: 0.7rem;
            }
        }
        .tool-button {
            position: absolute;
            right: 0;
            bottom: 0;
        }
    }

</style>