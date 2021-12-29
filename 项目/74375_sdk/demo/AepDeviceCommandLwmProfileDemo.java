

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.AepDeviceCommandLwmProfileClient;
import com.ctg.ag.sdk.biz.aep_device_command_lwm_profile.CreateCommandLwm2mProfileRequest;
import com.ctg.ag.sdk.biz.aep_device_command_lwm_profile.CreateCommandLwm2mProfileResponse;


public class AepDeviceCommandLwmProfileDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		AepDeviceCommandLwmProfileClient client = AepDeviceCommandLwmProfileClient.newClient().build();

		{
			CreateCommandLwm2mProfileRequest request = new CreateCommandLwm2mProfileRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateCommandLwm2mProfile(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		AepDeviceCommandLwmProfileClient client = AepDeviceCommandLwmProfileClient.newClient().build();

		{
			
			List<Future<CreateCommandLwm2mProfileResponse>> res = new ArrayList<Future<CreateCommandLwm2mProfileResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				CreateCommandLwm2mProfileRequest request = new CreateCommandLwm2mProfileRequest();
				// request.setParam..  	// set your request params here

				res.add(client.CreateCommandLwm2mProfile(request, new ApiCallBack<CreateCommandLwm2mProfileRequest, CreateCommandLwm2mProfileResponse>() {
					@Override
					public void onFailure(CreateCommandLwm2mProfileRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(CreateCommandLwm2mProfileRequest request, CreateCommandLwm2mProfileResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<CreateCommandLwm2mProfileResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		AepDeviceCommandLwmProfileClient client = AepDeviceCommandLwmProfileClient.newClient().scheme(Scheme.HTTPS).build();

		{
			CreateCommandLwm2mProfileRequest request = new CreateCommandLwm2mProfileRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateCommandLwm2mProfile(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		AepDeviceCommandLwmProfileClient client = AepDeviceCommandLwmProfileClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			CreateCommandLwm2mProfileRequest request = new CreateCommandLwm2mProfileRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateCommandLwm2mProfile(request));
		}
		
		client.shutdown();
	}

}
