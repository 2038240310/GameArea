<template>
    <div>
        <div class="overflow-x-auto w-11/12 mx-auto bg-base-100 shadow-xl rounded-box">
            <table class="table w-full">
                <!-- head -->
                <thead>
                    <tr>
                        <th>消息类型</th>
                        <th>公告内容</th>
                        <th>发布时间</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="item in noticeData.list">
                        <td>{{ item.createFrom,item.createBy }}</td>
                        <td>{{ item.message }}</td>
                        <td>{{ item.createTime }}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script setup lang="ts">
import { reactive } from 'vue';



const noticeData = reactive({
    list: [
        {
            id: '1',
            message: '欢迎来到游戏分区，请遵守相关规定',
            createTime: '2023-1-1 12:00',
            createBy: '',
            createFrom: 'sys',
        },
        {
            id: '1',
            message: '欢迎来到游戏分区，请遵守相关规定',
            createTime: '2023-1-1 12:00',
            createBy: 'wws',
            createFrom: 'host',
        },
        {
            id: '1',
            message: '欢迎来到游戏分区，请遵守相关规定',
            createTime: '2023-1-1 12:00',
            createBy: '',
            createFrom: 'admin',
        },
    ]
}
)

</script>

<style scoped></style>