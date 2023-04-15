<template>
    <div class=" flex flex-col">
        <div class="flex  bg-base-100 b-4 ha shadow-xl  w-full my1 px2  rounded-box">
            <div class="h-a items-center grid grid-cols-2 mb1">
                <div>
                    <label>筛选标签:</label>
                    <!-- <rp-select :options="data.cardTypeList" label="typeName" value="typeId" v-model="block"></rp-select> -->
                    <el-select size="large" placeholder="选择分类">
                        <el-option v-for="item in data.cardTypeList" :key="item.typeId" :label="item.typeName"
                            :value="item.typeId" />
                    </el-select>
                </div>
                <!-- 日期范围 -->
                <!-- <div>
                    <div class="flex flex-row">
                        <div class="flex flex-col">
                            <label for="">开始日期</label>
                            <input class="input input-bordered" type="date" v-model="startDate">
                        </div>
                        <div class="flex flex-col ml2">
                            <label for="">结束日期</label>
                            <input class="input input-bordered" type="date" v-model="endDate">
                        </div>
                    </div>
                </div> -->
                <div>
                    <el-button @click="switchCardSub">分享资源</el-button>
                </div>
            </div>
        </div>
        <div class="flex flex-col w-full overflow-y-auto mb-18 mt-1 b-1 rounded-box postcontent h-100vh">
            <div class="flex w-full mx-auto px-0 py-0">
                <div v-if="postlist.length != 0" class="items-center justify-center h-full  m10">
                    <div text-6xl>loading...</div>
                </div>
                <div class="grid grid-cols-3 w-full h-full m2 p2 ">
                    <div class="card w-a h-a bg-base-100 shadow-xl m2" v-for="item in data.cardList">
                        <div @click="switchDetailCard(item.cardId)">
                            <figure>
                                <img />
                                <img v-if="item.picPath == null"
                                    src="https://lain.bgm.tv/pic/cover/l/83/cf/304217_Yu97O.jpg" alt="Shoes" />
                            </figure>
                            <div class="card-body">
                                <h3 class="card-title">
                                    {{ item.title }}
                                </h3>
                                <p>{{ item.createTime }}</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang='ts'>
import { ref, reactive, onMounted, onUnmounted } from 'vue'
import type { Ref } from 'vue';
import router from '@/router';
import rpSelect from '@/components/basic/rp-select.vue';
// api
import { listShareCard } from '@/api/ga/shareCard'
import { listShareCardType } from '@/api/ga/shareCardType'

//创建日期变数
const startDate: any = ref('');
const endDate: any = ref('');

//声明帖子列表变数
const postlist: Ref<any> = ref([]);
//声明当前页变数
const page: Ref<number> = ref(1);
//声明分区头图变数，分区名称变数
const blockimg: Ref<string> = ref('https://lain.bgm.tv/pic/cover/l/2b/03/406604_iYYvi.jpg');
const block: any = ref(1);
const blockName: any = ref('玩家论坛');
//页面加载时执行
onMounted(() => {

});
//选择器示例数据
const options: never[] = [
    // { value: 1, label: '玩家装备' },
    // { value: 2, label: '游戏攻略' },
    // { value: 3, label: '游戏新闻' },
    // { value: 4, label: '游戏评测' },
]

const data = reactive({
    cardList: [],
    cardTypeList: []
})

//监听滚动方法
function scrollHandle() {
    const postcontent = document.getElementsByClassName('postcontent')[0];
    const scrollHeight = postcontent.scrollHeight
    const scrollTop = postcontent.scrollTop
    const clientHeight = postcontent.clientHeight;
    const distance = scrollHeight - scrollTop - clientHeight;
    if (distance == 0) {
        console.log(distance);
        //滚动到底部，加载下一页
        page.value = page.value + 1;
        // get();
    }
}

onMounted(() => {
    //组件挂载时，添加scroll监听
    const postcontent = document.getElementsByClassName('postcontent')[0];
    postcontent.addEventListener("scroll", scrollHandle, true);
    handleCardList()
    handleCardTypeList()
    defaultTestData()
});

// 测试使用数据
function defaultTestData() {
    data.cardList = [
        {
            cardId: 1,
            title: '资源贴-测试-前端本地数据',
            createTime: '2023-04-15'
        },
        {
            cardId: 2,
            title: '资源贴-测试-前端本地数据1',
            createTime: '2023-04-15'
        },
        {
            cardId: 3,
            title: '资源贴-测试-前端本地数据2',
            createTime: '2023-04-15'
        },
    ]

    data.cardTypeList = [
        {
            typeName: '前端测试分类1',
            typeId: '1'
        },
        {
            typeName: '前端测试分类2',
            typeId: '2'
        },
        {
            typeName: '前端测试分类3',
            typeId: '3'
        },
    ]
}

// 跳转至资源帖发布编辑页面
function switchCardSub() {
    console.log('switch page');
}

// 跳转至详细页内
function switchDetailCard(cardId: string) {
    console.log('switch to cardId:'+cardId);
    router.push({ name: 'share-detail' });
}

// 获取资源帖分类
function handleCardTypeList() {
    listShareCardType().then((res: { data: { data: never[]; }; }) => {
        data.cardTypeList = res.data.data
        console.log(data);
    })
}

// 获取资源帖
function handleCardList() {
    listShareCard().then((res: { data: { data: never[]; }; }) => {
        data.cardList = res.data.data
        // console.log(data);
    })
}

</script>