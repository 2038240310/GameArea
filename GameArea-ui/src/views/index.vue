<template>
    <header>
        <span class="top">
            GameArea
        </span>
        <span class="top">
            <RouterLink to="/game-area/bbs">论坛</RouterLink>
            <RouterLink to="/game-area/share">分享站</RouterLink>
            <RouterLink to="/game-area/sign">资讯站</RouterLink>
            <RouterLink to="/game-area/lib">资料库</RouterLink>
        </span>
    </header>
    <RouterView />
</template>

<script setup lang="ts">
import { RouterLink, RouterView } from 'vue-router'
</script>

<style scoped>
.top {
    width: 100%;
    font-size: 15px;
    text-align: left;
    margin-top: 1rem;
    margin-bottom: 1rem;
    align-items: flex-start;
}

.top a {
    display: inline-block;
    padding: 0 1rem;
    border-left: 1px solid var(--color-border);
}
</style>