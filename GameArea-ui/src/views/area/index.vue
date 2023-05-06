<!-- area -->
<template>
    <div>
        <span class="mb-2" style="display: flex;align-items: flex-end;">
            <img :src="areaData.areaPicPath" style="width: 100px;height: 100px;margin-right: 10px;" />
            <h2>{{ area.areaName }}</h2>
        </span>
        <MDBNavbar expand="lg" light bg="light" container class="mb-3">
            <MDBNavbarToggler @click="collapse1 = !collapse1" target="#navbarSupportedContent"></MDBNavbarToggler>
            <MDBCollapse v-model="collapse1" id="navbarSupportedContent">
                <MDBNavbarNav class="mb-2 mb-lg-0">
                    <MDBNavbarItem to="/area/bbs">
                        BBS
                    </MDBNavbarItem>
                    <MDBNavbarItem to="/area/share">
                        Share
                    </MDBNavbarItem>
                    <MDBNavbarItem to='/area/lib'>
                        Lib
                    </MDBNavbarItem>
                </MDBNavbarNav>
                <!-- Search form -->
                <form class="d-flex input-group w-auto">
                    <input type="search" class="form-control" placeholder="输入字段" aria-label="Search" v-model="searchStr" />
                    <MDBBtn outline="primary" @click="toSearch">
                        搜索
                    </MDBBtn>
                </form>
            </MDBCollapse>
        </MDBNavbar>
        <!-- <h3>进入分区ID:{{ area.areaId }}</h3> -->
        <RouterView :key="$route.fullPath" />
    </div>
</template>
  
<script setup lang="ts">
import {
    MDBBtn,
    MDBNavbar,
    MDBNavbarToggler,
    MDBNavbarNav,
    MDBNavbarItem,
    MDBCollapse,
} from 'mdb-vue-ui-kit';
import { onMounted, reactive, ref } from 'vue';
import router from '../../router'
// 缓存
import areaStore from '@/store/area'
// api
// import { getAreaArea } from '@/api/ga/areaArea'

const area = areaStore()

let areaData = reactive({
    id: area.areaId,
    areaName: area.areaName,
    areaPicPath: area.areaPicPath
})

let searchStr = ref<string>('')

const collapse1 = ref(false);

onMounted(() => {
    // getArea()
})

// Q:效果不好
// 获取分区信息
// function getArea() {
//     getAreaArea(area.areaId).then((res: any) => {
//         let data = res.data
//         data.areaPicPath = import.meta.env.VITE_BASE_API + data.areaPicPath
//         areaData.areaName = data.areaName
//         areaData.areaPicPath = data.areaPicPath
//     })
// }

function toSearch() {
    router.push({
        name: 'search',
        query: {
            data: searchStr.value
        }
    })
}

</script>
  