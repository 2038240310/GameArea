<template>
    <div>
        <MDBContainer>
            <!-- row search -->
            <MDBRow style="display: flex;flex-direction: column;align-items: flex-end;">
                <MDBCol col="4">
                    <MDBInput v-model="search3" inputGroup :formOutline="false" wrapperClass="mb-3" placeholder="Search"
                        aria-label="Search" aria-describedby="button-addon2">
                        <MDBBtn outline="primary">搜索</MDBBtn>
                    </MDBInput>
                </MDBCol>
            </MDBRow>

            <!-- row1 -->
            <MDBRow style="margin-bottom: 1rem;">
                <MDBCol col="9">
                    <MDBCarousel v-model="carousel5" :items="items5" />
                </MDBCol>
                <MDBCol col="3">
                    <MDBCard style="height: 80%;">
                        <!-- <MDBCardImg /> -->
                        <br />
                        <MDBCardTitle>
                            Welcome, gamearea!
                        </MDBCardTitle>
                        <br />
                        <MDBCardText style="width: 70%;align-self: center;">
                            gamearea平台提供交流论坛、资料数据、资源分享站点
                            <br />
                            <br />
                            <small>祝您在这里玩的开心！</small>
                        </MDBCardText>
                    </MDBCard>
                </MDBCol>
            </MDBRow>

            <!-- row2 -->
            <MDBRow>
                <MDBCard class="mb-4">
                    <MDBRow>
                        <MDBCol col="10">
                            <MDBCardTitle>热门分区</MDBCardTitle>
                        </MDBCol>
                        <MDBCol col="2">
                            <!-- 跳入areaTotalPage -->
                            <MDBBtn color="link" @click="toAreaMore">更多>></MDBBtn>
                        </MDBCol>
                    </MDBRow>
                    <hr />
                    <MDBRow style="height: 220px;">
                        <MDBCardGroup>
                            <div v-for="item in mainPageData.areaList">
                                <MDBCard class="m-1" style="width: 100px;height: 100px;" @click="toArea(item.id)">
                                    <MDBCardImg :src="item.areaPicPath" top alt="..."
                                        style="object-fit: cover;height: 75%;" />
                                    <MDBCardTitle>{{ item.areaName }}</MDBCardTitle>
                                </MDBCard>
                            </div>
                        </MDBCardGroup>
                    </MDBRow>
                    <!-- <MDBCardGroup style="display: flex;flex-wrap: wrap;flex-direction: row;">
                            <MDBCard v-for="item in mainPageData.areaList" class="m-1" border="select" @click="toArea(item.areaId)"
                                style="width: 100px;height: 100px;">
                                
                                    <MDBCardImg overlay :src="item.picPath" />
                                    <MDBCardHeader>{{ item.areaName }}</MDBCardHeader>

                            </MDBCard>
                        </MDBCardGroup> -->
                </MDBCard>
            </MDBRow>

            <!-- row3 -->
            <MDBRow class="mb-4" style="align-items: flex-start;">
                <MDBCol col="3" style="height: 300px;">
                    <MDBCard>
                        <MDBRow>
                            <MDBCol col="8">
                                <MDBCardTitle>平台公告</MDBCardTitle>
                            </MDBCol>
                            <MDBCol col="4">
                                <MDBBtn color="link" @click="toNoticeMore">更多</MDBBtn>
                            </MDBCol>
                        </MDBRow>

                        <el-table :data="mainPageData.noticeList" height="300" stripe @current-change="toNoticeDetail">
                            <!-- <el-table-column prop="noticeId" label="id" type="index" /> -->
                            <el-table-column width="200" prop="title" label="标题" />
                            <el-table-column prop="createTime" label="发布日期" />
                        </el-table>
                    </MDBCard>
                </MDBCol>

                <MDBCol col="9">
                    <MDBCard>
                        <MDBCardTitle>热门话题</MDBCardTitle>
                        <MDBCard>
                            <MDBTable class="align-middle mb-0 bg-white">
                                <thead>
                                    <th scope="col"><b>标题</b></th>
                                    <th scope="col"><b>来源</b></th>
                                </thead>
                                <tbody>
                                    <tr v-for="item in mainPageData.hotCardList" @click="toTopicCard(item.cardId)">
                                        <td>{{ item.title }}</td>
                                        <td>{{ item.createTime }}</td>
                                    </tr>
                                </tbody>
                            </MDBTable>
                        </MDBCard>
                    </MDBCard>
                </MDBCol>
            </MDBRow>
        </MDBContainer>
    </div>
</template>

<script setup lang="ts">
import { MDBCarousel, MDBInput, MDBBtn, MDBIcon, MDBRow, MDBCol, MDBContainer, MDBCard, MDBCardTitle, MDBCardImg, MDBCardGroup, MDBCardText, MDBCardBody, MDBTable, MDBCardHeader } from 'mdb-vue-ui-kit';
import { reactive, ref, onMounted } from 'vue';
import router from '../router';
// 服务器api
import { listAreaArea } from '@/api/ga/areaArea.js'
// 缓存
import areaStore from '../store/area'


const area = areaStore()

// 轮播图demo
const items5 = [
    {
        src: "https://mdbootstrap.com/img/Photos/Slides/img%20(15).webp",
        alt: "...",
        label: "欢迎来到GameArea游戏攻略交流平台",
        caption: "快找寻您感兴趣的分区，与同好们交流吧！"
    },
    {
        src: "https://mdbootstrap.com/img/Photos/Slides/img%20(22).webp",
        alt: "...",
        label: "请注意您的交流礼仪",
        caption: "请各位用户注意自身的网络交流文明礼仪，如有遇到问题，请资讯管理员"
    },
    {
        src: "https://mdbootstrap.com/img/Photos/Slides/img%20(23).webp",
        alt: "...",
        label: "关于GameArea的建设",
        caption: "GameArea平台的建设需要您的一份力量，请给我们您宝贵的意见，我们将不断变得更好"
    }
];

const carousel5 = ref(0);

const search3 = ref('');

const mainPageData = reactive<any>({
    boardList: [],
    areaList: [],
    hotCardList: [],
    noticeList: []
})

// 静态数据
mainPageData.areaList = [
    {
        id: 1,
        areaName: '饥荒',
        areaPicPath: 'http://127.0.0.1:8080/img/bbs_icon/dont%20starve.png'
    },
    {
        id: 2,
        areaName: '原神',
        areaPicPath: 'http://127.0.0.1:8080/img/bbs_icon/OP.jpg'
    },
    {
        id: 3,
        areaName: 'l4d2',
        areaPicPath: 'http://127.0.0.1:8080/img/bbs_icon/l4d2.jpg'
    },
    {
        id: 4,
        areaName: 'war3',
        areaPicPath: 'http://127.0.0.1:8080/img/bbs_icon/war3.jpg'
    },
]
mainPageData.hotCardList = [
    {
        cardId: '1001',
        title: '热门话题！！',
        createTime: ''
    },
    {
        cardId: '1002',
        title: '什么时候能做完啊？',
        createTime: ''
    },
    {
        cardId: '1003',
        title: '测测你的性格',
        createTime: ''
    },
    {
        cardId: '1004',
        title: '老铁们，出货了！！',
        createTime: ''
    },
]
mainPageData.noticeList = [
    {
        noticeId: 1,
        title: '请各位用户遵守网络交流礼仪',
        createTime: '',
    },
    {
        noticeId: 2,
        title: '保护好自己的个人隐私，谨防网络诈骗',
        createTime: '',
    },
    {
        noticeId: 3,
        title: '该平台目前处于开发当中，欢迎各位用户提供宝贵的改进意见',
        createTime: '',
    },
]

// 页面加载
onMounted(() => {
    getAreaAreaList();
});

// 跳转至选择分区
function toArea(areaId: string) {
    console.log('to area areaId:' + areaId);
    
    area.$patch({areaId:areaId})

    router.push({
        name: 'area',
        query: {
            areaId: areaId
        }
    })
}

// 跳转至分区选择详细页
function toAreaMore() {
    router.push({
        name: 'area-more'
    })
}

// 跳转至点击公告详细页
function toNoticeDetail(row: any) {
    console.log(row);
    // 跳转方法
}

// 跳转至全部公告页
function toNoticeMore() {
    router.push({
        name: 'notice-more'
    })
}

function toTopicCard(cardId:string) {
    console.log('to cradId: '+cardId);
    
}

// 获取分区信息
function getAreaAreaList() {
    listAreaArea().then((res: any) => {
        // console.log(res.data);
        let result = res.data.data
        // console.log(result);

        Object.entries(result).forEach(([k, v]: [any, any]) => {
            v.areaPicPath = import.meta.env.VITE_BASE_API + v.areaPicPath
        })

        mainPageData.areaList = result;
    })
}

</script>

<style scoped></style>