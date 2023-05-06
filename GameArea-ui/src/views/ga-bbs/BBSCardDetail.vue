<template>
    <div>
        <MDBBtn color="link" @click="handleReturnBBS" style="display: flex;">返回</MDBBtn>
        <!-- 帖子主栏目 -->
        <MDBCard class="mb-3">
            <MDBRow>
                <MDBCol col="10">
                    <MDBCardTitle class="card-text-start ms-3">
                        <h2>{{ route.query.title }}</h2>
                    </MDBCardTitle>
                </MDBCol>
                <MDBCol col="2">
                    创建于: {{ route.query.createTime }}
                </MDBCol>
            </MDBRow>
            <!-- <MDBRow class="g-0" style="display: flex; flex-wrap: nowrap;">
                <MDBCol md="2">
                    <MDBCardImg fluid src="" alt="..." />
                </MDBCol>
                <MDBCol md="8" style="width: 80%;">
                    <MDBCardBody class="card-text-start">
                        <MDBCardText>
                            你好，我是这儿的主子
                        </MDBCardText>
                        <MDBCardText>
                            <small class="text-muted"></small>
                        </MDBCardText>
                    </MDBCardBody>
                </MDBCol>
            </MDBRow> -->
        </MDBCard>
        <!-- 回复列表 -->
        <MDBCardGroup v-for="item in replyList.list" style="width: 80%;">
            <MDBCard border="message" class="mb-3">
                <MDBRow class="g-0" style="display: flex; flex-wrap: nowrap;">
                    <MDBCol md="2">
                        <MDBCardImg fluid :src="item.userInfo.avatarPath" circle alt="..." style="width: 150px;" />
                        <MDBCardText><b>{{ item.userInfo.nickname }}</b></MDBCardText>
                    </MDBCol>
                    <MDBCol md="8" style="width: 80%; ">
                        <MDBCardBody>
                            <MDBCardText style="display: flex;">
                                {{ item.message }}
                            </MDBCardText>
                            <MDBCardText class="row-reverse">
                                <small>发表于：{{ item.createTime }}</small>
                            </MDBCardText>
                            <!-- 二级回复 -->
                            <div v-if="item.replyReplyVoList.length > 0">
                                <MDBAccordion>
                                    <MDBAccordionItem :headerTitle="'回复(' + item.replyReplyVoList.length + ')'"
                                        collapseId="collapseOne">
                                        <MDBCard v-for="replyOf in item.replyReplyVoList" class="mb-2">
                                            <MDBRow>
                                                <MDBCol col="2">
                                                    <MDBCard>
                                                        <img :src="replyOf.userInfo.avatarPath"/>
                                                        <MDBCardText><b>{{ replyOf.userInfo.nickname }}</b></MDBCardText>
                                                    </MDBCard>
                                                </MDBCol>
                                                <MDBCol col="10">
                                                    <MDBCard>
                                                        <MDBCardText style="display: flex;">
                                                            {{ replyOf.message }}
                                                        </MDBCardText>
                                                        <MDBCardText class="row-reverse">
                                                            <small>发表于：{{ replyOf.createTime }}</small>
                                                        </MDBCardText>
                                                    </MDBCard>
                                                </MDBCol>
                                            </MDBRow>

                                        </MDBCard>
                                        <div>
                                            <el-button type="select" @click="handleSecReply(item.replyId)">
                                                回复
                                            </el-button>
                                        </div>
                                    </MDBAccordionItem>
                                </MDBAccordion>
                            </div>
                            <el-button type="select" @click="handleSecReply(item.replyId)" v-else>
                                回复
                            </el-button>
                        </MDBCardBody>
                    </MDBCol>
                </MDBRow>
            </MDBCard>
        </MDBCardGroup>
        <hr />
        <!-- 分页栏 -->

        <!-- 发送回复 -->
        <div>
            <MDBTextarea label="回复" type="text" v-model="inputReplyData.message" />
            <MDBBtnGroup>
                <MDBBtn color="primary" @click="handleReply">发送</MDBBtn>
            </MDBBtnGroup>
        </div>
    </div>
</template>

<script setup lang="ts">
import { MDBAccordion, MDBAccordionItem, MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg, MDBTextarea, MDBBtnGroup, MDBBtn, MDBCardGroup } from "mdb-vue-ui-kit";
import { onMounted, reactive } from "vue";
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
// replyList.list = [
//     {
//         userId: '1',
//         replyId: '1',
//         message: '你好',
//         createBy: '1',
//         createName: 'wws',
//         avatarPath: 'http://127.0.0.1:8080/img/user/avatar_icon/user1.jpg',
//         createTime: '2023-04-16 18:00',
//         replyOfList: [
//             {
//                 rrId: '1',
//                 createBy: '2',
//                 createName: 'toto',
//                 avatarPath: 'http://127.0.0.1:8080/img/user/avatar_icon/toto.jpg',
//                 message: '幸会幸会',
//                 createTime: '2023-04-16 20:12'
//             }
//         ]
//     },
//     {
//         userId: '2',
//         replyId: '2',
//         message: '欢迎',
//         createBy: '3',
//         createName: 'nnnn',
//         avatarPath: 'http://127.0.0.1:8080/img/user/avatar_icon/default.png',
//         createTime: '2023-04-16 18:32',
//         replyOfList: []
//     },
//     {
//         userId: '1',
//         replyId: '3',
//         message: '这是测试数据',
//         createBy: '1',
//         createName: 'wws',
//         avatarPath: 'http://127.0.0.1:8080/img/user/avatar_icon/user1.jpg',
//         createTime: '2023-04-16 18:00',
//         replyOfList: [
//             {
//                 rrId: '2',
//                 createBy: '2',
//                 createName: 'toto',
//                 avatarPath: 'http:127.0.0.1:8080/img/user/avatar_icon/toto.jpg',
//                 message: '？',
//                 createTime: '2023-04-16 20:12'
//             },
//             {
//                 rrId: '3',
//                 createBy: '1',
//                 createName: 'wws',
//                 avatarPath: 'http:127.0.0.1:8080/img/user/avatar_icon/user1.jpg',
//                 message: '二次回复，日期不做修正',
//                 createTime: '2023-04-16 20:12'
//             },
//         ]
//     },
// ]
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
            if(v.replyReplyVoList.length > 0){
                Object.entries(v.replyReplyVoList).forEach(([k1,v1]:[any,any]) => {
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
    if(user.userId==='' || user.userId == null){
        ElMessage({
            type: 'info',
            message: '请先登录',
        })
        // 跳转至登录页面
        router.push({name: 'login'})
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
    addBbsReplyReply(rReply).then(()=>{
        router.go(0)
        ElMessage({
            type: 'success',
            message: '发送成功',
        })
    })
    return
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