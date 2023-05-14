<!-- 发表帖子 -->
<template>
    <div>
        <div class="h3 flex p-2 m-2">帖子发表</div>
        <MDBBtn color="link" style="display: flex;" @click="handleReturnBBS">
            返回
        </MDBBtn>
        <MDBInput inputGroup :formOutline="false" wrapperClass="mb-3" v-model="inputSubCard.title"
            aria-describedby="inputGroup-sizing-default" aria-label="Sizing example input" placeholder="请输入标题名字">
            <template #prepend>
                <span class="input-group-text" id="inputGroup-sizing-default">标题</span>
            </template>
        </MDBInput>
        <MDBTextarea class="mb-3" label="内容" rows="4" v-model="inputSubCard.message">
        </MDBTextarea>
        <MDBBtn color="primary" @click="handleSub">发表</MDBBtn>
    </div>
</template>

<script setup lang="ts">
import { MDBBtn, MDBInput, MDBTextarea } from 'mdb-vue-ui-kit';
import { onMounted, reactive } from 'vue';
import router from '../../router';
// 缓存
import userStore from '../../store/user';
import areaStore from '../../store/area';
// api
import { addBbsCard } from '@/api/ga/bbsCard'
import { ElMessage } from 'element-plus';

const user = userStore()
const area = areaStore()

const inputSubCard = reactive({
    title: '',
    message: '',
    createBy: '',
    blockId: '',
    areaId: '',
})

onMounted(() => {
    inputSubCard.createBy = user.userId
    inputSubCard.areaId = area.areaId
})

// 发表
function handleSub() {
    addBbsCard({
        title: inputSubCard.title,
        message: inputSubCard.message,
        createBy: inputSubCard.createBy,
        blockId: inputSubCard.blockId,
        areaId: inputSubCard.areaId,
    }).then(() => {
        ElMessage({
            message: "发布成功",
            type: "success",
        })
        router.push({name: 'ga-bbs'})
    }).catch(() => {
        ElMessage({
            message: "发布失败",
            type: "error",
        })
    })
}

// 返回按键处理
function handleReturnBBS() {
    router.push({ name: 'ga-bbs' })
}

</script>

<style scoped></style>