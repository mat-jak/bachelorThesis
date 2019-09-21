<template>
  <div id="app">
    <div class="screen-saver">
      <img :src="rotateImg" class="phone-screen-saver"/>
    </div>
    <router-view @scroll="jumpToContext"></router-view>
  </div>
</template>

<script>
import Home from '@/views/Home'

export default {
  name: 'app',
  components: {
    Home
  },

    data() {
      return {
          rotateImg: require('@/assets/icons/rotate_phone.svg')
      }
    },

  methods: {
      jumpToContext(data) {
          let position = data.docstringLines + data.startLine;
          let allLines = data.docstringLines + 12 + data.gistLines;
          let view = document.getElementById('app');
          let scrollAmount = view.scrollHeight / allLines * position;
          window.scrollTo(0, scrollAmount)
      }
  }
}
</script>

<style lang="scss">
  @import '@/styles/global.scss';
#app {
  min-width: 100vw;
  min-height: 100vh;
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  text-align: center;
  color: #2c3e50;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  padding: 2.1rem 4.167rem;
  overflow-y: scroll;
  overflow-x: hidden;


  .screen-saver {
    display: none;
    @media screen and (max-device-width: 480px)
                  and (orientation: portrait){
      position: fixed;
      top: 0;
      left: 0;
      z-index: 10;
      height: 100vh;
      width: 100vw;
      display: flex;
      justify-content: center;
      align-items: center;
      background-color: #000000;
      img {
        width: 4.167rem;
        height: 4.167rem;
      }
    }

  }



  .label {
    font-size: 0.9rem;
    text-align: left;
    color: black;
    font-weight: bold;
    display: block;
    margin-bottom: 0.4rem;
  }
}
</style>
