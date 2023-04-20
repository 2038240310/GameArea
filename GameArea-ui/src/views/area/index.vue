<!-- area -->
<template>
    <div>
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
                    <input type="search" class="form-control" placeholder="输入字段" aria-label="Search" />
                    <MDBBtn outline="primary">
                        搜索
                    </MDBBtn>
                </form>
            </MDBCollapse>
        </MDBNavbar>
        <h3>进入分区ID:{{ area.areaId }}</h3>
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
import { ref } from 'vue';
import { useRoute } from 'vue-router'
// 缓存
import areaStore from '@/store/area'

const area = areaStore()

const router = useRoute()

const collapse1 = ref(false);
</script>
  