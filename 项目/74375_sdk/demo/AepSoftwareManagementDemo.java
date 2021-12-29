

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.AepSoftwareManagementClient;
import com.ctg.ag.sdk.biz.aep_software_management.UpdateSoftwareRequest;
import com.ctg.ag.sdk.biz.aep_software_management.UpdateSoftwareResponse;
import com.ctg.ag.sdk.biz.aep_software_management.DeleteSoftwareRequest;
import com.ctg.ag.sdk.biz.aep_software_management.DeleteSoftwareResponse;
import com.ctg.ag.sdk.biz.aep_software_management.QuerySoftwareRequest;
import com.ctg.ag.sdk.biz.aep_software_management.QuerySoftwareResponse;
import com.ctg.ag.sdk.biz.aep_software_management.QuerySoftwareListRequest;
import com.ctg.ag.sdk.biz.aep_software_management.QuerySoftwareListResponse;


public class AepSoftwareManagementDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		AepSoftwareManagementClient client = AepSoftwareManagementClient.newClient().build();

		{
			UpdateSoftwareRequest request = new UpdateSoftwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateSoftware(request));
		}
		
		{
			DeleteSoftwareRequest request = new DeleteSoftwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteSoftware(request));
		}
		
		{
			QuerySoftwareRequest request = new QuerySoftwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftware(request));
		}
		
		{
			QuerySoftwareListRequest request = new QuerySoftwareListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareList(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		AepSoftwareManagementClient client = AepSoftwareManagementClient.newClient().build();

		{
			
			List<Future<UpdateSoftwareResponse>> res = new ArrayList<Future<UpdateSoftwareResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				UpdateSoftwareRequest request = new UpdateSoftwareRequest();
				// request.setParam..  	// set your request params here

				res.add(client.UpdateSoftware(request, new ApiCallBack<UpdateSoftwareRequest, UpdateSoftwareResponse>() {
					@Override
					public void onFailure(UpdateSoftwareRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(UpdateSoftwareRequest request, UpdateSoftwareResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<UpdateSoftwareResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<DeleteSoftwareResponse>> res = new ArrayList<Future<DeleteSoftwareResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				DeleteSoftwareRequest request = new DeleteSoftwareRequest();
				// request.setParam..  	// set your request params here

				res.add(client.DeleteSoftware(request, new ApiCallBack<DeleteSoftwareRequest, DeleteSoftwareResponse>() {
					@Override
					public void onFailure(DeleteSoftwareRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(DeleteSoftwareRequest request, DeleteSoftwareResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<DeleteSoftwareResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QuerySoftwareResponse>> res = new ArrayList<Future<QuerySoftwareResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QuerySoftwareRequest request = new QuerySoftwareRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QuerySoftware(request, new ApiCallBack<QuerySoftwareRequest, QuerySoftwareResponse>() {
					@Override
					public void onFailure(QuerySoftwareRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QuerySoftwareRequest request, QuerySoftwareResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QuerySoftwareResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QuerySoftwareListResponse>> res = new ArrayList<Future<QuerySoftwareListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QuerySoftwareListRequest request = new QuerySoftwareListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QuerySoftwareList(request, new ApiCallBack<QuerySoftwareListRequest, QuerySoftwareListResponse>() {
					@Override
					public void onFailure(QuerySoftwareListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QuerySoftwareListRequest request, QuerySoftwareListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QuerySoftwareListResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		AepSoftwareManagementClient client = AepSoftwareManagementClient.newClient().scheme(Scheme.HTTPS).build();

		{
			UpdateSoftwareRequest request = new UpdateSoftwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateSoftware(request));
		}
		
		{
			DeleteSoftwareRequest request = new DeleteSoftwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteSoftware(request));
		}
		
		{
			QuerySoftwareRequest request = new QuerySoftwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftware(request));
		}
		
		{
			QuerySoftwareListRequest request = new QuerySoftwareListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareList(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		AepSoftwareManagementClient client = AepSoftwareManagementClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			UpdateSoftwareRequest request = new UpdateSoftwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateSoftware(request));
		}
		
		{
			DeleteSoftwareRequest request = new DeleteSoftwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteSoftware(request));
		}
		
		{
			QuerySoftwareRequest request = new QuerySoftwareRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftware(request));
		}
		
		{
			QuerySoftwareListRequest request = new QuerySoftwareListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareList(request));
		}
		
		client.shutdown();
	}

}
