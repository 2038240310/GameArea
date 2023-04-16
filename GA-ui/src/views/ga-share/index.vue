<!-- ga-share -->
<template>
    <div>
        <!-- 需要分类分标签筛选菜单 -->
        <MDBCard>
            <MDBCardText>筛选菜单</MDBCardText>
        </MDBCard>
        <!-- 项目数据列表 -->
        <MDBCardGroup>
            <div v-for="item in shareCardList.list">
                <MDBCard class="m-1" style="width: 250px;" @click="toDetail(item.boardId)">
                    <MDBCardImg :src="item.picPath" top alt="..." />
                    <MDBCardBody>
                        <MDBCardTitle>{{ item.title }}</MDBCardTitle>
                        <MDBCardText>
                            <small class="text-muted">{{ item.boardId }}</small>
                        </MDBCardText>
                    </MDBCardBody>
                </MDBCard>
            </div>
        </MDBCardGroup>
    </div>
</template>

<script setup lang="ts">
import { MDBRow, MDBCol, MDBCardGroup, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg } from "mdb-vue-ui-kit";
import { reactive } from "vue";
import router from "../../router";

const shareCardList = reactive<any>({
    list: []
})

// 静态数据
shareCardList.list.push(
    {
        boardId: '1',
        title: 'test1',
        picPath: 'C:/Users/10267/Downloads/pic/Ftu9bNuaQAET1XO.jpg'
    },
    {
        boardId: '2',
        title: 'test2',
        picPath: 'file:C:/Users/10267/Downloads/pic/FtufFPFacAECMYT.jpg'
    },
    {
        boardId: '3',
        title: 'test3',
        picPath: 'file://C:/Users/10267/Downloads/pic/FtsK7DoacAAuu1z.jpg'
    },
    {
        boardId: '4',
        title: 'test4',
        picPath: 'file://C:/Users/10267/Downloads/pic/105170754_p0.jpg'
    },
    {
        boardId: '5',
        title: 'test5',
        picPath: 'file://C:/Users/10267/Downloads/pic/FtluPmVacAAMGG9.jpg'
    },
    {
        boardId: '6',
        title: 'test6',
        picPath: '@/assets/img/Fq7AHktaMAA30_L.jpg'
    },
    {
        boardId: '7',
        title: 'test7',
        picPath: '../../assets/img/FtwBnPGacAACK4k.jpg'
    },
)

// 跳转至详细页
function toDetail(cardId: string) {
    console.log('to id: ' + cardId);
    router.push(
        {
            name: 'ga-share-detail',
            query:{
                cardId: cardId
            }
        }
    )
}
</script>

<style scoped>
.card-wrap {
    display: flex;
    flex-wrap: wrap;
}
</style>