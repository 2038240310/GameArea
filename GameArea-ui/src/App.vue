<template>
  <!-- route规则key绑定fullPath，路由路径改变就刷新 -->
  <router-view :key="$route.fullPath"></router-view>
</template>

<style scoped>
#app {
  font-family: Roboto, Helvetica, Arial, sans-serif;
}
</style>
<style>
.bg-img {
  background: url('assets/img/bg-1.jpg');
  width: 100%;
  height: 100%;
  position: fixed;
  background-size: 100% 100%;
}
</style>
