package com.example.iot11.Controller;

import com.example.iot11.Service.HumidityService;
import com.example.iot11.Service.TemperatureService;
import com.example.iot11.Util.DeviceStatusUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("湿度数据管理接口")
public class DataController {
    @Autowired
    private HumidityService humidityService;
    @Autowired
    private TemperatureService temperatureService;

    @ApiOperation(value = "更新湿度库")
    @PostMapping(value = "/updateHumidity")
    public void addHum() throws Exception{
        DeviceStatusUtil util = new DeviceStatusUtil();
        double hum = util.getHumidity();
        humidityService.addHumidity(hum);
    }

    @ApiOperation(value = "更新温度库")
    @PostMapping(value = "/updateTemperature")
    public void addTem() throws Exception{
        DeviceStatusUtil util = new DeviceStatusUtil();
        double tem = util.getTemperature();
        temperatureService.addTemperature(tem);
    }

    @ApiOperation(value="获得最近湿度")
    @PostMapping(value="/getHumList")
    public List<Double> getHumList(){
        return humidityService.getHumidity();
    }

    @ApiOperation(value="获得最近温度")
    @PostMapping(value="/getTemList")
    public List<Double> getTemList(){
        return temperatureService.getTemperature();
    }
}


