<!-- ga-bbs -->
<template>
    <div>
        <h3 style="display: flex;">交流论坛</h3>
        <!-- 帖子 -->
        <MDBCard style="width: 90%;">
            <MDBCardGroup v-for="item in bbsCardList.list" style="width: 98%;">
                <MDBCard class="mb-2" @click="toDetailBbsCard(item)">
                    <MDBRow>
                        <MDBCol col="8">
                            <MDBCardTitle>
                                <small>{{ item.title }}</small>
                            </MDBCardTitle>
                        </MDBCol>
                        <MDBCol col="2">
                            <MDBCardText>
                                <small>创建人：{{ item.createByName }}</small>
                            </MDBCardText>
                        </MDBCol>
                        <MDBCol col="2">
                            <MDBCardText>
                                <small>创建时间：{{ item.createTime }}</small>
                            </MDBCardText>
                        </MDBCol>
                    </MDBRow>
                    <MDBRow>
                        <MDBCol col="8" />
                        <MDBCol col="2">
                            <MDBCardText>
                                <small>评论数：</small>
                            </MDBCardText>
                        </MDBCol>
                        <MDBCol col="2">
                            <MDBCardText>
                                <small>点赞数：</small>
                            </MDBCardText>
                        </MDBCol>
                    </MDBRow>
                </MDBCard>
            </MDBCardGroup>
        </MDBCard>

    </div>
</template>

<script setup lang="ts">
import { MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg, MDBCardGroup } from "mdb-vue-ui-kit";
import { reactive } from "vue";
import router from "../../router";

const bbsCardList = reactive<any>({
    list: []
})

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

// 跳转至详细页
function toDetailBbsCard(card: any) {
    console.log('to id: ' + card.cardId);
    router.push({
        name: 'bbs-detail',
        query: card
    })
}
</script>

<style scoped></style>