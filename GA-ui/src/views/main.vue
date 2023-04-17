<template>
    <div>
        <MDBContainer>
            <MDBRow style="display: flex;flex-direction: column;align-items: flex-end;">
                <MDBCol col="4">
                    <MDBInput v-model="search3" inputGroup :formOutline="false" wrapperClass="mb-3" placeholder="Search"
                        aria-label="Search" aria-describedby="button-addon2">
                        <MDBBtn outline="primary">搜索</MDBBtn>
                    </MDBInput>
                </MDBCol>
            </MDBRow>
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
                        <MDBCardText>
                            gamearea平台提供交流论坛、资料数据、资源分享站点
                            <br />
                            祝愿您在这里玩的开心！
                        </MDBCardText>
                    </MDBCard>
                </MDBCol>
            </MDBRow>
            <MDBRow style="align-items: flex-start;">
                <MDBCol col="2" style="height: 300px;;">
                    <MDBCard>
                        <MDBCardTitle>平台公告</MDBCardTitle>
                        <el-table :data="data.noticeList" height="300" stripe @current-change="toAreaDetail">
                            <el-table-column prop="noticeId" label="id" type="index" />
                            <el-table-column prop="title" label="标题">
                            
                            </el-table-column>
                            <el-table-column prop="createTime" label="发布日期" />
                        </el-table>
                    </MDBCard>
                </MDBCol>
                <MDBCol col="10">
                    <MDBCard>
                        <MDBRow>
                            <MDBCol col="10">
                                <MDBCardTitle>热门分区</MDBCardTitle>
                            </MDBCol>
                            <MDBCol col="2">
                                <!-- 跳入areaTotalPage -->
                                更多
                            </MDBCol>
                        </MDBRow>


                        <MDBCardGroup>
                            <div v-for="item in data.areaList">
                                <MDBCard class="m-1" style="width: 100px;height: 100px;" @click="toArea(item.boardId)">
                                    <MDBCardImg :src="item.picPath" top alt="..." style="object-fit: cover;height: 75%;" />

                                    <MDBCardTitle>{{ item.areaName }}</MDBCardTitle>

                                </MDBCard>
                            </div>
                        </MDBCardGroup>

                        <!-- <MDBCardGroup style="display: flex;flex-wrap: wrap;flex-direction: row;">
                            <MDBCard v-for="item in data.areaList" class="m-1" border="select" @click="toArea(item.areaId)"
                                style="width: 100px;height: 100px;">
                                
                                    <MDBCardImg overlay :src="item.picPath" />
                                    <MDBCardHeader>{{ item.areaName }}</MDBCardHeader>

                            </MDBCard>
                        </MDBCardGroup> -->

                    </MDBCard>
                    <MDBCard>
                        <MDBCardTitle>热门话题</MDBCardTitle>
                        <MDBCard>
                            <MDBTable class="align-middle mb-0 bg-white">
                                <thead>
                                    <th scope="col"><b>标题</b></th>
                                    <th scope="col"><b>来源</b></th>
                                </thead>
                                <tbody>
                                    <tr v-for="item in data.hotCardList">
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
import { reactive, ref } from 'vue';
import router from '../router';

// 轮播图demo
const items5 = [
    {
        src: "https://mdbootstrap.com/img/Photos/Slides/img%20(15).webp",
        alt: "...",
        label: "First slide label",
        caption: "Nulla vitae elit libero, a pharetra augue mollis interdum."
    },
    {
        src: "https://mdbootstrap.com/img/Photos/Slides/img%20(22).webp",
        alt: "...",
        label: "Second slide label",
        caption: "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
    },
    {
        src: "https://mdbootstrap.com/img/Photos/Slides/img%20(23).webp",
        alt: "...",
        label: "Third slide label",
        caption:
            "Praesent commodo cursus magna, vel scelerisque nisl consectetur."
    }
];

const carousel5 = ref(0);

const search3 = ref('');

const data = reactive<any>({
    boardList: [],
    areaList: [],
    hotCardList: [],
    noticeList: []
})

// 静态数据
data.areaList = [
    {
        areaId: 1,
        areaName: '饥荒',
        picPath: 'http://127.0.0.1:8080/img/bbs_icon/dont%20starve.png'
    },
    {
        areaId: 2,
        areaName: '原神',
        picPath: 'http://127.0.0.1:8080/img/bbs_icon/OP.jpg'
    },
    {
        areaId: 3,
        areaName: 'l4d2',
        picPath: 'http://127.0.0.1:8080/img/bbs_icon/l4d2.jpg'
    },
    {
        areaId: 4,
        areaName: 'war2',
        picPath: 'http://127.0.0.1:8080/img/bbs_icon/war3.jpg'
    },
]
data.hotCardList = [
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
data.noticeList = [
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

function toArea(areaId: string) {
    console.log('to area areaId:' + areaId);

    router.push({
        name: 'area',
        params: {
            areaId: areaId
        }
    })
}

const toAreaDetail = (row: any) => {
    console.log(row);
    // 跳转
}

</script>

<style scoped>
.test1 {
    background-color: rgba(255, 0, 0, .3);
}

.test2 {
    background-color: rgba(0, 255, 0, .3);
}

.test3 {
    background-color: rgba(0, 0, 255, .3);
}
</style>