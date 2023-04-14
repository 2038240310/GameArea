import { createRouter, createWebHistory } from 'vue-router'
import Layout from '@/layout/index.vue'
import Home from '@/view/home/index.vue'
import Login from '@/view/login/index.vue'
import content from '@/view/home/content/index.vue'
import Partition from '@/view/home/Partition/index.vue'
import Error from '@/view/error/error.vue'
import posteditor from '@/view/home/posteditor/index.vue'
import postDetail from '@/view/home/postDetail/index.vue'
import game from '@/view/gamearea/home/index.vue'
import gamedetail from '@/view/gamearea/detail/index.vue'
import wiki from '@/view/gamearea/wiki/index.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [

    {
      path: '/home',
      redirect: '/'
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
              path: '/home/bbs', 
              component: content, 
              name: 'content',
            },
            {
              path: '/home/posteditor', 
              component: posteditor, 
              name: 'posteditor',
              //守卫
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
          component: game,
          name: 'game',
        },
        {
          // 分享站
          path: '/share',
          component: gamedetail,
          name: 'gamedetail',
        },
        {
          // 资料库
          path: '/lib',
          component: wiki,
          name: 'wiki',
        },
        {
          // 资讯消息站
          path: '/sign', 
          component: Partition, 
          name: 'Partition',
        },
        {
          path: '/login', 
          component: Login, 
          name: 'login',
          //children:[{}]   也可以继续添加children嵌套
        },
        {
          path: '/error', 
          component: Error, 
          name: 'error',
          //children:[{}]   也可以继续添加children嵌套
        },
      ]
    }
  ]
})

export default router
