

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.AepDeviceStatusClient;
import com.ctg.ag.sdk.biz.aep_device_status.QueryDeviceStatusRequest;
import com.ctg.ag.sdk.biz.aep_device_status.QueryDeviceStatusResponse;
import com.ctg.ag.sdk.biz.aep_device_status.QueryDeviceStatusListRequest;
import com.ctg.ag.sdk.biz.aep_device_status.QueryDeviceStatusListResponse;
import com.ctg.ag.sdk.biz.aep_device_status.GetDeviceStatusHisInTotalRequest;
import com.ctg.ag.sdk.biz.aep_device_status.GetDeviceStatusHisInTotalResponse;
import com.ctg.ag.sdk.biz.aep_device_status.GetDeviceStatusHisInPageRequest;
import com.ctg.ag.sdk.biz.aep_device_status.GetDeviceStatusHisInPageResponse;


public class AepDeviceStatusDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		AepDeviceStatusClient client = AepDeviceStatusClient.newClient().build();

		{
			QueryDeviceStatusRequest request = new QueryDeviceStatusRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryDeviceStatus(request));
		}
		
		{
			QueryDeviceStatusListRequest request = new QueryDeviceStatusListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryDeviceStatusList(request));
		}
		
		{
			GetDeviceStatusHisInTotalRequest request = new GetDeviceStatusHisInTotalRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.getDeviceStatusHisInTotal(request));
		}
		
		{
			GetDeviceStatusHisInPageRequest request = new GetDeviceStatusHisInPageRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.getDeviceStatusHisInPage(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		AepDeviceStatusClient client = AepDeviceStatusClient.newClient().build();

		{
			
			List<Future<QueryDeviceStatusResponse>> res = new ArrayList<Future<QueryDeviceStatusResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryDeviceStatusRequest request = new QueryDeviceStatusRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryDeviceStatus(request, new ApiCallBack<QueryDeviceStatusRequest, QueryDeviceStatusResponse>() {
					@Override
					public void onFailure(QueryDeviceStatusRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryDeviceStatusRequest request, QueryDeviceStatusResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryDeviceStatusResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryDeviceStatusListResponse>> res = new ArrayList<Future<QueryDeviceStatusListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryDeviceStatusListRequest request = new QueryDeviceStatusListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryDeviceStatusList(request, new ApiCallBack<QueryDeviceStatusListRequest, QueryDeviceStatusListResponse>() {
					@Override
					public void onFailure(QueryDeviceStatusListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryDeviceStatusListRequest request, QueryDeviceStatusListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryDeviceStatusListResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<GetDeviceStatusHisInTotalResponse>> res = new ArrayList<Future<GetDeviceStatusHisInTotalResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				GetDeviceStatusHisInTotalRequest request = new GetDeviceStatusHisInTotalRequest();
				// request.setParam..  	// set your request params here

				res.add(client.getDeviceStatusHisInTotal(request, new ApiCallBack<GetDeviceStatusHisInTotalRequest, GetDeviceStatusHisInTotalResponse>() {
					@Override
					public void onFailure(GetDeviceStatusHisInTotalRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(GetDeviceStatusHisInTotalRequest request, GetDeviceStatusHisInTotalResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<GetDeviceStatusHisInTotalResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<GetDeviceStatusHisInPageResponse>> res = new ArrayList<Future<GetDeviceStatusHisInPageResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				GetDeviceStatusHisInPageRequest request = new GetDeviceStatusHisInPageRequest();
				// request.setParam..  	// set your request params here

				res.add(client.getDeviceStatusHisInPage(request, new ApiCallBack<GetDeviceStatusHisInPageRequest, GetDeviceStatusHisInPageResponse>() {
					@Override
					public void onFailure(GetDeviceStatusHisInPageRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(GetDeviceStatusHisInPageRequest request, GetDeviceStatusHisInPageResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<GetDeviceStatusHisInPageResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		AepDeviceStatusClient client = AepDeviceStatusClient.newClient().scheme(Scheme.HTTPS).build();

		{
			QueryDeviceStatusRequest request = new QueryDeviceStatusRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryDeviceStatus(request));
		}
		
		{
			QueryDeviceStatusListRequest request = new QueryDeviceStatusListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryDeviceStatusList(request));
		}
		
		{
			GetDeviceStatusHisInTotalRequest request = new GetDeviceStatusHisInTotalRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.getDeviceStatusHisInTotal(request));
		}
		
		{
			GetDeviceStatusHisInPageRequest request = new GetDeviceStatusHisInPageRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.getDeviceStatusHisInPage(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		AepDeviceStatusClient client = AepDeviceStatusClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			QueryDeviceStatusRequest request = new QueryDeviceStatusRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryDeviceStatus(request));
		}
		
		{
			QueryDeviceStatusListRequest request = new QueryDeviceStatusListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryDeviceStatusList(request));
		}
		
		{
			GetDeviceStatusHisInTotalRequest request = new GetDeviceStatusHisInTotalRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.getDeviceStatusHisInTotal(request));
		}
		
		{
			GetDeviceStatusHisInPageRequest request = new GetDeviceStatusHisInPageRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.getDeviceStatusHisInPage(request));
		}
		
		client.shutdown();
	}

}
