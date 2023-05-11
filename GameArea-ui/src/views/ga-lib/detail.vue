<template>
    <div>
        <iframe class="w-full h-500" seamless src="file:///C:/personal/codespace/gamedata/dst/food/cooking/Bacon%20and%20Eggs.html">

        </iframe>

    </div>
</template>

<script setup lang="ts">
import { MDBAccordion, MDBAccordionItem, MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg, MDBTextarea, MDBBtnGroup, MDBBtn } from "mdb-vue-ui-kit";
import { onMounted, reactive, ref } from "vue";
import { useRoute } from 'vue-router'
//api
import { getLibPath } from '@/api/ga/libPath'
import router from "../../router";

const route = useRoute()

let libHtml = ref<string>('')

// 回复列表
const replyList = reactive<any>({
    list: []
})

// 静态信息
replyList.list = [
    {
        userId: '1',
        message: '你好',
    },
    {
        userId: '2',
        message: '欢迎',
    },
]

onMounted(() => {
    getLibPath(route.query.pathId).then((res:any) => {
        libHtml.value = res.data.dataPath
    })
})

// function handleReturnLib() {
//     router.push({
//         name: 'ga-lib',
//     })
// }

</script>

<style scoped></style>