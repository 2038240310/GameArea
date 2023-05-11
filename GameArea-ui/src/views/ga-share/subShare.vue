<!-- 发布分享 -->
<template>
    <div>
        <button class="btn flex" @click="handleReturnShare">
            返回
        </button>

        <div class="mb-3">
            <div class="mb-1">
                标题
                <input type="text" placeholder="title" class="input w-full" />
            </div>

            <div class="mb-1">
                分享内容
                <input type="textarea" placeholder="message" class="input w-full" />
            </div>

            <div>
                图片内容上传(第一张默认为封面)
                <input type="file" class="file-input w-full" />
            </div>
        </div>

        <hr>

        <div v-for="item in loadNum" class="my-3">
            <div class="mb-1">
                输入外部云盘链接
                <input type="text" placeholder="source link" class="input w-full" />
            </div>
            输入链接加密密码(没有就不填)
            <div class="mb-1">
                <input type="text" placeholder="link password" class="input w-full" />
            </div>
            <hr>
        </div>

        <div class="btn" v-if="loadNum < 3" @click="loadNum = loadNum + 1">添加链接(最多三个)</div>

        <MDBBtn color="primary" @click="">分享</MDBBtn>
    </div>
</template>

<script setup lang="ts">
import { MDBBtn, MDBInput, MDBTextarea } from 'mdb-vue-ui-kit';
import { onMounted, reactive, ref } from 'vue';
import router from '../../router/index'

let loadNum = ref(1)

// 上传资源链接
const subData = reactive({
    shareList: []
})

// 返回按键处理
function handleReturnShare() {
    router.push({ name: 'ga-share' })
}
</script>

<style scoped></style>