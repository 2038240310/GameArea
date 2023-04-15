import { createRouter, createWebHistory } from "vue-router";

const routes = [
  {
    // 主页
    path: "/",
    component: () => import("../views/Home.vue"),
    name: "home",
    children: [
      {
        // 分享站
        path: '/share',
        component: () => import('@/views/ga-share/index.vue'),
        name: 'ga-share',
      },
      {
        // 资料库
        path: '/lib',
        component: () => import('@/views/ga-lib/index.vue'),
        name: 'ga-lib',
      },
      {
        // 资讯消息站
        path: '/sign',
        component: () => import('@/views/ga-sign/index.vue'),
        name: 'ga-sign',
        children: []
      },
      {
        // 论坛
        path: '/bbs',
        component: () => import('@/views/ga-bbs/index.vue'),
        name: 'ga-bbs',
      },
      {
        path: '/sign/detail',
        component: () => import('@/views/ga-sign/detail.vue'),
        name: 'ga-sign-detail'
      }
    ]
  },

];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
