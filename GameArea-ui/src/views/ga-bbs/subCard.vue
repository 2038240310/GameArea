<!-- 发表帖子 -->
<template>
    <div>
        <MDBBtn color="link" style="display: flex;" @click="handleReturnBBS">
            返回
        </MDBBtn>
        <MDBInput inputGroup :formOutline="false" wrapperClass="mb-3" v-model="inputSubCard.title"
            aria-describedby="inputGroup-sizing-default" aria-label="Sizing example input"
            placeholder="请输入标题名字">
            <template #prepend>
                <span class="input-group-text" id="inputGroup-sizing-default">标题</span>
            </template>
        </MDBInput>
        <MDBTextarea class="mb-3" label="内容" rows="4" v-model="inputSubCard.message">
        </MDBTextarea>
        <MDBBtn color="primary">发表</MDBBtn>
    </div>
</template>

<script setup lang="ts">
import { MDBBtn, MDBInput, MDBTextarea } from 'mdb-vue-ui-kit';
import { onMounted, reactive } from 'vue';
import router from '../../router';
// 缓存
import userStore from '../../store/user';
import areaStore from '../../store/area';

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

function handleReturnBBS() {
    router.push({name: 'ga-bbs'})
}

</script>

<style scoped></style>