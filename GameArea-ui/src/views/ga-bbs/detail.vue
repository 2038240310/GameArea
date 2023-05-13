<template>
    <div>
        <button class="btn m-2" @click="handleReturnBBS" style="display: flex;">返回</button>
        <!-- 帖子主栏目 -->
        <div class="card mx-auto p-2 w-11/12">
            <div class="h3 flex ml-3">
                {{ route.query.title }}
            </div>
            <div class="card-body">
                <!-- 帖子内容 -->
            </div>
            <div class="flex flex-row justify-end">
                <span class="btn-ghost mx-2">
                    <i class='fas fa-star' v-if="isCollect" @click="isCollect = false">已收藏</i>
                    <i class='far fa-star' v-else @click="isCollect = true">收藏</i>
                </span>
                <span class="btn-ghost mx-2">
                    <i class="fas fa-exclamation-triangle">举报</i>
                </span>
                <span class="">
                    <i class='far fa-clock'></i>: {{ route.query.createTime }}
                </span>
            </div>
        </div>

        <!-- 回复列表 -->
        <div class="card w-11/12 my-4 mx-auto" v-for="item in replyList.list">
            <div class="p-3">
                <div class="flex flex-row">
                    <div class="w-40">
                        <div>
                            <img class="inline w-10 h-10 rounded-full mx-2 mt-2" src="@/assets/img/R.jpg" alt="" />
                            <span>{{ item.userInfo.nickname }}</span>
                        </div>
                        <div>
                            <small>
                                {{ item.userInfo.message }}
                            </small>
                        </div>
                    </div>
                    <div class="m-4 flex w-9/12">
                        {{ item.message }}
                    </div>
                </div>
                <div class="flex justify-end mx-2">
                    <button class="btn-ghost mx-1" @click="handleOpenReplyInput">回复({{ item.replyVoList.length }})</button>
                    <button class="btn-ghost mx-1"><i class="fas fa-exclamation-triangle">举报</i></button>
                    <span class="mx-1"><small><i class='far fa-clock'></i>{{ item.createTime }}</small></span>
                </div>
                <div v-show="isReplyInput">
                    <textarea class="w-8/12 p-2 rounded-xl" name="" :id="item.replyId" rows="3" placeholder="回复"></textarea>
                    <button class="btn mb-3">发送</button>
                </div>
            </div>
            <!-- 二级 -->
            <div class="card mb-1 mx-auto w-9/12" v-for="item2 in item.replyVoList">
                <div class="h-12 p-2 flex flex-row">
                    <span class="mx-2 flex justify-start">
                        <img class="inline w-8 h-8 mr-2 rounded-full" src="@/assets/img/R.jpg" alt="">
                        {{ item2.userInfo.nickname }} :
                    </span>
                    <span class="mx-4">
                        {{ item2.message }}
                    </span>
                </div>
            </div>
        </div>

        <hr />

        <!-- 发送回复 -->
        <div>
            <textarea class="w-11/12 p-2 rounded-xl" cols="" rows="3" placeholder="回复"
                v-model="inputReplyData.message"></textarea>
            <br>
            <button class="btn">发送</button>
        </div>
    </div>
</template>

<script setup lang="ts">
import { MDBAccordion, MDBAccordionItem, MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg, MDBTextarea, MDBBtnGroup, MDBBtn, MDBCardGroup } from "mdb-vue-ui-kit";
import { onMounted, reactive, ref } from "vue";
import { useRoute } from 'vue-router'
// api
import { addBbsReply, listBbsReplyWithReply } from '@/api/ga/bbsReply'
import { addBbsReplyReply } from '@/api/ga/bbsReplyReply'
// 缓存
import userStore from "../../store/user";
import { ElMessage, ElMessageBox } from "element-plus";
import router from "../../router";

const route = useRoute()

const user = userStore()

let isCollect = ref(false)

let isReplyInput = ref(false)

// 回复列表
const replyList = reactive<any>({
    list: []
})

// 帖子信息
const cardData = reactive({
    cardId: route.query.cardId,
})

const userList = reactive<any>({
    list: []
})

const inputReplyData = reactive({
    message: ''
})

// 静态信息
replyList.list = [
    {
        replyId: '1',
        message: '你好',
        cardId: '1',
        createBy: '1',
        createTime: '2023.1.1 12:00',
        updateTime: '2023.1.1 12:00',
        status: 0,
        userInfo: {
            id: '1',
            userId: '1',
            level: '999',
            message: 'wws',
            avatarPath: '...',
            nickname: 'dev_wws',
        },
        replyVoList: [
            {
                rrId: '1',
                message: '回复，您好',
                cardId: '1',
                replyId: '1',
                replyTo: null,
                createBy: '2',
                createTime: '2023.1.1 12:01',
                updateTime: '2023.1.1 12:01',
                status: 0,
                userInfo: {
                    id: '2',
                    userId: '2',
                    level: '999',
                    message: 'wws',
                    avatarPath: '...',
                    nickname: 'dev_wws',
                },
            },
            {
                rrId: '2',
                message: '回复，您好',
                cardId: '1',
                replyId: '1',
                replyTo: null,
                createBy: '2',
                createTime: '2023.1.1 12:01',
                updateTime: '2023.1.1 12:01',
                status: 0,
                userInfo: {
                    id: '2',
                    userId: '2',
                    level: '999',
                    message: 'wws',
                    avatarPath: '...',
                    nickname: 'dev_wws',
                },
            }
        ]
    },
    {
        replyId: '2',
        message: '第二楼',
        cardId: '1',
        createBy: '1',
        createTime: '2023.1.1 12:00',
        updateTime: '2023.1.1 12:00',
        status: 0,
        userInfo: {
            id: '1',
            userId: '1',
            level: '999',
            message: 'wws',
            avatarPath: '...',
            nickname: 'dev_wws',
        },
        replyVoList: [
            {
                rrId: '3',
                message: '回复，您好',
                cardId: '1',
                replyId: '1',
                replyTo: null,
                createBy: '2',
                createTime: '2023.1.1 12:01',
                updateTime: '2023.1.1 12:01',
                status: 0,
                userInfo: {
                    id: '2',
                    userId: '2',
                    level: '999',
                    message: 'wws',
                    avatarPath: '...',
                    nickname: 'dev_wws',
                },
            },
        ]
    },
    {
        replyId: '3',
        message: '第三楼，长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试',
        cardId: '1',
        createBy: '1',
        createTime: '2023.1.1 12:00',
        updateTime: '2023.1.1 12:00',
        status: 0,
        userInfo: {
            id: '1',
            userId: '1',
            level: '999',
            message: 'wws',
            avatarPath: '...',
            nickname: 'dev_wws',
        },
        replyVoList: [],
    },
]

userList.list = [
    {
        userId: '1',
        nickname: 'wws',
        avatarPath: 'http:127.0.0.1:8080/img/user/avatar_icon/user1.jpg'
    },
    {
        userId: '2',
        nickname: 'toto',
        avatarPath: 'http:127.0.0.1:8080/img/user/avatar_icon/toto.jpg'
    },
    {
        userId: '3',
        nickname: 'nnnn',
        avatarPath: 'http:127.0.0.1:8080/img/user/avatar_icon/default.png'
    },
]

onMounted(() => {
    getReplyList()
})

// 获取回复列表
function getReplyList() {
    listBbsReplyWithReply({ cardId: route.query.cardId }).then((res: any) => {
        let data = res.data

        Object.entries(data).forEach(([k, v]: [any, any]) => {
            v.userInfo.avatarPath = import.meta.env.VITE_BASE_API + v.userInfo.avatarPath
            // 二级回复列表图片链接处理
            if (v.replyReplyVoList.length > 0) {
                Object.entries(v.replyReplyVoList).forEach(([k1, v1]: [any, any]) => {
                    v1.userInfo.avatarPath = import.meta.env.VITE_BASE_API + v1.userInfo.avatarPath
                })
            }
        })

        replyList.list = data
    })
}

// 发送回复
function handleReply() {
    addBbsReply({
        message: inputReplyData.message,
        cardId: route.query.cardId,
        createBy: user.userId,
    }).then(() => {
        ElMessage({
            message: "回复成功",
            type: "success"
        })
        router.go(0)
    }).catch(() => {
        ElMessage({
            message: "回复失败",
            type: "error"
        })
    })
}

// 返回论坛
function handleReturnBBS() {
    router.push({ name: 'ga-bbs' })
}

// 二级回复
function handleSecReply(replyId: string) {
    // console.log("reply to replyId:" + replyId);
    if (user.userId === '' || user.userId == null) {
        ElMessage({
            type: 'info',
            message: '请先登录',
        })
        // 跳转至登录页面
        router.push({ name: 'login' })
        return
    }

    ElMessageBox.prompt('', '回复', {
        confirmButtonText: '发送',
        showCancelButton: false,
    }).then((value) => {
        sendSecReply({
            message: value.value,
            cardId: cardData.cardId,
            replyId: replyId,
            createBy: user.userId,
        })
    })

}

// 发送二级回复
function sendSecReply(rReply: any) {
    addBbsReplyReply(rReply).then(() => {
        router.go(0)
        ElMessage({
            type: 'success',
            message: '发送成功',
        })
    })
    return
}

// 打开二级回复输入面板
function handleOpenReplyInput() {
    isReplyInput.value = !isReplyInput.value
}

</script>



<style scoped>
.row-reverse {
    display: flex;
    flex-direction: row-reverse;
}

.card-text-start {
    display: flex;
    flex-direction: column;
    align-items: flex-start;
}
</style>