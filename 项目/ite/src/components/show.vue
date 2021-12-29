<template>
  <div id="show">
<!--    <button @click="draw">-->
<!--      draw-->
<!--    </button>-->
    <div id="chartLineBox" style="width: 90%;height: 70vh;"></div>
  </div>
</template>

<script>
import {get_h_list, get_t_list, update_h, update_t} from "../api/api";
import * as echarts from "echarts";
// import {get_h_list, get_t_list, update} from "../api/api";

export default {
  name: "show",
  data() {
    return {
      // 指定图表的配置项和数据
      option : {
        tooltip: {              //设置tip提示
          trigger: 'axis'
        },

        legend: {               //设置区分（哪条线属于什么）
          data: ['温度', '湿度']
        },
        color: ['#8AE09F', '#FA6F53'],       //设置区分（每条线是什么颜色，和 legend 一一对应）
        xAxis: {                //设置x轴
          type: 'category',
          boundaryGap: false,     //坐标轴两边不留白
          data: ['120min', '100min', '80min', '60min', '40min', '20min', 'now'],
          name: '时间',           //X轴 name
          nameTextStyle: {        //坐标轴名称的文字样式
            color: '#FA6F53',
            fontSize: 16,
            padding: [0, 0, 0, 20]
          },
          axisLine: {             //坐标轴轴线相关设置。
            lineStyle: {
              color: '#FA6F53',
            }
          }
        },
        yAxis: {
          name: '温湿度数据',
          nameTextStyle: {
            color: '#FA6F53',
            fontSize: 16,
            padding: [0, 0, 10, 0]
          },
          axisLine: {
            lineStyle: {
              color: '#FA6F53',
            }
          },
          type: 'value'
        },
        series: [
          {
            name: '温度',
            data: [],
            type: 'line',               // 类型为折线图
            lineStyle: {                // 线条样式 => 必须使用normal属性
              normal: {
                color: '#8AE09F',
              }
            },
          },
          {
            name: '湿度',
            data: [],
            type: 'line',
            lineStyle: {
              normal: {
                color: '#FA6F53',
              }
            },
          }
        ]
      },
      chartLine : null,
      mark : 0
    }
  },
  mounted(){
    this.chartLine = echarts.init(document.getElementById('chartLineBox'));
    this.draw()
    //init
    window.setInterval(() => {
      if (this.mark === 0) {
        this.update()
        this.draw()
        this.mark += 1
      }
    }, 1000)
    //go
    window.setInterval(() => {
      if (this.mark === 1) {
        this.update()
        this.draw()
      }
    }, 300000);
  },
  methods: {
    get_list() {
      get_t_list().then(res => {
        let temp = res.data
        this.option.series[0].data = temp.reverse()
      }).catch(err => {
        console.log(err)
      })
      get_h_list().then(res => {
        let temp = res.data
        this.option.series[1].data = temp.reverse()
      }).catch(err => {
        console.log(err)
      })
    },
    update() {
      update_h().then().catch(err => {
        console.log(err)
      })
      update_t().then().catch(err => {
        console.log(err)
      })
    },
    draw() {
      this.get_list()
      this.chartLine.setOption(this.option)
    }
  },
}
</script>

<style scoped>

</style>