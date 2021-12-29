import Vue from 'vue'
import VueRouter from "vue-router"

import index from '../components/index.vue'
import show from '../components/show'
import control from '../components/control'

Vue.use(VueRouter)

const routes = [
    {
        name: "Index",
        path: "/",
        component: index,
        redirect: "/control",
        children: [
            {
                name: "show",
                path: "/show",
                component: show
            },
            {
                name: "control",
                path: "/control",
                component: control
            },
        ]
    }
]

export default new VueRouter({
    name: "router",
    routes
})