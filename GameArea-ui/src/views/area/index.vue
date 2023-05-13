<!-- area -->
<template>
    <div class="">
        <div class="bg-base-100 card rounded-box">
            <span class="pt-2 mb-2 mx-2" style="display: flex;align-items: flex-end;">
                <img :src="areaData.areaPicPath" style="width: 100px;height: 100px;margin-right: 10px;" />
                <h2 class="h2">{{ area.areaName }}</h2>
            </span>

            <div class="flex justify-end dropdown dropdown-end">
                <label tabindex="area">
                    <button class="btn-ghost mx-4">...</button>
                </label>
                <ul tabindex="area" class="menu menu-compact dropdown-content mt-4 p-2 bg-base-100 rounded-xl shadow">
                    <li v-if="!false"><a href="">关注</a></li>
                    <li v-else><a href="">取消关注</a></li>
                    <li><a href="">管理</a></li>
                </ul>
            </div>

            <div class="tabs ml-5">
                <div class="dropdown">
                    <label tabindex="0" class="tab tab-lg tab-lifted">分区菜单</label>
                    <ul tabindex="0" class="dropdown-content meun p-2 shadow bg-base-100 rounded-box w-20">
                        <li><a href="/area/index">主页</a></li>
                        <li><a href="/area/ruler">分区规则</a></li>
                        <li><a href="/area/notice">通知公告</a></li>
                    </ul>
                </div>

                <div class="dropdown">
                    <a tabindex="1" class="tab tab-lg tab-lifted">社区</a>
                    <ul tabindex="1" class="dropdown-content meun p-2 shadow bg-base-100 rounded-box w-20">
                        <li><a href="/area/bbs">交流论坛</a></li>
                        <li><a href="/area/share">资源分享</a></li>
                        <li><a href="/area/lib">游戏资料</a></li>
                    </ul>
                </div>
            </div>

        </div>
        <div class="p-1 bg-base-100">
            <RouterView :key="$route.fullPath" />
        </div>
    </div>
</template>
  
<script setup lang="ts">
import { onMounted, reactive, ref } from 'vue';
import router from '../../router'
// 缓存
import areaStore from '@/store/area'
// api
// import { getAreaArea } from '@/api/ga/areaArea'

const area = areaStore()

let areaData = reactive({
    id: area.areaId,
    areaName: area.areaName,
    areaPicPath: area.areaPicPath
})

let searchStr = ref<string>('')

const collapse1 = ref(false);

onMounted(() => {
    // getArea()
})

// Q:效果不好
// 获取分区信息
// function getArea() {
//     getAreaArea(area.areaId).then((res: any) => {
//         let data = res.data
//         data.areaPicPath = import.meta.env.VITE_BASE_API + data.areaPicPath
//         areaData.areaName = data.areaName
//         areaData.areaPicPath = data.areaPicPath
//     })
// }

function toSearch() {
    router.push({
        name: 'search',
        query: {
            data: searchStr.value
        }
    })
}

</script>
  