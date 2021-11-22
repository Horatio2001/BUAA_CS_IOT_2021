package com.example.iot11.Util;


import com.alibaba.fastjson.JSONObject;
import com.ctg.ag.sdk.biz.AepDeviceStatusClient;
import com.ctg.ag.sdk.biz.aep_device_status.QueryDeviceStatusRequest;
import com.ctg.ag.sdk.biz.aep_device_status.QueryDeviceStatusResponse;
import com.example.iot11.Config.PublicInfoConfig;

public class MotorStatusUtil {
    public int getMortorStatus() throws Exception{
        AepDeviceStatusClient client = AepDeviceStatusClient.newClient()
                .appKey(PublicInfoConfig.appKey)
                .appSecret(PublicInfoConfig.appSecret)
                .build();
        QueryDeviceStatusRequest request = new QueryDeviceStatusRequest();

        String json = "{\"productId\":\"" + PublicInfoConfig.productId + "\",\"deviceId\":\"" + PublicInfoConfig.deviceId
                + "\",\"datasetId\":\"control_int\"}";

        //System.out.println(json);
        request.setBody(json.getBytes());

        QueryDeviceStatusResponse rst = client.QueryDeviceStatus(request);
        rst.getMessage();

        String body = new String(rst.getBody(), "utf-8");
        JSONObject jsonObject = JSONObject.parseObject(body);
        System.out.println(jsonObject);
        String value = jsonObject.getJSONObject("deviceStatus").getString("value");

        int Motor = Integer.parseInt(value);

        client.shutdown();
        return Motor;
    }
}
