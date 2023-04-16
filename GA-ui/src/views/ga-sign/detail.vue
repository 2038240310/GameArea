<template>
    <div>
        <!-- 帖子主栏目 -->
        <MDBCard class="mb-3">
            <MDBRow class="g-0" style="display: flex; flex-wrap: nowrap;">
                <MDBCol md="2" style="background-color: rgba(255, 0, 0, 0.3);">
                    <MDBCardImg fluid src="" alt="..." />
                </MDBCol>
                <MDBCol md="8" style="width: 80%; background-color: rgba(0, 255, 0, 0.3);">
                    <MDBCardBody>
                        <MDBCardTitle>帖主: 亲切的问候</MDBCardTitle>
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
        <div v-for="item in replyList.list">
            <MDBCard class="mb-3">
                <MDBRow class="g-0" style="display: flex; flex-wrap: nowrap;">
                    <MDBCol md="2" style="background-color: rgba(255, 0, 0, 0.3);">
                        <MDBCardImg fluid src="" alt="..." />
                        <MDBCardText>{{ item.userId }}</MDBCardText>
                    </MDBCol>
                    <MDBCol md="8" style="width: 80%; ">
                        <MDBCardBody>
                            <MDBCardText>
                                {{ item.message }}
                            </MDBCardText>

                            <!-- 二级回复 -->
                            <div v-if="item.replyOfList.length>0" >
                                <MDBAccordion>
                                    <MDBAccordionItem headerTitle="查看回复" collapseId="collapseOne">
                                        <div>{{ item.replyOfList.length }}</div>
                                        <MDBCard v-for="replyOf in item.replyOfList">
                                            <div>{{ replyOf.message }}</div>
                                        </MDBCard>
                                    </MDBAccordionItem>
                                </MDBAccordion>
                            </div>

                        </MDBCardBody>
                    </MDBCol>
                </MDBRow>
            </MDBCard>
        </div>
        <!-- 发送回复 -->
        <div>
            <MDBTextarea label="回复" type="text" />
        </div>
        <MDBBtnGroup>
            <MDBBtn color="primary">发送</MDBBtn>
        </MDBBtnGroup>
    </div>
</template>

<script setup lang="ts">
import { MDBAccordion, MDBAccordionItem, MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg, MDBTextarea, MDBBtnGroup, MDBBtn } from "mdb-vue-ui-kit";
import { reactive } from "vue";

// 回复列表
const replyList = reactive<any>({
    list: []
})

// 静态信息
replyList.list = [
    {
        userId: '1',
        message: '你好',
        replyOfList: [
            {
                rrId: '1',
                message: '幸会幸会'
            }
        ]
    },
    {
        userId: '2',
        message: '欢迎',
        replyOfList: []
    },
]

</script>

<style scoped></style>