import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue')
    },
    {
      path: '/game-area/index',
      name: 'index',
      component: () => import('@/views/index.vue')
    },
    {
      path: '/game-area/bbs',
      name: 'ga-bbs',
      component: () => import('@/views/ga_bbs/index.vue')
    },
    {
      path: '/game-area/lib',
      name: 'ga-lib',
      component: () => import('@/views/ga_lib/index.vue')
    },
    {
      path: '/game-area/share',
      name: 'ga-share',
      component: () => import('@/views/ga_share/index.vue')
    },
    {
      path: '/game-area/sign',
      name: 'ga-sign',
      component: () => import('@/views/ga_sign/index.vue')
    },
  ]
})

export default router
