<template>
  <div>
    <!-- <div class="hot">
      <span class=""> 轮播图 </span>
      <span class=""> 热门 </span>
    </div>
    <div class="row">
      <div class="column side">左侧栏</div>

      <div class="column middle">主要区域</div>

      <div class="column side">右侧栏</div>
    </div> -->
    <el-row>
      <el-col>
        <div class="hot">顶栏</div>
      </el-col>
    </el-row>
    <el-row class="column">
      <el-col class="column side">
        <div>左侧栏</div>
      </el-col>
      <el-col class="column middle">
        <div>
          <MainBoard />
        </div>
      </el-col>
      <el-col class="column side"> 
        <div>右侧栏</div>
      </el-col>
    </el-row>
  </div>
</template>

<script lang="ts">
import MainBoard from './sign_board/main_board.vue'

export default {
  components: {
    MainBoard
  }
}
</script>

<style lang="scss" scoped>
.hot {
  padding: 10px;
  background-color: antiquewhite;
}

.column {
  display: inline;
  width: 100%;
  float: left;
  padding: 0px;
}

/* 左右两侧宽度 */
.column.side {
  width: 25%;
  background-color: beige;
}

/* 中间区域宽度 */
.column.middle {
  width: 50%;
  background-color: azure;
}

/* 列后面清除浮动 */
.row:after {
  content: "";
  // display: table;
  clear: both;
}

// /* 响应式布局 - 宽度小于600px时设置上下布局 */
// @media screen and (max-width: 600px) {
//   .column.side,
//   .column.middle {
//     width: 100%;
//   }
// }
</style>