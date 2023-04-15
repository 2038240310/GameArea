import { createRouter, createWebHistory } from 'vue-router'
import Layout from '@/layout/index.vue'
import Home from '@/view/home/index.vue'
import Login from '@/view/login/index.vue'
import content from '@/view/home/content/index.vue'
// import Partition from '@/view/home/Partition/index.vue'
import Error from '@/view/error/error.vue'
import posteditor from '@/view/home/posteditor/index.vue'
import postDetail from '@/view/home/postDetail/index.vue'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [

    {
      path: '/home',
      redirect: '/main'
    },
    {
      path: '/',
      redirect: '/main'
    },
    {
      component: Layout,
      path: '/',
      children: [
        {
          path: '/home',
          component: Home,
          name: 'home',
          children: [
            {
              path: '/bbs', 
              component: content, 
              name: 'content',
            },
            {
              // 分享站详细页
              path: '/share/detail',
              component: () => import('@/view/gamearea/ga-share/module-page/detail.vue'),
              name: 'share-detail'
            },
            {
              path: '/home/posteditor', 
              component: posteditor, 
              name: 'posteditor',
              // 守卫
              beforeEnter: (to, from, next) => {
                const token = localStorage.getItem("token")
                if (token) {
                  console.log("有token");
                  next()
                } else {
                  next("/login")
                }
              }
            },
            {
              path: '/home/postDetail', 
              component: postDetail, 
              name: 'postDetail',
            }
          ]
        },
        {
          // 主页
          path: '/main',
          component: () => import('@/view/gamearea/index.vue'),
          name: 'game',
        },
        {
          // 分享站
          path: '/share',
          component: () => import('@/view/gamearea/ga-share/index.vue'),
          name: 'gamedetail',
        },
        {
          // 资料库
          path: '/lib',
          component: () => import('@/view/gamearea/ga-lib/index.vue'),
          name: 'wiki',
        },
        {
          // 资讯消息站
          path: '/sign', 
          component: () => import('@/view/gamearea/ga-sign/index.vue'), 
          name: 'Partition',
        },
        {
          path: '/login', 
          component: Login, 
          name: 'login',
        },
        {
          path: '/error', 
          component: Error, 
          name: 'error',
        },
      ]
    }
  ]
})

export default router
