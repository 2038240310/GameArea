<script setup lang="ts">
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <div class="top">
    GameArea
  </div>

  <div class="top">
    <RouterLink to="/game-area/index">进入程序</RouterLink>
  </div>

</template>

<style scoped>
.top {
  align-items: baseline;
  text-align: center;
  font-size: 40px ;
}
</style>
