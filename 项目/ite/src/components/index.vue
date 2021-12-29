<template>
  <div id="index">
    <el-header>
      物联网自动加湿器
    </el-header>
    <el-container>
      <el-aside width="200px">
        <el-menu
            default-active="/control"
            className="el-menu-vertical-demo"
            router>
          <el-menu-item index="/control">
            <i class="el-icon-s-tools"></i>
            <span>控制界面</span>
          </el-menu-item>
          <el-menu-item index="/show">
            <i class="el-icon-s-marketing"></i>
            <span>温湿度曲线</span>
          </el-menu-item>
        </el-menu>
      </el-aside>
      <el-main>
        <router-view/>
      </el-main>
    </el-container>
  </div>
</template>

<script>
export default {
  name: "index"
}
</script>

<style scoped>

</style>