import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      // component: HomeView
      redirect: '/game-area/index'
    },
    {
      // component: Layout,
      path: '/game-area',
      children: [
        {
          path: '/game-area/index',
          name: 'index',
          component: () => import('@/views/index.vue'),
          children: [
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
            }
          ]
        }
      ]
    }
  ]
})

export default router
