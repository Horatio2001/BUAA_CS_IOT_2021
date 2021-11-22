package com.example.iot11.Util;

import com.alibaba.fastjson.JSONObject;
import com.ctg.ag.sdk.biz.AepDeviceStatusClient;
import com.ctg.ag.sdk.biz.aep_device_status.QueryDeviceStatusRequest;
import com.ctg.ag.sdk.biz.aep_device_status.QueryDeviceStatusResponse;
import com.example.iot11.Config.PublicInfoConfig;

import java.nio.charset.StandardCharsets;

public class DeviceStatusUtil {
    public double getTemperature() throws Exception {
        AepDeviceStatusClient client = AepDeviceStatusClient.newClient()
                .appKey(PublicInfoConfig.appKey)
                .appSecret(PublicInfoConfig.appSecret)
                .build();
        QueryDeviceStatusRequest request = new QueryDeviceStatusRequest();

//        System.out.println(" ");
//        System.out.println(client.QueryDeviceStatus(request));
//        System.out.println(" ");

        String json = "{\"productId\":\"" + PublicInfoConfig.productId + "\",\"deviceId\":\"" + PublicInfoConfig.deviceId
                + "\",\"datasetId\":\"temperature_data\"}";

        System.out.println(json);
        request.setBody(json.getBytes());

        QueryDeviceStatusResponse rst = client.QueryDeviceStatus(request);
        rst.getMessage();

        String body = new String(rst.getBody(), "utf-8");
        JSONObject jsonObject = JSONObject.parseObject(body);
        //System.out.println(jsonObject);
        String value = jsonObject.getJSONObject("deviceStatus").getString("value");

        double temperature = Double.parseDouble(value);

        System.out.println(" ");
        System.out.println(client.QueryDeviceStatus(request));
        System.out.println(" ");

        client.shutdown();
        return temperature;
    }

    public double getHumidity() throws Exception {
        AepDeviceStatusClient client = AepDeviceStatusClient.newClient()
                .appKey(PublicInfoConfig.appKey)
                .appSecret(PublicInfoConfig.appSecret)
                .build();
        QueryDeviceStatusRequest request = new QueryDeviceStatusRequest();
        String json = "{\"productId\":\"" + PublicInfoConfig.productId + "\",\"deviceId\":\"" + PublicInfoConfig.deviceId
                + "\",\"datasetId\":\"humidity_data\"}";
        request.setBody(json.getBytes());

        QueryDeviceStatusResponse rst = client.QueryDeviceStatus(request);
        rst.getMessage();
        String body = new String(rst.getBody(), "utf-8");
        JSONObject jsonObject = JSONObject.parseObject(body);
        String value = jsonObject.getJSONObject("deviceStatus").getString("value");

        double Humidity = Double.parseDouble(value);

        client.shutdown();
        return Humidity;
    }
}
