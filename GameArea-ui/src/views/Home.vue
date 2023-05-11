<template>
  <div>
    <!-- Navbar -->
    <div class="navbar">
      <div class="flex-none">
        <button class="btn btn-square btn-ghost">
          <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24"
            class="inline-block w-5 h-5 stroke-current">
            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M4 6h16M4 12h16M4 18h16"></path>
          </svg>
        </button>
      </div>
      <div class="navbar-start flex-1">
        <a class="btn btn-ghost normal-case text-xl" href="/main">GameArea</a>
      </div>

      <div class="navbar-end">
        <div>
          <button class="btn btn-ghost btn-circle">
            <div class="indicator">
              <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                stroke="currentColor">
                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                  d="M15 17h5l-1.405-1.405A2.032 2.032 0 0118 14.158V11a6.002 6.002 0 00-4-5.659V5a2 2 0 10-4 0v.341C7.67 6.165 6 8.388 6 11v3.159c0 .538-.214 1.055-.595 1.436L4 17h5m6 0v1a3 3 0 11-6 0v-1m6 0H9" />
              </svg>
              <span class="badge badge-xs badge-primary indicator-item"></span>
            </div>
          </button>
        </div>
        <div class="dropdown dropdown-end">
          <label tabindex="0" class="btn btn-ghost btn-circle avatar">
            <div class="w-10 rounded-full">
              <img src="" alt="..." />
            </div>
          </label>
          <ul tabindex="0" class="menu menu-compact dropdown-content mt-3 p-2 shadow bg-base-100 rounded-box w-52">
            <div v-if="user.token === '' || user.token == null">
              <li><a href="/login">登录</a></li>
            </div>
            <div v-else>
              <li><a href="">我的账号</a></li>
              <li><a @click="accountQuit">注销</a></li>
            </div>
          </ul>
        </div>
      </div>

    </div>
    <!--
    <MDBNavbar expand="lg" light bg="white" container>
      <MDBNavbarToggler target="#navbarNav"></MDBNavbarToggler>
      <MDBNavbarNav collapse="navbarNav" class="mb-2 mb-lg-0">
        <MDBNavbarBrand>GameArea</MDBNavbarBrand>
        <MDBNavbarItem to="/home" active>Home</MDBNavbarItem>
        <MDBNavbarItem to="/about">about</MDBNavbarItem>
      </MDBNavbarNav>

      <ul class="navbar-nav" collapse="navbarNav"> -->
    <!-- <MDBNavbarItem to="/message/notice" style="margin-right: 0;">
          <MDBIcon icon="bell"></MDBIcon>
          <MDBBadge pill notification badge="danger">1</MDBBadge>
        </MDBNavbarItem> -->
    <!-- <MDBNavbarItem>
          <MDBDropdown class="nav-item" v-model="dropdown6">
            <MDBDropdownToggle tag="a" class="nav-link" @click="dropdown6 = !dropdown6">
              <img src="" class="rounded-circle" height="22"
                alt="" loading="lazy" />
            </MDBDropdownToggle>
            <MDBDropdownMenu>
              <li v-if="user.token == null || user.token === ''">
                <MDBDropdownItem to="/login">登录</MDBDropdownItem>
              </li>
              <li v-else>
                <MDBDropdownItem to="/setting/account">我的账号</MDBDropdownItem>
                <MDBDropdownItem to="/">
                  <li @click="accountQuit">登出</li>
                </MDBDropdownItem>
              </li> -->
    <!-- <MDBDropdownItem to="/setting/sys">设置</MDBDropdownItem> -->
    <!-- </MDBDropdownMenu>
          </MDBDropdown>
        </MDBNavbarItem>
      </ul>

    </MDBNavbar> -->

    <!-- main -->
    <div class="p-5 text-center bg-light">
      <!-- 当前登录账号token：{{ user.token }} -->
      <router-view :key="$route.fullPath" />
    </div>

    <!-- foot -->
    <MDBFooter class="mt-5" :text="['center', 'lg-start']" bg="gray">
      <!-- Grid container -->
      <MDBContainer class="p-4">
        <MDBRow style="margin-left: 10px;">
          <MDBCol lg="3" md="6" class="mb-4 mb-md-0">
            <h5 class="text-uppercase">Developer</h5>
            <ul class="list-unstyled mb-0">
              <hr />
              <li>
                <a href="https://github.com/2038240310" class="text-dark">翁望舒</a>
              </li>
            </ul>
          </MDBCol>
          <MDBCol lg="3" md="6" class="mb-4 mb-md-0">
            <h5 class="text-uppercase">联系方式</h5>
            <ul class="list-unstyled mb-0">
              <hr />
              <MDBRow>
                <MDBCol col="3">qq</MDBCol>
                <MDBCol col="6">1026723244</MDBCol>
              </MDBRow>
              <MDBRow>
                <MDBCol col="3">tel</MDBCol>
                <MDBCol col="6">18596760847</MDBCol>
              </MDBRow>
            </ul>
          </MDBCol>
        </MDBRow>
      </MDBContainer>
      <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.1)">
        git depository:
        <a class="text-dark" href="https://github.com/2038240310/GameArea">
          link
        </a>
      </div>
    </MDBFooter>
  </div>
</template>

<script setup lang="ts">
import {
  MDBRow,
  MDBCol,
  MDBContainer,
  MDBFooter
} from 'mdb-vue-ui-kit';

import { ref } from 'vue';
import userStore from '../store/user';
import { ElMessage, ElMessageBox } from 'element-plus';

const user = userStore()

const dropdown6 = ref(false);

// 退出账号，重置store来实现
function accountQuit() {
  console.log('account quit');
  ElMessageBox.confirm(
    '您确定退出账号吗?',
    '警告',
    {
      confirmButtonText: 'OK',
      cancelButtonText: 'Cancel',
      type: 'warning',
    }
  )
    .then(() => {
      user.$reset()
      ElMessage({
        type: 'success',
        message: '已退出账号',
      })
    })
}

</script>

<style></style>
