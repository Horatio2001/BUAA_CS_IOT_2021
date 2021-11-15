package com.example.iot11.Controller;

import com.example.iot11.Util.DeviceStatusUtil;
import com.example.iot11.Util.MotorControlUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController

@Api("传说中的Aep控制接口")
public class AepController {
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
}
