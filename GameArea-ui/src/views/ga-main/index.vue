<!-- 分区主页 -->
<template>
    <div>
        <div class="h1 flex ml-3 pt-5">首页</div>
        <div class="flex w-full">
            <div class="card w-9/12 bg-base-100 shadow-xl h-80 mr-1 ml-2 my-2">
                <label class="card-title">欢迎标题</label>
                <div class="card-body">
                    站长还未设定欢迎标题内容
                </div>
            </div>
            <div class="card w-3/12 bg-base-100 shadow-xl mr-2 ml-1 my-2">
                <label class="w-full card-title">标题</label>
                <div class="card-body w-full">
                    副栏目内容
                </div>
            </div>
        </div>

        <br />

        <div class="flex w-full">
            <div class="card w-9/12 bg-base-100 shadow-xl mr-1 ml-2 my-2">
                <label class="card-title">社区动态</label>
                <div class="card-body">
                    最新论坛帖子、热门论坛帖子、高人气资源(最多展示5个)
                </div>
            </div>
            <div class="w-3/12 bg-base-100 shadow-xl mr-2 ml-1 my-2">
                <div class="card mb-2">
                    <label class="card-title">贡献榜</label>
                    <div class="card-body w-full">
                        人员————有效资料编写贡献数量排行(最多展示10个)
                    </div>
                </div>

                <div class="card h-60">
                    <label class="card-title">管理人员名单</label>
                    <div class="card-body w-full" style="overflow: scroll;">
                        表单————滑动下拉栏
                    </div>
                </div>
            </div>
        </div>

        <br />

        <div class="flex w-full">
            <div class="card w-full">
                <label class="card-title">
                    其他热点
                </label>
                <div class="card-body">

                </div>
            </div>
        </div>

    </div>
</template>

<script setup lang="ts">

</script>

<style scoped></style>