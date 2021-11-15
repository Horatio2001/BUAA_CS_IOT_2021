

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.TenantDeviceStatisticsClient;
import com.ctg.ag.sdk.biz.tenant_device_statistics.QueryTenantDeviceCountRequest;
import com.ctg.ag.sdk.biz.tenant_device_statistics.QueryTenantDeviceCountResponse;
import com.ctg.ag.sdk.biz.tenant_device_statistics.QueryTenantDeviceTrendRequest;
import com.ctg.ag.sdk.biz.tenant_device_statistics.QueryTenantDeviceTrendResponse;
import com.ctg.ag.sdk.biz.tenant_device_statistics.QueryTenantDeviceActiveCountRequest;
import com.ctg.ag.sdk.biz.tenant_device_statistics.QueryTenantDeviceActiveCountResponse;


public class TenantDeviceStatisticsDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		TenantDeviceStatisticsClient client = TenantDeviceStatisticsClient.newClient().build();

		{
			QueryTenantDeviceCountRequest request = new QueryTenantDeviceCountRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantDeviceCount(request));
		}
		
		{
			QueryTenantDeviceTrendRequest request = new QueryTenantDeviceTrendRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantDeviceTrend(request));
		}
		
		{
			QueryTenantDeviceActiveCountRequest request = new QueryTenantDeviceActiveCountRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantDeviceActiveCount(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		TenantDeviceStatisticsClient client = TenantDeviceStatisticsClient.newClient().build();

		{
			
			List<Future<QueryTenantDeviceCountResponse>> res = new ArrayList<Future<QueryTenantDeviceCountResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryTenantDeviceCountRequest request = new QueryTenantDeviceCountRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryTenantDeviceCount(request, new ApiCallBack<QueryTenantDeviceCountRequest, QueryTenantDeviceCountResponse>() {
					@Override
					public void onFailure(QueryTenantDeviceCountRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryTenantDeviceCountRequest request, QueryTenantDeviceCountResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryTenantDeviceCountResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryTenantDeviceTrendResponse>> res = new ArrayList<Future<QueryTenantDeviceTrendResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryTenantDeviceTrendRequest request = new QueryTenantDeviceTrendRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryTenantDeviceTrend(request, new ApiCallBack<QueryTenantDeviceTrendRequest, QueryTenantDeviceTrendResponse>() {
					@Override
					public void onFailure(QueryTenantDeviceTrendRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryTenantDeviceTrendRequest request, QueryTenantDeviceTrendResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryTenantDeviceTrendResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryTenantDeviceActiveCountResponse>> res = new ArrayList<Future<QueryTenantDeviceActiveCountResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryTenantDeviceActiveCountRequest request = new QueryTenantDeviceActiveCountRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryTenantDeviceActiveCount(request, new ApiCallBack<QueryTenantDeviceActiveCountRequest, QueryTenantDeviceActiveCountResponse>() {
					@Override
					public void onFailure(QueryTenantDeviceActiveCountRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryTenantDeviceActiveCountRequest request, QueryTenantDeviceActiveCountResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryTenantDeviceActiveCountResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		TenantDeviceStatisticsClient client = TenantDeviceStatisticsClient.newClient().scheme(Scheme.HTTPS).build();

		{
			QueryTenantDeviceCountRequest request = new QueryTenantDeviceCountRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantDeviceCount(request));
		}
		
		{
			QueryTenantDeviceTrendRequest request = new QueryTenantDeviceTrendRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantDeviceTrend(request));
		}
		
		{
			QueryTenantDeviceActiveCountRequest request = new QueryTenantDeviceActiveCountRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantDeviceActiveCount(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		TenantDeviceStatisticsClient client = TenantDeviceStatisticsClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			QueryTenantDeviceCountRequest request = new QueryTenantDeviceCountRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantDeviceCount(request));
		}
		
		{
			QueryTenantDeviceTrendRequest request = new QueryTenantDeviceTrendRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantDeviceTrend(request));
		}
		
		{
			QueryTenantDeviceActiveCountRequest request = new QueryTenantDeviceActiveCountRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantDeviceActiveCount(request));
		}
		
		client.shutdown();
	}

}
