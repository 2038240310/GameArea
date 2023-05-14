<!-- 更多公告页 -->
<template>
    <div>
        <h3 class="h3 flex p-2 mt-4">公告详细</h3>
        <table class="table border">
            <thead>
                <th>标题</th>
                <th>发布时间</th>
            </thead>
            <tbody v-for="item in noticeData.noticeList">
                <tr>
                    <td>{{ item.title }}</td>
                    <td>{{ item.createTime }}</td>
                </tr>
            </tbody>
        </table>
    </div>
</template>

<script setup lang="ts">
import { reactive } from 'vue';



const noticeData = reactive<any>({
    noticeList: []
})

noticeData.noticeList = [
    {
        noticeId: 1,
        title: '请各位用户遵守网络交流礼仪',
        createTime: '2023-1-1 0:00',
    },
    {
        noticeId: 2,
        title: '保护好自己的个人隐私，谨防网络诈骗',
        createTime: '2023-1-1 0:00',
    },
    {
        noticeId: 3,
        title: '该平台目前处于开发当中，欢迎各位用户提供宝贵的改进意见',
        createTime: '2023-1-1 0:00',
    },
    {
        noticeId: 4,
        title: '请各位用户遵守网络交流礼仪',
        createTime: '2023-1-1 0:00',
    },
    {
        noticeId: 5,
        title: '保护好自己的个人隐私，谨防网络诈骗',
        createTime: '2023-1-1 0:00',
    },
    {
        noticeId: 6,
        title: '该平台目前处于开发当中，欢迎各位用户提供宝贵的改进意见',
        createTime: '2023-1-1 0:00',
    },{
        noticeId: 7,
        title: '请各位用户遵守网络交流礼仪',
        createTime: '2023-1-1 0:00',
    },
    {
        noticeId: 8,
        title: '保护好自己的个人隐私，谨防网络诈骗',
        createTime: '2023-1-1 0:00',
    },
    {
        noticeId: 9,
        title: '该平台目前处于开发当中，欢迎各位用户提供宝贵的改进意见',
        createTime: '2023-1-1 0:00',
    },
]

</script>

<style scoped>

</style>