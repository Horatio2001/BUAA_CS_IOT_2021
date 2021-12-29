<template>
  <div id="control">
    <div style="text-align: left" class="user_information">
      <el-form :model="threshold_value" label-width="120px" label-position="left">
        <el-form-item label="当前温度">
          <span style="font-size: large">
            {{t_now}}
          </span>
        </el-form-item>
        <el-form-item label="当前湿度">
          <span style="font-size: large">
            {{h_now}}
          </span>
        </el-form-item>
        <el-form-item label="温度阈值设置">
          <el-input-number v-model="threshold_value.t"
                           :min="-15" :max="45" :step="0.1" label="描述文字">
          </el-input-number>
        </el-form-item>
        <el-form-item label="湿度阈值设置">
          <el-input-number v-model="threshold_value.h"
                           :min="0" :max="100" label="描述文字">
          </el-input-number>
        </el-form-item>
        <el-form-item label="操作电机">
          <el-button @click="operate_open" round type="primary" plain>打开</el-button>
          <el-button @click="operate_close" round type="primary" plain>关闭</el-button>
        </el-form-item>
        <el-form-item label="电机状态">
          <span style="font-size: large">
            {{get_status}}
          </span>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
import {close_motor, get_h, get_t, open_motor} from "../api/api";

export default {
  name: "control",
  data() {
    return {
      //t and h
      threshold_value:{
        t : 30,
        h : 20
      },
      t_now : 0,
      h_now : 0,
      //motor
      motor_status : false,
      operated : false,
    }
  },
  methods:{
    open() {
      open_motor().then(res => {
        this.motor_status = true
        console.log(res)
      }).catch(err => {
        console.log(err)
      })
    },
    close() {
      close_motor().then(res => {
        this.motor_status = false
        console.log(res)
      }).catch(err => {
        console.log(err)
      })
    },
    get_t_and_h() {
      get_t().then(res => {
        this.t_now = res.data
      }).catch(err => {
        console.log(err)
      })
      get_h().then(res => {
        this.h_now = res.data
      }).catch(err => {
        console.log(err)
      })
    },
    judge() {
      if (!this.operated) {
        if (this.h_now < this.threshold_value.h && this.t_now > this.threshold_value.t) {
          if (!this.motor_status) {
            this.open()
          }
        }
        else {
          if (this.motor_status) {
            this.close()
          }
        }
      }
    },
    operate_open() {
      this.open()
      this.operated = true
    },
    operate_close() {
      this.close()
      this.operated = true
    },
  },
  created() {
    this.get_t_and_h()
    this.close()
    this.operated = false
    this.motor_status = false
    window.setInterval(() => {
      this.get_t_and_h()
      this.judge()
    }, 300000);
    window.setInterval(() => {
      this.operated = false
    }, 600000)
  },
  computed: {
    get_status: function () {
      if (this.motor_status) {
        return "工作中"
      }
      else {
        return "休眠中"
      }
    }
  }
}
</script>

<style scoped>
</style>