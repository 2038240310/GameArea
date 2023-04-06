<template>
  <div>
    <el-container>
      <el-header>
        <div class="top top-logo">GameArea</div>
        <ul class="top top-router">
          <RouterLink to="/game-area/bbs">论坛</RouterLink>
          <RouterLink to="/game-area/share">分享站</RouterLink>
          <RouterLink to="/game-area/sign">资讯站</RouterLink>
          <RouterLink to="/game-area/lib">资料库</RouterLink>
        </ul>
      </el-header>
      <el-main>
        <RouterView />
      </el-main>
    </el-container>
  </div>
</template>

<script setup lang="ts">
import { RouterLink, RouterView } from "vue-router";
</script>

<style scoped>
.top {
  width: 100%;
  font-size: 15px;
  text-align: left;
  align-items: flex-start;
}

.top-router {
  align-items: start;
  background-color: #333;
}

.top-logo {
  text-align: center;
  font-size: 30px;
  background-color: #f1f1f1;
}

.top a {
  display: inline-block;
  padding: 0 1rem;
  border-left: 1px solid var(--color-border);
  font-size: 20px;
}
</style>