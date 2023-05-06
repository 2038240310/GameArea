<template>
    <div>
        <MDBBtn color="link" @click="handleReturnShare" style="display: flex;">返回</MDBBtn>
        <!-- 帖子主栏目 -->
        <MDBCard class="mb-3" style="width: 80%;">
            <MDBRow class="g-0 mb-4 mt-4" style="display: flex; flex-wrap: nowrap;">
                <MDBCol md="8" style="width: 80%;">

                    <MDBCardTitle><b style="font-size: 25px;">{{ contextData.cardInfo.title }}</b></MDBCardTitle>
                    <MDBCardText>
                        <small class="text-muted">{{ contextData.cardInfo.createTime }}</small>
                    </MDBCardText>

                </MDBCol>
                <MDBCol md="2" style="">
                    <MDBCardImg class="rounded-circle" fluid :src="contextData.authorUser.avatarPath" alt="..."
                        style="width: 50px;" />
                    <div>{{ contextData.authorUser.userName }}</div>
                </MDBCol>
            </MDBRow>
            <hr />
            <MDBRow>
                <!-- 主要信息 -->
                <MDBCol>
                    <MDBCard>
                        <!-- 标题图片 -->
                        <MDBCardImg class="mb-5" :src="contextData.cardInfo.picPath" style="width: 30%;" />
                        <!-- 正文说明内容 -->
                        <MDBCardTitle>
                            {{ contextData.cardInfo.text }}
                        </MDBCardTitle>
                    </MDBCard>
                    <hr />
                    <MDBCard class="mb-2" style="height: 70px;">
                        <!-- 分享文件栏目功能交互 -->
                        <a href="https://pan.baidu.com/s/1CkznC8Ngztu65ZfVZP3uxA?pwd=ymht#list/path=%2F"
                            target="_blank" style="width: 150px;">内容下载</a>

                    </MDBCard>
                    <!-- 预览内容图片 -->
                    <MDBCard v-if="contextData.cardInfo.picPathList.length > 0">
                        <MDBCardText>内容预览</MDBCardText>
                        <MDBCardImg class="mb-1" v-for="pic in contextData.cardInfo.picPathList" :src="pic.picPath"
                            style="width: 40%;" />
                    </MDBCard>

                </MDBCol>
            </MDBRow>
        </MDBCard>
        <hr />

        <!-- 评论区 -->
        <h3 style="display: flex;">评论({{ replyList.list.length }})</h3>
        <MDBCard style="width: 95%;">
            <!-- 发送回复 -->

            <div>
                <MDBTextarea label="回复" type="text" />
            </div>
            <MDBBtnGroup>
                <MDBBtn color="primary">发送</MDBBtn>
            </MDBBtnGroup>
            <hr />
            <!-- 回复列表 -->
            <div v-for="item in replyList.list">
                <MDBCard class="mb-3">
                    <MDBRow class="g-0" style="display: flex; flex-wrap: nowrap;">
                        <MDBCol md="2" style="">
                            <MDBCardImg fluid src="" alt="..." />
                            <MDBCardText>{{ item.userId }}</MDBCardText>
                        </MDBCol>
                        <MDBCol md="8" style="width: 80%;display: flex;">
                            <MDBCardText>
                                {{ item.message }}
                            </MDBCardText>
                        </MDBCol>
                    </MDBRow>
                </MDBCard>
            </div>
        </MDBCard>


    </div>
</template>

<script setup lang="ts">
import { MDBAccordion, MDBAccordionItem, MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg, MDBTextarea, MDBBtnGroup, MDBBtn } from "mdb-vue-ui-kit";
import { reactive } from "vue";
import { useRoute } from 'vue-router'
import router from "../../router";

const route = useRoute()

// 回复列表
const replyList = reactive<any>({
    list: []
})

let contextData = reactive<any>({})

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
contextData = {
    authorUser: {
        userId: '1',
        avatarPath: 'http://localhost:8080/img/user/avatar_icon/user1.jpg',
        userName: 'wws'
    },
    cardInfo: {
        title: '这是一个测试标题',
        picPath: 'http://127.0.0.1:8080/img/share/test_card/top.jpg',
        text: ' 勉强还能看看的资源吧，如果大家喜欢，那么会考虑继续发。',
        createTime: '',
        updateTime: '',
        sourceLink: '',
        sourceInfo: '',
        picPathList: [
            {
                picPath: 'http://127.0.0.1:8080/img/share/test_card/pre1.jpg'
            },
            {
                picPath: 'http://127.0.0.1:8080/img/share/test_card/pre2.jpg'
            },
            {
                picPath: 'http://127.0.0.1:8080/img/share/test_card/pre3.jpg'
            },
            {
                picPath: 'http://127.0.0.1:8080/img/share/test_card/pre4.jpg'
            },
            {
                picPath: 'http://127.0.0.1:8080/img/share/test_card/pre5.jpg'
            },
            {
                picPath: 'http://127.0.0.1:8080/img/share/test_card/pre6.jpg'
            },
            {
                picPath: 'http://127.0.0.1:8080/img/share/test_card/pre7.jpg'
            },
        ]
    }
}

// 返回键处理
function handleReturnShare() {
    router.push({
        name: 'ga-share',
    })
}

</script>

<style scoped></style>