<!-- 搜索结果页 -->
<template>
    <h2 style="display: flex;">搜索结果：{{ route.query.data }}</h2>
    <hr />
    <div style="display: flex;">
        暂时没有结果
    </div>
</template>

<script setup lang="ts">
import { useRoute } from 'vue-router'

const route = useRoute()

</script>