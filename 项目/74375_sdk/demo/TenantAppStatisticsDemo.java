

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.TenantAppStatisticsClient;
import com.ctg.ag.sdk.biz.tenant_app_statistics.QueryTenantApiMonthlyCountRequest;
import com.ctg.ag.sdk.biz.tenant_app_statistics.QueryTenantApiMonthlyCountResponse;
import com.ctg.ag.sdk.biz.tenant_app_statistics.QueryTenantAppCountRequest;
import com.ctg.ag.sdk.biz.tenant_app_statistics.QueryTenantAppCountResponse;
import com.ctg.ag.sdk.biz.tenant_app_statistics.QueryTenantApiTrendRequest;
import com.ctg.ag.sdk.biz.tenant_app_statistics.QueryTenantApiTrendResponse;


public class TenantAppStatisticsDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		TenantAppStatisticsClient client = TenantAppStatisticsClient.newClient().build();

		{
			QueryTenantApiMonthlyCountRequest request = new QueryTenantApiMonthlyCountRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantApiMonthlyCount(request));
		}
		
		{
			QueryTenantAppCountRequest request = new QueryTenantAppCountRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantAppCount(request));
		}
		
		{
			QueryTenantApiTrendRequest request = new QueryTenantApiTrendRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantApiTrend(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		TenantAppStatisticsClient client = TenantAppStatisticsClient.newClient().build();

		{
			
			List<Future<QueryTenantApiMonthlyCountResponse>> res = new ArrayList<Future<QueryTenantApiMonthlyCountResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryTenantApiMonthlyCountRequest request = new QueryTenantApiMonthlyCountRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryTenantApiMonthlyCount(request, new ApiCallBack<QueryTenantApiMonthlyCountRequest, QueryTenantApiMonthlyCountResponse>() {
					@Override
					public void onFailure(QueryTenantApiMonthlyCountRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryTenantApiMonthlyCountRequest request, QueryTenantApiMonthlyCountResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryTenantApiMonthlyCountResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryTenantAppCountResponse>> res = new ArrayList<Future<QueryTenantAppCountResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryTenantAppCountRequest request = new QueryTenantAppCountRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryTenantAppCount(request, new ApiCallBack<QueryTenantAppCountRequest, QueryTenantAppCountResponse>() {
					@Override
					public void onFailure(QueryTenantAppCountRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryTenantAppCountRequest request, QueryTenantAppCountResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryTenantAppCountResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryTenantApiTrendResponse>> res = new ArrayList<Future<QueryTenantApiTrendResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryTenantApiTrendRequest request = new QueryTenantApiTrendRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryTenantApiTrend(request, new ApiCallBack<QueryTenantApiTrendRequest, QueryTenantApiTrendResponse>() {
					@Override
					public void onFailure(QueryTenantApiTrendRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryTenantApiTrendRequest request, QueryTenantApiTrendResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryTenantApiTrendResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		TenantAppStatisticsClient client = TenantAppStatisticsClient.newClient().scheme(Scheme.HTTPS).build();

		{
			QueryTenantApiMonthlyCountRequest request = new QueryTenantApiMonthlyCountRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantApiMonthlyCount(request));
		}
		
		{
			QueryTenantAppCountRequest request = new QueryTenantAppCountRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantAppCount(request));
		}
		
		{
			QueryTenantApiTrendRequest request = new QueryTenantApiTrendRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantApiTrend(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		TenantAppStatisticsClient client = TenantAppStatisticsClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			QueryTenantApiMonthlyCountRequest request = new QueryTenantApiMonthlyCountRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantApiMonthlyCount(request));
		}
		
		{
			QueryTenantAppCountRequest request = new QueryTenantAppCountRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantAppCount(request));
		}
		
		{
			QueryTenantApiTrendRequest request = new QueryTenantApiTrendRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryTenantApiTrend(request));
		}
		
		client.shutdown();
	}

}
