<!-- ga-share -->
<template>
    <div>
        <h3>分享站</h3>
        <!-- 需要分类分标签筛选菜单 -->
        <MDBCard class="mb-3">
            <MDBAccordion v-model="collapseId">
                <MDBAccordionItem header-title="筛选菜单" collapse-id="collapseOne">
                    <div style="display: flex;">
                        <MDBBtn color="primary">最新</MDBBtn>
                        <MDBBtn color="primary">最热门</MDBBtn>
                    </div>
                </MDBAccordionItem>
            </MDBAccordion>
        </MDBCard>
        <!-- 项目数据列表 -->
        <MDBCardGroup>
            <div v-for="item in shareCardList.list">
                <MDBCard class="m-1" style="width: 200px;height: 200px;" @click="toDetail(item.cardId)">
                    <MDBCardImg :src="item.picPath" top alt="..." style="object-fit: cover;height: 75%;" />
                    <MDBCardTitle>{{ item.title }}</MDBCardTitle>
                </MDBCard>
            </div>
        </MDBCardGroup>
    <!-- <MDBCardGroup>
            <div v-for="item in shareCardList.list" style="">
                <MDBCard class="m-1" style="width: 250px;height: 280px;" @click="toDetail(item.boardId)">
                    <MDBCardImg :src="item.picPath" top alt="..." style="object-fit: contain;" />
                    <MDBCardBody>
                        <MDBCardTitle>{{ item.title }}</MDBCardTitle>
                        <MDBCardText>
                            <small class="text-muted">{{ item.boardId }}</small>
                        </MDBCardText>
                    </MDBCardBody>
                </MDBCard>
            </div>
            </MDBCardGroup> -->
    </div>
</template>

<script setup lang="ts">
import { MDBRow, MDBCol, MDBCardGroup, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg, MDBAccordion, MDBAccordionItem, MDBBtn, MDBBtnGroup } from "mdb-vue-ui-kit";
import { reactive, ref } from "vue";
import router from "../../router";

const shareCardList = reactive<any>({
    list: []
})

const collapseId = ref('')

// 静态数据
shareCardList.list.push(
    {
        cardId: '1',
        title: '工具分享1',
        typeId: '',
        createBy: '1',
        createTime: '',
        updateBy: '1',
        updateTime: '',
        status: '0',
        picPath: 'http://127.0.0.1:8080/img/share/test_/3iELyDYICA_small.jpg'
    },
    {
        cardId: '2',
        title: '材料分享',
        typeId: '',
        createBy: '1',
        createTime: '',
        updateBy: '1',
        updateTime: '',
        status: '0',
        picPath: 'http://127.0.0.1:8080/img/share/test_/0182f65aafb650a80120be1458f31a.jpg@1280w_1l_2o_100sh.jpg'
    },
    // {
    //     cardId: '1',
    //     title: '美图分享-1',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/103363733_p0.png'
    // },
    // {
    //     cardId: '2',
    //     title: '美图分享-2',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/105532114_p0.png'
    // },
    // {
    //     cardId: '3',
    //     title: '美图分享-3',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/105700188_p0.png'
    // },
    // {
    //     cardId: '4',
    //     title: '美图分享-4',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/FB5mHUhUUAQBXa4.jpg'
    // },
    // {
    //     cardId: '5',
    //     title: '美图分享-5',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/FdLwuLiaAAEE3gZ.jpg'
    // },
    // {
    //     cardId: '6',
    //     title: '美图分享-6',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/FdqhmGrakAA9kEl.jpg'
    // },
    // {
    //     cardId: '7',
    //     title: '美图分享-7',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/FfLbgezaAAErMXb.jpg'
    // },
    // {
    //     cardId: '8',
    //     title: '美图分享-8',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/FhbT8vnUoAE9hiu.jpg'
    // },
    // {
    //     cardId: '9',
    //     title: '美图分享-9',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/Fn-pHvDaMAE5VvQ.jpg'
    // },
    // {
    //     cardId: '10',
    //     title: '美图分享-10',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/Fp1BdUUaIAA3i19.jpg'
    // },
    // {
    //     cardId: '11',
    //     title: '美图分享-11',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/Fp4zIEVaEAIywe7.jpg'
    // },
    // {
    //     cardId: '12',
    //     title: '美图分享-12',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/Fp40q6magAgnbK_.jpg'
    // },
    // {
    //     cardId: '13',
    //     title: '美图分享-13',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/FpEkrDTagAAjC9z.jpg'
    // },
    // {
    //     cardId: '14',
    //     title: '美图分享-14',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/Fpi9UOhaYAA1IdC.jpg'
    // },
    // {
    //     cardId: '15',
    //     title: '美图分享-15',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/FpJ3Yt1aIAEktWT.jpg'
    // },
    // {
    //     cardId: '16',
    //     title: '美图分享-16',
    //     typeId: '',
    //     createBy: '1',
    //     createTime: '',
    //     updateBy: '1',
    //     updateTime: '',
    //     status: '0',
    //     picPath: 'http://127.0.0.1:8080/img/share/test/FpouOJpaUAI-Fnq.jpg'
    // },
)

// 跳转至详细页
function toDetail(cardId: string) {
    console.log('to id: ' + cardId);
    router.push(
        {
            name: 'ga-share-detail',
            query: {
                cardId: cardId
            }
        }
    )
}

</script>

<style scoped>
.card-wrap {
    display: flex;
    flex-wrap: wrap;
}
</style>