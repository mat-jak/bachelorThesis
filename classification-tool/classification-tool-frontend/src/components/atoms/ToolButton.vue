<template>
    <div class="tool-button-container">
        <button class="tool-button" :disabled="disabled">
            <slot></slot>
        </button>
    </div>
</template>

<script>
    export default {

        props: {
            disabled: {
                type: Boolean,
                default: false
            }
        }

    }
</script>

<style lang="scss" scoped>

    @import '@/styles/global.scss';

    .tool-button {
        background-color: orange;
        border-radius: 0.75rem;
        width: 7rem;
        height: 2.5rem;
        font-size: 1.2rem;
    }

</style>