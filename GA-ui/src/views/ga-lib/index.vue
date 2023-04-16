<!-- ga-lib -->
<template>
    <div>
        <h3>资料库</h3>
        <MDBAccordion v-for="item in data.dataList" v-model="activeItem">
            <MDBAccordionItem :headerTitle="item.junitName" :collapseId="item.junitId">
                <span class="junit-card">
                    <MDBCard class="m-1 junit-card" v-for="data in item.data" @click="toDetail(data.dataId)">
                        <!-- <MDBCardImg :src="" top alt="..." /> -->
                        <MDBCardBody>
                            <MDBCardTitle>{{ data.dataName }}</MDBCardTitle>
                            <MDBCardText>
                                <small class="text-muted">{{ item.boardId }}</small>
                            </MDBCardText>
                        </MDBCardBody>
                    </MDBCard>
                </span>
            </MDBAccordionItem>
        </MDBAccordion>
    </div>
</template>

<script setup lang="ts">
import { MDBCardText, MDBCardTitle, MDBCardBody, MDBAccordion, MDBAccordionItem, MDBCard, MDBCardGroup } from "mdb-vue-ui-kit";
import { reactive, ref } from "vue";
import router from "../../router";

const activeItem = ref('');

const data = reactive<any>({
    dataList: []
})

// 静态数据
data.dataList = [
    {
        junitName: "数据单元1",
        junitId: '1',
        data: [
            {
                dataName: '数据1-1',
                dataId: '11'
            },
        ]
    },
    {
        junitName: "数据单元2",
        junitId: '2',
        data: [
            {
                dataName: '数据2-1',
                dataId: '21'
            },
            {
                dataName: '数据2-2',
                dataId: '22'
            },
            {
                dataName: '数据2-3',
                dataId: '23'
            },
            {
                dataName: '数据2-4',
                dataId: '24'
            },
        ]
    },
    {
        junitName: "数据单元3",
        junitId: '3',
        data: []
    }
]

function toDetail(id: string) {
    console.log('to detail and id:' + id);
    router.push(
        {
            name: 'ga-lib-detail',
            query: {
                id: id
            }
        }
    )
}

</script>

<style scoped>
.junit-card {
    display: flex;
    flex-wrap: wrap;
    flex-direction: row;
}
</style>