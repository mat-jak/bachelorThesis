<template>
    <div class="error-page">
        <h1>404 Page not found</h1>
        <div>
            <span class="error-text"><router-link to="/">Unfortunately this page can not be found, go back to the starting page</router-link></span>
        </div>
    </div>
</template>

<script>
    export default {

    }
</script>

<style lang="scss" scoped>

    @import '@/styles/global.scss';

    .error-page {
        width: 100%;
        height: 100%;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;

        h1 {
            font-size: 5.34rem;
        }

        .error-text {
            font-size: 1rem;
        }
    }

</style>