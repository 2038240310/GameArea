<!-- 发布分享 -->
<template>
    <div>
        <MDBBtn color="link" style="display: flex;" @click="handleReturnShare">
            返回
        </MDBBtn>
        <MDBInput inputGroup :formOutline="false" wrapperClass="mb-3" 
            aria-describedby="inputGroup-sizing-default" aria-label="Sizing example input" placeholder="请输入标题名字">
            <template #prepend>
                <span class="input-group-text" id="inputGroup-sizing-default">标题</span>
            </template>
        </MDBInput>
        <MDBTextarea class="mb-3" label="分享内容" rows="4">
        </MDBTextarea>
        
        <!-- 暂时 -->
        <MDBInput inputGroup :formOutline="false" wrapperClass="mb-3" 
            aria-describedby="inputGroup-sizing-default" aria-label="Sizing example input" placeholder="请输入链接网址">
            <template #prepend>
                <span class="input-group-text" id="inputGroup-sizing-default">资源链接</span>
            </template>
        </MDBInput>

        <MDBBtn color="primary" @click="">分享</MDBBtn>
    </div>
</template>

<script setup lang="ts">
import { MDBBtn, MDBInput, MDBTextarea } from 'mdb-vue-ui-kit';
import { onMounted, reactive } from 'vue';
import router from '../../router/index'

// 上传资源链接
const subData = reactive({
    shareList:[]
})

// 返回按键处理
function handleReturnShare() {
    router.push({ name: 'ga-share' })
}
</script>

<style scoped>

</style>