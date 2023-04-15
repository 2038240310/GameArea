<template>
    <div v-for="item in replyList.list">
        <MDBCard class="mb-3">
            <MDBRow class="g-0">
                <MDBCol md="3" style="background-color: brown;">
                    <MDBCardImg fluid src="" alt="..." />
                </MDBCol>
                <MDBCol md="8" style="width: 80%; background-color: blue;">
                    <MDBCardBody>
                        <MDBCardTitle>亲切的问候</MDBCardTitle>
                        <MDBCardText>
                            你好，我是这儿的主子
                        </MDBCardText>
                        <MDBCardText>
                            <small class="text-muted">Last updated 3 mins ago</small>
                        </MDBCardText>
                    </MDBCardBody>
                </MDBCol>
            </MDBRow>
        </MDBCard>
    </div>
</template>

<script setup lang="ts">
import { MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg } from "mdb-vue-ui-kit";
import { reactive } from "vue";

// 回复列表
const replyList = reactive({
    list: [
        {
            userId: '1',
            message: '你好',
            replyOfList: []
        },
    ]
})

replyList

</script>

<style scoped></style>