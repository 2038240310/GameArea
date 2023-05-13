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

.bg-my-1 {
  background-color: rgba(0, 102, 255, 0.534);
}
.bg-my-2 {
  background-color: rgba(0, 0, 0, 0.493);
}
.bg-my-3 {
  background-color: rgba(255, 241, 49, 0.842);
}
</style>
