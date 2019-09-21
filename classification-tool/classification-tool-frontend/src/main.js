import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router'
import Routes from './routes'
import { store } from './store/store'
import VTooltip from 'v-tooltip'

Vue.use(VueRouter);
Vue.use(VTooltip)


const router = new VueRouter({
  routes: Routes,
  mode: 'history'
})

Vue.config.productionTip = false

new Vue({
    render: h => h(App),
    router: router,
    store: store
}).$mount('#app')
