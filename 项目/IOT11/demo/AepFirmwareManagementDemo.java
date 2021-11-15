

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.AepFirmwareManagementClient;
import com.ctg.ag.sdk.biz.aep_firmware_management.UpdateFirmwareRequest;
import com.ctg.ag.sdk.biz.aep_firmware_management.UpdateFirmwareResponse;
import com.ctg.ag.sdk.biz.aep_firmware_management.QueryFirmwareListRequest;
import com.ctg.ag.sdk.biz.aep_firmware_management.QueryFirmwareListResponse;
import com.ctg.ag.sdk.biz.aep_firmware_management.QueryFirmwareRequest;
import com.ctg.ag.sdk.biz.aep_firmware_management.QueryFirmwareResponse;
import com.ctg.ag.sdk.biz.aep_firmware_management.DeleteFirmwareRequest;
import com.ctg.ag.sdk.biz.aep_firmware_management.DeleteFirmwareResponse;


public class AepFirmwareManagementDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		AepFirmwareManagementClient client = AepFirmwareManagementClient.newClient().build();

		{
			UpdateFirmwareRequest request = new UpdateFirmwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateFirmware(request));
		}
		
		{
			QueryFirmwareListRequest request = new QueryFirmwareListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryFirmwareList(request));
		}
		
		{
			QueryFirmwareRequest request = new QueryFirmwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryFirmware(request));
		}
		
		{
			DeleteFirmwareRequest request = new DeleteFirmwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteFirmware(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		AepFirmwareManagementClient client = AepFirmwareManagementClient.newClient().build();

		{
			
			List<Future<UpdateFirmwareResponse>> res = new ArrayList<Future<UpdateFirmwareResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				UpdateFirmwareRequest request = new UpdateFirmwareRequest();
				// request.setParam..  	// set your request params here

				res.add(client.UpdateFirmware(request, new ApiCallBack<UpdateFirmwareRequest, UpdateFirmwareResponse>() {
					@Override
					public void onFailure(UpdateFirmwareRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(UpdateFirmwareRequest request, UpdateFirmwareResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<UpdateFirmwareResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryFirmwareListResponse>> res = new ArrayList<Future<QueryFirmwareListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryFirmwareListRequest request = new QueryFirmwareListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryFirmwareList(request, new ApiCallBack<QueryFirmwareListRequest, QueryFirmwareListResponse>() {
					@Override
					public void onFailure(QueryFirmwareListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryFirmwareListRequest request, QueryFirmwareListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryFirmwareListResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryFirmwareResponse>> res = new ArrayList<Future<QueryFirmwareResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryFirmwareRequest request = new QueryFirmwareRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryFirmware(request, new ApiCallBack<QueryFirmwareRequest, QueryFirmwareResponse>() {
					@Override
					public void onFailure(QueryFirmwareRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryFirmwareRequest request, QueryFirmwareResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryFirmwareResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<DeleteFirmwareResponse>> res = new ArrayList<Future<DeleteFirmwareResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				DeleteFirmwareRequest request = new DeleteFirmwareRequest();
				// request.setParam..  	// set your request params here

				res.add(client.DeleteFirmware(request, new ApiCallBack<DeleteFirmwareRequest, DeleteFirmwareResponse>() {
					@Override
					public void onFailure(DeleteFirmwareRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(DeleteFirmwareRequest request, DeleteFirmwareResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<DeleteFirmwareResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		AepFirmwareManagementClient client = AepFirmwareManagementClient.newClient().scheme(Scheme.HTTPS).build();

		{
			UpdateFirmwareRequest request = new UpdateFirmwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateFirmware(request));
		}
		
		{
			QueryFirmwareListRequest request = new QueryFirmwareListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryFirmwareList(request));
		}
		
		{
			QueryFirmwareRequest request = new QueryFirmwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryFirmware(request));
		}
		
		{
			DeleteFirmwareRequest request = new DeleteFirmwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteFirmware(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		AepFirmwareManagementClient client = AepFirmwareManagementClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			UpdateFirmwareRequest request = new UpdateFirmwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateFirmware(request));
		}
		
		{
			QueryFirmwareListRequest request = new QueryFirmwareListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryFirmwareList(request));
		}
		
		{
			QueryFirmwareRequest request = new QueryFirmwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryFirmware(request));
		}
		
		{
			DeleteFirmwareRequest request = new DeleteFirmwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteFirmware(request));
		}
		
		client.shutdown();
	}

}
