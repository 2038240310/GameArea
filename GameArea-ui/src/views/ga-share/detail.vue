<template>
    <div>
        <button class="btn m-2" @click="handleReturnShare" style="display: flex;">返回</button>
        <!-- 帖子主栏目 -->
        <div class="card w-11/12 mb-2 mx-5">
            <div>
                <span class="flex justify-between">
                    <span class="card-title ml-8">
                        {{ contextData.cardInfo.title }}
                        <!-- 修改选项 -->
                        <span v-if="1">
                            <i class='fas fa-edit'></i>
                        </span>
                    </span>
                    <span class="w-3/12" style="background-color: #d1ff7cc7;">
                        <div>
                            <img class="inline w-10 h-10 rounded-full mx-2 mt-2" src="@/assets/img/R.jpg" alt="" />
                            <span>user</span>
                        </div>
                        <div>userInfo</div>
                    </span>
                </span>
            </div>
            <hr>
            <div class="card-body">
                <img class="w-1/2 mx-auto m-2" src="@/assets/img/cat/cat1.jpg" alt="">
                <div>
                    {{ contextData.cardInfo.text }}
                </div>
                <hr>
                <div>
                    <span class="btn">
                        <i class='fas fa-star' v-if="isCollect" @click="isCollect = false">已收藏</i>
                        <i class='far fa-star' v-else @click="isCollect = true">收藏</i>
                    </span>
                    <span class="btn">
                        <i class='fas fa-hand-middle-finger' v-if="isLike" @click="isLike = false">已点赞</i>
                        <i class='far fa-thumbs-up' v-else @click="isLike = true">点赞</i>
                    </span>
                    <span class="btn">
                        <i class="fas fa-lightbulb">反馈</i>
                    </span>
                    <span class="btn">
                        <i class="fas fa-exclamation-triangle">举报</i>
                    </span>
                </div>
                <hr>
                <div>
                    <span>
                        <div class="p-2 mx-1 w-4/12 rounded-box" style="background-color:  #d1ff7cc7;">
                            <div class="h5">title</div>
                            <div class="mb-2"><input type="text" disabled placeholder="pan://123123"></div>
                            <div class="mb-2"><input type="text" disabled placeholder="password123"></div>
                            <div class="btn">download<i class='fas fa-download'></i></div>
                        </div>
                    </span>
                </div>
                <hr>
                <div>
                    图片展示
                    <div class="w-1/2 ml-10 mb-2" v-for="item in contextData.cardInfo.picPathList">
                        <img :src="item.picPath" alt="...">
                    </div>
                </div>
            </div>
        </div>

        <hr>

        <!-- 评论区 -->
        <div class="card w-10/12 mx-5">
            <h3 class="flex h3">评论({{ replyList.list.length }})</h3>
            <hr>
            <div class="my-2 w-11/12 ml-5">
                <MDBTextarea label="回复" type="text" />
            </div>
            <button class="btn my-1">发送</button>

            <hr />

            <!-- 回复列表 -->
            <div class="card w-full my-1" v-for="item in replyList.list" style="background-color: chartreuse;">
                <div class="flex flex-row">
                    <div>
                        <div>
                            <img class="inline w-10 h-10 rounded-full mx-2 mt-2" src="@/assets/img/R.jpg" alt="" />
                            <span>user</span>
                        </div>
                        <div>
                            <small>
                                userInfo
                            </small>
                        </div>
                    </div>
                    <div class="m-4" style="max-width: 80%;">
                        {{ item.message }}
                    </div>
                </div>
                <div class="flex justify-end mx-2">
                    <small><i class='far fa-clock'></i>{{ item.createTime }}</small>
                </div>
            </div>
        </div>

    </div>
</template>

<script setup lang="ts">
import { MDBAccordion, MDBAccordionItem, MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg, MDBTextarea, MDBBtnGroup, MDBBtn } from "mdb-vue-ui-kit";
import { reactive, ref } from "vue";
import { useRoute } from 'vue-router'
import router from "../../router";

const route = useRoute()

// 回复列表
const replyList = reactive<any>({
    list: []
})

let contextData = reactive<any>()

let isCollect = ref(false)
let isLike = ref(false)

// 静态信息
replyList.list = [
    {
        userId: '1',
        message: '你好长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试长文本测试',
        createTime: '2023-5-11 17:00',
    },
    {
        userId: '2',
        message: '欢迎',
        createTime: '2023-5-11 17:01',
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
        text: ' 今天在这里分享猫咪的图片，希望大家能明白猫咪是好的，猫咪很好',
        createTime: '',
        updateTime: '',
        sourceLink: '',
        sourceInfo: '',
        picPathList: [
            {
                picPath: '@/assets/img/cat/cat1.jpg',
            },
            {
                picPath: '@/assets/img/cat/cat2.jpg',
            },
            {
                picPath: '@/assets/img/cat/cat3.jpg',
            },
            {
                picPath: '@/assets/img/cat/cat4.jpg',
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