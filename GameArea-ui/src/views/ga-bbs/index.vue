<!-- ga-bbs -->
<template>
    <div>
        <h3 class="h3 flex p-2 ml-4">交流论坛</h3>
        <div>
            <!-- 帖子 -->
            <div v-for="item in bbsCardList.list">
                <div class="card mb-2 mx-5 w-10/12">
                    <div class="card-title ml-5 mt-2 p-2" @click="toDetailBbsCard(item)">{{ item.title }}</div>
                    <div class="card-body flex-row justify-between">
                        <span class="">{{ item.title }}</span>
                        <span class="">
                            <i class='far fa-comment-dots mx-2'><small>2</small></i>
                            <i class='fas fa-user-alt mx-2'><small>{{ item.createBy }}</small></i>
                            <div class="dropdown dropdown-end mx-2">
                                <label :tabindex="item.cardId">...</label>
                                <ul :tabindex="item.cardId"
                                    class="dropdown-content menu p-2 shadow bg-base-100 rounded-box w-28">
                                    <ul>
                                        <li><a href="">详细</a></li>
                                        <li><a href="">收藏</a></li>
                                    </ul>
                                    <ul>
                                        <li><a href="">修改</a></li>
                                        <li><a href="">删除</a></li>
                                    </ul>
                                    <ul>
                                        <li><a href="">设精</a></li>
                                        <li><a href="">顶置</a></li>
                                    </ul>
                                </ul>
                            </div>
                        </span>
                    </div>
                </div>
            </div>

            <div class="dropdown m-2 w-1/12 fixed top-50 right-10">
                <button class="btn rounded-circle mb-1">...</button>
                <ul class="dropdown-content">
                    <li>
                        <a href="/create/bbs/sub">
                            <button class="btn rounded-circle mb-1">➕</button>
                        </a>
                    </li>
                    <li>
                        <a href="">
                            <button class="btn rounded-circle mb-1">🔍</button>
                        </a>
                    </li>
                    <li>
                        <a href="">
                            <button class="btn rounded-circle mb-1">⭐</button>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
import { MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg, MDBCardGroup, MDBDropdown, MDBDropdownToggle, MDBDropdownMenu, MDBDropdownItem } from "mdb-vue-ui-kit";
import { onMounted, reactive, ref } from "vue";
import router from "../../router";
// api
import { listBbsCard } from '@/api/ga/bbsCard'
// 缓存
import areaStore from '@/store/area'
import { it } from "node:test";

const bbsCardList = reactive<any>({
    list: []
})

const area = areaStore()

const dropdown1 = ref(false)

// 静态数据
bbsCardList.list.push(
    {
        cardId: '1',
        title: '欢迎来到论坛',
        createBy: '1',
        createByName: '管理人',
        createTime: '2023-04-16'
    },
    {
        cardId: '2',
        title: '如何看待阿斯顿法国红酒',
        createBy: '2',
        createByName: 'toto',
        createTime: '2023-04-16'
    },
    {
        cardId: '3',
        title: '大佬们，寻求帮助！',
        createBy: '2',
        createByName: 'toto',
        createTime: '2023-04-16'
    },
    {
        cardId: '4',
        title: '这个号怎么样？',
        createBy: '3',
        createByName: '新人',
        createTime: '2023-04-16'
    },
)

// 页面加载
onMounted(() => {
    getCardList()
})

// 跳转至详细页
function toDetailBbsCard(card: any) {
    console.log('to id: ' + card.cardId);
    router.push({
        name: 'bbs-detail',
        query: card
    })
}

function getCardList() {
    listBbsCard({ areaId: area.areaId }).then((res: any) => {
        let data = res.data
        bbsCardList.list = data
    })
}

</script>

<style scoped></style>