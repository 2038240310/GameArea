<!-- 更多公告页 -->
<template>
    <div>
        <h3>公告详细</h3>
        <el-table :data="noticeData.noticeList">
            <el-table-column prop="title"/>
        </el-table>
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
        createTime: '',
    },
    {
        noticeId: 2,
        title: '保护好自己的个人隐私，谨防网络诈骗',
        createTime: '',
    },
    {
        noticeId: 3,
        title: '该平台目前处于开发当中，欢迎各位用户提供宝贵的改进意见',
        createTime: '',
    },
]

</script>

<style scoped>

</style>