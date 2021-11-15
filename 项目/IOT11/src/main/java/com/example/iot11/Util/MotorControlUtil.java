package com.example.iot11.Util;

import com.alibaba.fastjson.JSONObject;
import com.ctg.ag.sdk.biz.AepDeviceCommandClient;
import com.ctg.ag.sdk.biz.aep_device_command.CreateCommandRequest;
import com.ctg.ag.sdk.biz.aep_device_command.CreateCommandResponse;
import com.example.iot11.Config.PublicInfoConfig;

public class MotorControlUtil {
    public void moveMotor(int open) throws Exception{
        AepDeviceCommandClient client = AepDeviceCommandClient.newClient()
                .appKey(PublicInfoConfig.appKey)
                .appSecret(PublicInfoConfig.appSecret)
                .build();
        CreateCommandRequest request = new CreateCommandRequest();
        request.setParam("MasterKey", PublicInfoConfig.masterKey);

        JSONObject body = new JSONObject();
        body.put("productId", PublicInfoConfig.productId);
        body.put("deviceId", PublicInfoConfig.deviceId);
        body.put("operator", "horatio");

        JSONObject content = new JSONObject();
        content.put("serviceIdentifier", "motor_control");

        JSONObject para = new JSONObject();
        para.put("control_int", open==0?0:1);

        content.put("params",para);
        body.put("content", content);

        request.setBody(body.toJSONString().getBytes());

        CreateCommandResponse rst = client.CreateCommand(request);

        System.out.println(rst);
    }
}
