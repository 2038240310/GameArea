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
import { onMounted, reactive, ref } from "vue";
import router from "../../router";
// api
import { listLibPath } from '@/api/ga/libPath'

const activeItem = ref('');

const data = reactive<any>({
    dataList: []
})

// 静态数据
data.dataList = [
    {
        junitName: "烹饪食谱",
        junitId: '1',
        data: [
            {
                dataName: '香蕉冰',
                dataId: '1'
            },
            {
                dataName: '培根煎蛋',
                dataId: '2'
            },
            {
                dataName: '蝴蝶松饼',
                dataId: '3'
            },
            {
                dataName: '鱼肉玉米卷',
                dataId: '4'
            },
            {
                dataName: '蛙腿三明治',
                dataId: '5'
            },
            {
                dataName: '海鲜杂烩',
                dataId: '6',
            },
            {
                dataName: '水鬼圣代',
                dataId: '7',
            },
        ]
    },
    {
        junitName: "这个栏目还在编辑......",
        junitId: '2',
        data: [

        ]
    },
]

onMounted(() => {
    getLibList()
})

// 跳转至详细页
function toDetail(id: string) {
    console.log('to detail and id:' + id);
    router.push(
        {
            name: 'ga-lib-detail',
            query: {
                pathId: id,
                dataPath: '',
            }
        }
    )
}

// 获取数据资料
function getLibList() {
    listLibPath().then((res: any) => {

    })
}

</script>

<style scoped>
.junit-card {
    display: flex;
    flex-wrap: wrap;
    flex-direction: row;
}
</style>