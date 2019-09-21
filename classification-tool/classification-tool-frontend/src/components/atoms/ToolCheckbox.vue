<template>
    <div class="tool-checkbox-container">
        <input v-model="checked"
               type="checkbox"
               class="tool-checkbox"
               @click="getChecked()"
               :value="checkboxValue">
        <label class="tool-checkbox-input">
            <slot></slot>
        </label>
    </div>
</template>

<script>
    export default {

        data() {
            return {
                checked: []
            }
        },

        props: {
            checkboxValue: {
                type: String
            },
            docstring: {
                type: Object
            }
        },
    }
</script>

<style lang="scss" scoped>

    @import '@/styles/global.scss';
    
    .tool-checkbox-container {

        input[type='checkbox'] {
            width: 1rem;
            height: 1rem;
            margin-right: 1.7rem;

        }

        .tool-checkbox-input {
            font-weight: bold;
        }

    }

</style>