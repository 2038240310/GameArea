<template>
  <div>
    <el-tabs v-model="activeName" type="card" @tab-click="handleClick()">
      <el-tab-pane label="User" name="1">User</el-tab-pane>
      <el-tab-pane label="Config" name="2">Config</el-tab-pane>
      <el-tab-pane label="Role" name="3">Role</el-tab-pane>
      <el-tab-pane label="Task" name="4">Task</el-tab-pane>
    </el-tabs>
    <el-table :data="tableData" style="width: 100%">
      <el-table-column prop="title" label="标题" style="width: 70%" />
      <el-table-column prop="author" label="作者" style="width: 10%" />
      <el-table-column prop="date" label="发表时间" style="width: 20%"/>
    </el-table>
  </div>
</template>

<script lang="ts" setup>
import { ref } from "vue";
import type { TabsPaneContext } from "element-plus";

const activeName = ref("1");
const tableData = [
  {
    'title': 'GA-测试标题',
    'author': '开发者w',
    'date': '2023-04-06'
  }
]

const handleClick = (tab: TabsPaneContext, event: Event) => {
  console.log(tab, event);
  console.log(activeName);
  
};
</script>

<style>
</style>