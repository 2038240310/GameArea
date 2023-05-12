import { path } from 'path';
import { createRouter, createWebHistory } from "vue-router";

const routes = [
  {
    path: '/home',
    redirect: '/main',
  },
  {
    path: '/',
    component: () => import("../views/Home.vue"),
    redirect: '/main',
    children: [
      {
        // 主页
        path: '/main',
        component: () => import('@/views/main.vue'),
        name: 'main'
      },
      {
        path: "/area",
        component: () => import('@/views/area/index.vue'),
        name: "area",
        redirect: '/area/index',
        children: [
          {
            // 分区主页
            path: '/area/index',
            component: () => import('@/views/ga-main/index.vue'),
            name: 'ga-main',
          },
          {
            // 分享站
            path: '/area/share',
            component: () => import('@/views/ga-share/index.vue'),
            name: 'ga-share',
          },
          {
            // 资料库
            path: '/area/lib',
            component: () => import('@/views/ga-lib/index.vue'),
            name: 'ga-lib',
          },
          {
            // 资讯消息站
            path: '/area/sign',
            component: () => import('@/views/ga-sign/index.vue'),
            name: 'ga-sign',
            children: []
          },
          {
            // 论坛
            path: '/area/bbs',
            component: () => import('@/views/ga-bbs/index.vue'),
            name: 'ga-bbs',
          },
          {
            // 弃用，不做开发
            path: '/sign/detail',
            component: () => import('@/views/ga-sign/detail.vue'),
            name: 'ga-sign-detail'
          },
          {
            path: '/area/bbs/detail',
            component: () => import('@/views/ga-bbs/detail.vue'),
            name: 'bbs-detail'
          },
          {
            // 分享站详细页
            path: '/area/share/detail',
            component: () => import('@/views/ga-share/detail.vue'),
            name: 'ga-share-detail'
          },
          {
            // 资料库详细页
            path: '/area/lib/detail',
            component: () => import('@/views/ga-lib/detail.vue'),
            name: 'ga-lib-detail'
          },

        ]
      },
      {
        path: '/search/',
        component: () => import('@/views/area/searchPage.vue'),
        name: 'search',
      },
      {
        path: '/setting',
        children: [
          {
            path: '/setting/account',
            component: () => import('@/views/system/account.vue'),
            name: 'account'
          },
          {
            path: '/setting/sys',
            component: () => import('@/views/system/systemSetting.vue'),
            name: 'sys'
          }
        ]
      },
      {
        path: '/message',
        children: [
          {
            path: '/message/notice',
            component: () => import('@/views/message/noticeDetail.vue'),
            name: 'notice',
          },
          {
            path: '/message/more',
            component: () => import('@/views/message/noticeMore.vue'),
            name: 'notice-more',
          },
        ]
      },
      {
        path: '/more',
        name: 'more',
        children: [
          {
            // 分区更多详细
            path: '/more/area',
            component: () => import('@/views/area/areaMore.vue'),
            name: 'area-more'
          },
        ]
      },
      {
        path: '/create',
        children: [
          {
            path: '/create/area',
            component: () => import('@/views/area/createArea.vue'),
            name: 'create-area'
          },
          {
            // 发表bbs帖子
            path: '/create/bbs/sub',
            component: () => import('@/views/ga-bbs/subCard.vue'),
            name: 'bbs-card-sub'
          },
          {
            // 发表分享资源
            path: '/create/share/sub',
            component: () => import('@/views/ga-share/subShare.vue'),
            name: 'share-sub'
          },
        ]
      },
      {
        // 登录
        path: '/login',
        component: () => import('@/views/login/index.vue'),
        name: 'login'
      },
      {
        path: '/about',
        component: () => import('@/components/about.vue'),
        name: 'about'
      }
    ]
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
