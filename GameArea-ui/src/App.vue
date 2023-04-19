<template>
  <!-- route规则key绑定fullPath，路由路径改变就刷新 -->
  <router-view :key="$route.fullPath"></router-view>
</template>

<style scoped>
#app {
  font-family: Roboto, Helvetica, Arial, sans-serif;
}
</style>
