<!-- 分区主页 -->
<template>
    <div>
        <div class="h1 flex ml-3 p-3 mb-2">首页</div>
        <div class="flex w-full mb-3">
            <div class="card w-9/12 bg-base-100 shadow-xl h-80 mr-1 ml-2">
                <label class="card-title ml-4 p-1">欢迎标题</label>
                <div class="card-body">
                    站长还未设定欢迎标题内容
                    <button class="btn w-24 mx-auto">点击设置</button>
                </div>
            </div>
            <div class="card w-3/12 bg-base-100 shadow-xl mr-2 ml-1">
                <label class="w-full card-title ml-4 p-1">标题</label>
                <div class="card-body w-full">
                    副栏目内容
                </div>
            </div>
        </div>

        <div class="flex w-full mb-3">
            <div class="card w-9/12 bg-base-100 shadow-xl mr-1 ml-2">
                <label class="card-title ml-4 p-1">社区动态</label>
                <div class="card-body">
                    最新论坛帖子、热门论坛帖子、高人气资源(最多展示5个)
                </div>
            </div>
            <div class="w-3/12 shadow-xl mr-2 ml-1">
                <div class="card bg-base-100 mb-2 h-40">
                    <label class="card-title ml-4 p-1">贡献榜</label>
                    <div class="card-body w-full shadow" style="overflow: scroll;">
                        <!-- 人员————有效资料编写贡献数量排行(最多展示10个) -->
                        <table>
                            <thead>
                                <th>名称</th>
                                <th>贡献值</th>
                            </thead>
                            <thead v-for="item in peopleList.contributionList">
                                <th>{{ item.nickname }}</th>
                                <th>{{ item.contirNum }}</th>
                            </thead>
                        </table>
                    </div>
                </div>

                <div class="card bg-base-100 h-60">
                    <label class="card-title ml-4 p-1">管理人员名单</label>
                    <div class="card-body w-full" style="overflow: scroll;">
                        <table>
                            <thead>
                                <th>名称</th>
                                <th>职位</th>
                            </thead>
                            <thead v-for="item in peopleList.adminList">
                                <th>{{ item.nickname }}</th>
                                <th>{{ item.permission }}</th>
                            </thead>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <div class="flex w-full mb-3">
            <div class="card w-full bg-base-100">
                <label class="card-title ml-4 p-1">
                    其他热点
                </label>
                <div class="card-body">

                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
import { reactive } from 'vue';


const peopleList = reactive({
    contributionList: [
        {
            userId: '1',
            nickname: 'wws_dev',
            contirNum: '12',
        },
        {
            userId: '2',
            nickname: 'wws_test',
            contirNum: '8',
        },
        {
            userId: '3',
            nickname: 'test1',
            contirNum: '5',
        },
        {
            userId: '4',
            nickname: 'test2',
            contirNum: '5',
        },
    ],
    adminList: [
        {
            userId: '1',
            nickname: 'wws_dev',
            permission: '版主',
        },
        {
            userId: '2',
            nickname: 'wws_test',
            permission: '管理员',
        },
    ],
})

</script>

<style scoped></style>