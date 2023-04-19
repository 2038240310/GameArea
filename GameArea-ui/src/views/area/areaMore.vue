<!-- 更多分区详细页面 -->
<template>
    <MDBAccordion v-model="accordionItem">
        <MDBAccordionItem headerTitle="所有分区" collapse-id="1">
            <MDBRow style="height: 220px;">
                <MDBCardGroup>
                    <div v-for="item in areaData" style="display: flex;">
                        <MDBCard class="m-1" style="width: 100px;height: 100px;" @click="toArea(item.areaId)">
                            <MDBCardImg :src="item.areaPicPath" top alt="..." style="object-fit: cover;height: 75%;" />
                            <MDBCardTitle>{{ item.areaName }}</MDBCardTitle>
                        </MDBCard>
                    </div>
                </MDBCardGroup>
            </MDBRow>
        </MDBAccordionItem>
    </MDBAccordion>
    <hr />
    <MDBBtn color="link" @click="toCreateArea">
        没有您想要的分区?点击这里
    </MDBBtn>
</template>

<script setup lang="ts">
import { MDBAccordion, MDBAccordionItem, MDBRow, MDBCardGroup, MDBCard, MDBCardImg, MDBCardTitle, MDBBtn} from 'mdb-vue-ui-kit';
import { reactive, ref } from 'vue';
import router from '../../router';

const accordionItem = ref('1')

const areaData = reactive([
{
        areaId: '1',
        areaName: '饥荒',
        areaPicPath: 'http://127.0.0.1:8080/img/bbs_icon/dont%20starve.png'
    },
    {
        areaId: '2',
        areaName: '原神',
        areaPicPath: 'http://127.0.0.1:8080/img/bbs_icon/OP.jpg'
    },
    {
        areaId: '3',
        areaName: 'l4d2',
        areaPicPath: 'http://127.0.0.1:8080/img/bbs_icon/l4d2.jpg'
    },
    {
        areaId: '4',
        areaName: 'war3',
        areaPicPath: 'http://127.0.0.1:8080/img/bbs_icon/war3.jpg'
    },
    {
        areaId: '5',
        areaName: 'LOL',
        areaPicPath: 'http://127.0.0.1:8080/img/bbs_icon/'
    },
    {
        areaId: '6',
        areaName: 'apex',
        areaPicPath: 'http://127.0.0.1:8080/img/bbs_icon/apex.jpg'
    },
])

function toCreateArea() {
    // 跳转至areaMore.vue
    router.push({
        name: 'create-area'
    })
}

// 跳转至选择分区
function toArea(areaId: string) {
    console.log('to area areaId:' + areaId);

    router.push({
        name: 'area',
        query: {
            areaId: areaId
        }
    })
}

</script>

<style scoped></style>