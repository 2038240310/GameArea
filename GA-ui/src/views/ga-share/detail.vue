<template>
    <div>
        <h3 style="display: flex;">{{ route.query.cardId }}</h3>
        <!-- 帖子主栏目 -->
        <MDBCard class="mb-3">
            <MDBRow class="g-0" style="display: flex; flex-wrap: nowrap;">
                <MDBCol md="8" style="width: 80%; background-color: rgba(0, 255, 0, 0.3);">
                    <MDBCardBody>
                        <MDBCardTitle>该栏目标题</MDBCardTitle>
                        <MDBCardText>
                            <small class="text-muted">createTime</small>
                        </MDBCardText>
                    </MDBCardBody>
                </MDBCol>
                <MDBCol md="2" style="background-color: rgba(255, 0, 0, 0.3);">
                    <MDBCardImg fluid src="" alt="...">头像</MDBCardImg>
                    <div>发帖人信息</div>
                </MDBCol>

            </MDBRow>
            <MDBRow>
                <!-- 主要信息 -->
                <MDBCol>
                    <MDBCard>
                        <MDBCardTitle>
                            信息
                        </MDBCardTitle>
                        <MDBCardText>
                            帖子内容-长文章
                        </MDBCardText>
                    </MDBCard>
                    <MDBCard>
                        分享文件栏目功能交互
                    </MDBCard>
                </MDBCol>
            </MDBRow>
        </MDBCard>
        <hr />
        <!-- 回复列表 -->
        <MDBCard style="width: 95%;">
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
                            </MDBCardBody>
                        </MDBCol>
                    </MDBRow>
                </MDBCard>
            </div>
            <!-- 发送回复 -->
            <hr />
            <div>
                <MDBTextarea label="回复" type="text" />
            </div>
            <MDBBtnGroup>
                <MDBBtn color="primary">发送</MDBBtn>
            </MDBBtnGroup>
        </MDBCard>


    </div>
</template>

<script setup lang="ts">
import { MDBAccordion, MDBAccordionItem, MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg, MDBTextarea, MDBBtnGroup, MDBBtn } from "mdb-vue-ui-kit";
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
        message: '你好',
    },
    {
        userId: '2',
        message: '欢迎',
    },
]

</script>

<style scoped></style>