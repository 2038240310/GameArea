<template lang="">
<div class="overflow-x-auto">
<table class="table w-full">
    <!-- 表头数据 -->
    <thead>
    <tr>
        <th></th>
        <th v-for="item in props.Headerlist">{{item}}</th>
    </tr>
    </thead>
    <tbody>
    <!-- 表格数据 -->
        <tr v-for="(item,index) in props.tablelist" :key=index>
        <th>{{index}}</th>
        <td v-for="tableitem in item">{{tableitem}}</td>
    </tr>
    </tbody>
</table>
</div>
</template>
<script setup lang="ts">
import { ref, reactive } from 'vue'

interface Props {
    Headerlist: string[],
    tablelist: string[][]
}
const props = withDefaults(defineProps<Props>(), {
})
</script>
<style ></style>