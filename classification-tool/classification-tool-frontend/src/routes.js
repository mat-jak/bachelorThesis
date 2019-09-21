import Home from '@/views/Home'
import Welocme from '@/views/Welcome'
import Introduction from '@/views/Introduction'
import Contact from '@/views/Contact'
import Completion from '@/views/Completion'
import ErrorPage from '@/views/ErrorPage'
import Demography from '@/views/Demography'

export default [
    {path: "/comments/:id", component: Home, props: true, name:'home'},
    {path: "/", component: Welocme, name:'welcome'},
    {path: "/introduction", component: Introduction, name:'introduction'},
    {path: "/contact", component: Contact, name:'contact'},
    {path: "/completion", component:Completion, name: 'completion'},
    {path: "/404", component:ErrorPage, name: 'errorPage'},
    {path: "/demography-form", component: Demography, name: 'demography'},
    {
        path: '*',
        redirect: '/404'
    }
]