<template>
  <header>
    <!-- Navbar -->
    <MDBNavbar expand="lg" light bg="white" container>
      <MDBNavbarToggler target="#navbarNav"></MDBNavbarToggler>
      <MDBNavbarNav collapse="navbarNav" class="mb-2 mb-lg-0">
        <MDBNavbarBrand>GameArea</MDBNavbarBrand>
        <MDBNavbarItem to="/home" active>Home</MDBNavbarItem>
        <MDBNavbarItem to="/about">about</MDBNavbarItem>
      </MDBNavbarNav>

      <ul class="navbar-nav" collapse="navbarNav">
        <!-- <MDBNavbarItem to="/message/notice" style="margin-right: 0;">
          <MDBIcon icon="bell"></MDBIcon>
          <MDBBadge pill notification badge="danger">1</MDBBadge>
        </MDBNavbarItem> -->
        <MDBNavbarItem>
          <MDBDropdown class="nav-item" v-model="dropdown6">
            <MDBDropdownToggle tag="a" class="nav-link" @click="dropdown6 = !dropdown6">
              <img src="https://mdbootstrap.com/img/Photos/Avatars/img (31).webp" class="rounded-circle" height="22"
                alt="" loading="lazy" />
            </MDBDropdownToggle>
            <MDBDropdownMenu>
              <MDBDropdownItem to="/setting/account">我的账号</MDBDropdownItem>
              <!-- <MDBDropdownItem to="/setting/sys">设置</MDBDropdownItem> -->
              <hr />
              <MDBDropdownItem to="accountQuit()">登出</MDBDropdownItem>
            </MDBDropdownMenu>
          </MDBDropdown>
        </MDBNavbarItem>
      </ul>
      
    </MDBNavbar>
    
    <!-- main -->
    <div class="p-5 text-center bg-light">
      
      <router-view />
    </div>

    <!-- foot -->
    <MDBFooter :text="['center', 'lg-start']" bg="gray">
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
  </header>
</template>

<script setup lang="ts">
import {
  MDBNavbar,
  MDBNavbarToggler,
  MDBNavbarNav,
  MDBNavbarItem,
  MDBDropdown,
  MDBDropdownToggle,
  MDBDropdownMenu,
  MDBDropdownItem,
  MDBIcon,
  MDBBadge,
  MDBRow,
  MDBCol,
  MDBNavbarBrand,
MDBFooter
} from 'mdb-vue-ui-kit';

import { ref } from 'vue';

function accountQuit() {
  console.log('account quit');
  
}

const dropdown6 = ref(false);

</script>

<style></style>
