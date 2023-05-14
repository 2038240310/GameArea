<!-- ga-share -->
<template>
    <div>
        <h3 class="h3">分享站</h3>
        <!-- 分类分标签筛选菜单 -->
        <div class="flex mb-4">
            <MDBAccordion v-model="collapseId" class="w-11/12">
                <MDBAccordionItem header-title="筛选菜单" collapse-id="collapseOne">
                    <div style="display: flex;">
                        <button class="btn" v-if="sortBtn.datetimeOrder"
                            @click="sortBtn.datetimeOrder = !sortBtn.datetimeOrder">发表时间<i class='fas fa-angle-double-down'></i></button>
                        <button class="btn" v-else @click="sortBtn.datetimeOrder = !sortBtn.datetimeOrder">发表时间<i class='fas fa-angle-double-up'></i></button>
                        <button class="btn" v-if="sortBtn.commentOrder"
                            @click="sortBtn.commentOrder = !sortBtn.commentOrder">评论数<i class='fas fa-angle-double-down'></i></button>
                        <button class="btn" v-else @click="sortBtn.commentOrder = !sortBtn.commentOrder">评论数<i class='fas fa-angle-double-up'></i></button>
                        <button class="btn" v-if="sortBtn.downloadOrder"
                            @click="sortBtn.downloadOrder = !sortBtn.downloadOrder">下载量<i class='fas fa-angle-double-down'></i></button>
                        <button class="btn" v-else @click="sortBtn.downloadOrder = !sortBtn.downloadOrder">下载量<i class='fas fa-angle-double-up'></i></button>
                    </div>
                </MDBAccordionItem>
            </MDBAccordion>
            <button class="btn" @click="toShareSub">分享</button>
        </div>

        <!-- 项目数据列表 -->
        <div class="swap my-1 mr-2" v-for="item in 20" @click="toDetail(item.boardId)">
            <div class="card w-60 h-60 shadow-xl">
                <figure>
                    <img src="https://th.bing.com/th/id/R.171e8fe1aa1544a1868ab710eed82d82?rik=FLPxvVVL9C9bnQ&riu=http%3a%2f%2fwww.pp3.cn%2fuploads%2fallimg%2f200710%2f14-200G00Z321.jpg&ehk=Lb0IHCCZIdqYQOi28m%2borU8c1ARGbTEC%2f8WYzfwRuHo%3d&risl=&pid=ImgRaw&r=0"
                        alt="Shoes" />
                </figure>
                <div class="card-body h-2/6 p-2">
                    <h2 class="card-title mb-0">
                        测试数据
                    </h2>
                    <div class="card-actions justify-end">
                        <i class='far fa-comment-dots mx-2'></i>
                    </div>
                    <div class="card-actions justify-end">
                        <div class="badge badge-outline">tag</div>
                        <div class="badge badge-outline">new</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
import { MDBAccordion, MDBAccordionItem } from "mdb-vue-ui-kit";
import { reactive, ref } from "vue";
import router from "../../router";

const shareCardList = reactive<any>({
    list: []
})

const collapseId = ref('')

let sortBtn = reactive({
    datetimeOrder: true,
    commentOrder: true,
    downloadOrder: true,
})

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

// 跳转至资源发表页面
function toShareSub() {
    router.push(
        {
            name: 'share-sub',
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