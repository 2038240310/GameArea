<!-- ga-sign -->
<template>
    <div class="card-wrap">
        <div v-for="item in signCardList.list">
            <MDBCard class="mb-3" style="max-width: 540px;margin: 0px 5px;" @click="toDetail(item.boardId)">
                <MDBRow class="g-0">
                    <MDBCol md="4">
                        <MDBCardImg fluid :src='item.picPath' :alt="item.picPath" />
                    </MDBCol>
                    <MDBCol md="8">
                        <MDBCardBody>
                            <MDBCardTitle>{{ item.title }}</MDBCardTitle>
                            <MDBCardText>
                                {{ item.picPath }}
                            </MDBCardText>
                            <MDBCardText>
                                <small class="text-muted">Last updated 3 mins ago</small>
                            </MDBCardText>
                        </MDBCardBody>
                    </MDBCol>
                </MDBRow>
            </MDBCard>
        </div>
        <RouterView />
    </div>
</template>

<script setup lang="ts">
import { MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg } from "mdb-vue-ui-kit";
import { reactive } from "vue";
import router from "../../router";

const signCardList = reactive<any>({
    list: []
})

// 静态数据
signCardList.list.push(
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
function toDetail(boardId:string) {
    console.log('to id: '+boardId);
    router.push({name: 'ga-sign-detail'})
}
</script>

<style scoped>
.card-wrap {
    display: flex;
    flex-wrap: wrap;
}
</style>