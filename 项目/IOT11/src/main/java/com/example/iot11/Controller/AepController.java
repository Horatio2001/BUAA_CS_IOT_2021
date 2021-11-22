package com.example.iot11.Controller;

import com.example.iot11.Util.DeviceStatusUtil;
import com.example.iot11.Util.MotorControlUtil;
import com.example.iot11.Util.MotorStatusUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@RestController
@Api("传说中的Aep控制接口")
public class AepController {
//    private double[] t_list = {0,0,0,0,0,0,0};
//    private double[] h_list = {0,0,0,0,0,0,0};
//    private int index = 0;
    @CrossOrigin
    @ApiOperation(value = "获得温度")
    @GetMapping(value="/getTemperature")
    public double getTemperature() throws Exception{
        System.out.println("getTemperature");
        DeviceStatusUtil util = new DeviceStatusUtil();
        return util.getTemperature();
    }
    @CrossOrigin
    @ApiOperation(value = "获得湿度")
    @GetMapping(value="/getHumidity")
    public double getHumidity() throws Exception{
        System.out.println("getHumidity");
        DeviceStatusUtil util = new DeviceStatusUtil();
        return util.getHumidity();
    }
    @CrossOrigin
    @ApiOperation(value = "关电机")
    @PostMapping(value="/closeMotor")
    public int closeMotor() throws Exception{
        MotorControlUtil util = new MotorControlUtil();
        util.moveMotor(0);
        return 1;
    }

    @CrossOrigin
    @ApiOperation(value = "开电机")
    @PostMapping(value="/openMotor")
    public int openMotor() throws Exception{
        MotorControlUtil util = new MotorControlUtil();
        util.moveMotor(1);
        return 1;
    }

//    @CrossOrigin
//    @ApiOperation(value = "获得温度列表")
//    @GetMapping(value = "/get_t_list")
//    public double[] get_t_list() throws Exception {
//        return t_list;
//    }
//
//    @CrossOrigin
//    @ApiOperation(value = "获得湿度列表")
//    @GetMapping(value = "/get_h_list")
//    public double[] get_h_list() throws Exception {
//        return h_list;
//    }
//
//    @CrossOrigin
//    @ApiOperation(value = "更新温湿度")
//    @PostMapping(value = "/update")
//    public void update() throws Exception{
//        DeviceStatusUtil deviceStatusUtil = new DeviceStatusUtil();
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                for (int i = 7 - index; i < 7; i++) {
//                    t_list[i - 1] = t_list[i];
//                    h_list[i - 1] = h_list[i];
//                }
//                try {
//                    t_list[6] = deviceStatusUtil.getTemperature();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                try {
//                    h_list[6] = deviceStatusUtil.getHumidity();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                if (index < 7) {
//                    index++;
//                }
//            }
//        }, 10, 10000);
//    }

}
