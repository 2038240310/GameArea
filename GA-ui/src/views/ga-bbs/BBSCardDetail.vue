<template>
    <div>
        <!-- 帖子主栏目 -->
        <MDBCard class="mb-3">
            <MDBRow>
                <MDBCol col="10">
                    <MDBCardTitle class="card-text-start ms-3">{{ route.query.title }}</MDBCardTitle>
                </MDBCol>
                <MDBCol col="2">
                    创建于: {{ route.query.createTime }}
                </MDBCol>
            </MDBRow>
            <MDBRow class="g-0" style="display: flex; flex-wrap: nowrap;">
                <MDBCol md="2" style="background-color: rgba(255, 0, 0, 0.3);">
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
            </MDBRow>
        </MDBCard>
        <!-- 回复列表 -->
        <MDBCardGroup v-for="item in replyList.list">
            <MDBCard class="mb-3">
                <MDBRow class="g-0" style="display: flex; flex-wrap: nowrap;">
                    <MDBCol md="2" style="background-color: rgba(255, 0, 0, 0.3);">
                        <MDBCardImg fluid src="" alt="..." />
                        <MDBCardText>{{ item.createName }}</MDBCardText>
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
                                                        <MDBCardText>{{ replyOf.createName }}</MDBCardText>
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

// 静态信息
replyList.list = [
    {
        userId: '1',
        replyId: '1',
        message: '你好',
        createName: 'wws',
        createTime: '2023-04-16 18:00',
        replyOfList: [
            {
                rrId: '1',
                createName: 'toto',
                message: '幸会幸会',
                createTime: '2023-04-16 20:12'
            }
        ]
    },
    {
        userId: '2',
        replyId: '2',
        message: '欢迎',
        createName: 'nnnn',
        createTime: '2023-04-16 18:32',
        replyOfList: []
    },
    {
        userId: '1',
        replyId: '3',
        message: '我将注入测试数据',
        createName: 'wws',
        createTime: '2023-04-16 18:00',
        replyOfList: [
            {
                rrId: '2',
                createName: 'toto',
                message: '？',
                createTime: '2023-04-16 20:12'
            },
            {
                rrId: '3',
                createName: 'wws',
                message: '二次回复，日期不做修正',
                createTime: '2023-04-16 20:12'
            },
        ]
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