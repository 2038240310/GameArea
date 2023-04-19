<template>
    <div>
        <!-- 帖子主栏目 -->
        <MDBCard class="mb-3">
            <MDBRow>
                <MDBCol col="10">
                    <MDBCardTitle class="card-text-start ms-3"><h2>{{ route.query.title }}</h2></MDBCardTitle>
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
                        <MDBCardImg fluid :src="item.avatarPath" circle alt="..." style="width: 150px;" />
                        <MDBCardText><b>{{ item.createName }}</b></MDBCardText>
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
                            <div v-if="item.replyOfList.length > 0">
                                <MDBAccordion>
                                    <MDBAccordionItem :headerTitle="'回复(' + item.replyOfList.length + ')'"
                                        collapseId="collapseOne">
                                        <MDBCard v-for="replyOf in item.replyOfList" class="mb-2">
                                            <MDBRow>
                                                <MDBCol col="2">
                                                    <MDBCard>
                                                        <MDBCardText><b>{{ replyOf.createName }}</b></MDBCardText>
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
                                            <MDBBtn class="" @click="toReply(item.replyId)">回复</MDBBtn>
                                        </div>
                                    </MDBAccordionItem>
                                </MDBAccordion>
                            </div>

                        </MDBCardBody>
                    </MDBCol>
                </MDBRow>
            </MDBCard>
        </MDBCardGroup>
        <hr />
        <!-- 分页栏 -->
        
        <!-- 发送回复 -->
        <div>
            <MDBTextarea label="回复" type="text" />
            <MDBBtnGroup>
                <MDBBtn color="primary">发送</MDBBtn>
            </MDBBtnGroup>
        </div>
    </div>
</template>

<script setup lang="ts">
import { MDBAccordion, MDBAccordionItem, MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg, MDBTextarea, MDBBtnGroup, MDBBtn, MDBCardGroup } from "mdb-vue-ui-kit";
import { reactive } from "vue";
import { useRoute } from 'vue-router'

const route = useRoute()

// 回复列表
const replyList = reactive<any>({
    list: []
})

const userList = reactive<any>({
    list: []
})

// 静态信息
replyList.list = [
    {
        userId: '1',
        replyId: '1',
        message: '你好',
        createBy: '1',
        createName: 'wws',
        avatarPath: 'http://127.0.0.1:8080/img/user/avatar_icon/user1.jpg',
        createTime: '2023-04-16 18:00',
        replyOfList: [
            {
                rrId: '1',
                createBy: '2',
                createName: 'toto',
                avatarPath: 'http://127.0.0.1:8080/img/user/avatar_icon/toto.jpg',
                message: '幸会幸会',
                createTime: '2023-04-16 20:12'
            }
        ]
    },
    {
        userId: '2',
        replyId: '2',
        message: '欢迎',
        createBy: '3',
        createName: 'nnnn',
        avatarPath: 'http://127.0.0.1:8080/img/user/avatar_icon/default.png',
        createTime: '2023-04-16 18:32',
        replyOfList: []
    },
    {
        userId: '1',
        replyId: '3',
        message: '这是测试数据',
        createBy: '1',
        createName: 'wws',
        avatarPath: 'http://127.0.0.1:8080/img/user/avatar_icon/user1.jpg',
        createTime: '2023-04-16 18:00',
        replyOfList: [
            {
                rrId: '2',
                createBy: '2',
                createName: 'toto',
                avatarPath: 'http:127.0.0.1:8080/img/user/avatar_icon/toto.jpg',
                message: '？',
                createTime: '2023-04-16 20:12'
            },
            {
                rrId: '3',
                createBy: '1',
                createName: 'wws',
                avatarPath: 'http:127.0.0.1:8080/img/user/avatar_icon/user1.jpg',
                message: '二次回复，日期不做修正',
                createTime: '2023-04-16 20:12'
            },
        ]
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

function toReply(replyId: string) {
    console.log("reply to replyId:" + replyId);

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