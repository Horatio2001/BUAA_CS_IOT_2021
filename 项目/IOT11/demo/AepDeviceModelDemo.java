

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.AepDeviceModelClient;
import com.ctg.ag.sdk.biz.aep_device_model.QueryPropertyListRequest;
import com.ctg.ag.sdk.biz.aep_device_model.QueryPropertyListResponse;
import com.ctg.ag.sdk.biz.aep_device_model.QueryServiceListRequest;
import com.ctg.ag.sdk.biz.aep_device_model.QueryServiceListResponse;


public class AepDeviceModelDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		AepDeviceModelClient client = AepDeviceModelClient.newClient().build();

		{
			QueryPropertyListRequest request = new QueryPropertyListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryPropertyList(request));
		}
		
		{
			QueryServiceListRequest request = new QueryServiceListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryServiceList(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		AepDeviceModelClient client = AepDeviceModelClient.newClient().build();

		{
			
			List<Future<QueryPropertyListResponse>> res = new ArrayList<Future<QueryPropertyListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryPropertyListRequest request = new QueryPropertyListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryPropertyList(request, new ApiCallBack<QueryPropertyListRequest, QueryPropertyListResponse>() {
					@Override
					public void onFailure(QueryPropertyListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryPropertyListRequest request, QueryPropertyListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryPropertyListResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryServiceListResponse>> res = new ArrayList<Future<QueryServiceListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryServiceListRequest request = new QueryServiceListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryServiceList(request, new ApiCallBack<QueryServiceListRequest, QueryServiceListResponse>() {
					@Override
					public void onFailure(QueryServiceListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryServiceListRequest request, QueryServiceListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryServiceListResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		AepDeviceModelClient client = AepDeviceModelClient.newClient().scheme(Scheme.HTTPS).build();

		{
			QueryPropertyListRequest request = new QueryPropertyListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryPropertyList(request));
		}
		
		{
			QueryServiceListRequest request = new QueryServiceListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryServiceList(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		AepDeviceModelClient client = AepDeviceModelClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			QueryPropertyListRequest request = new QueryPropertyListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryPropertyList(request));
		}
		
		{
			QueryServiceListRequest request = new QueryServiceListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryServiceList(request));
		}
		
		client.shutdown();
	}

}
