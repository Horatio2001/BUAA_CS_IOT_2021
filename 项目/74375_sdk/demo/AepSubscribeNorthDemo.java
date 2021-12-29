

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.AepSubscribeNorthClient;
import com.ctg.ag.sdk.biz.aep_subscribe_north.GetSubscriptionRequest;
import com.ctg.ag.sdk.biz.aep_subscribe_north.GetSubscriptionResponse;
import com.ctg.ag.sdk.biz.aep_subscribe_north.GetSubscriptionsListRequest;
import com.ctg.ag.sdk.biz.aep_subscribe_north.GetSubscriptionsListResponse;
import com.ctg.ag.sdk.biz.aep_subscribe_north.DeleteSubscriptionRequest;
import com.ctg.ag.sdk.biz.aep_subscribe_north.DeleteSubscriptionResponse;
import com.ctg.ag.sdk.biz.aep_subscribe_north.CreateSubscriptionRequest;
import com.ctg.ag.sdk.biz.aep_subscribe_north.CreateSubscriptionResponse;


public class AepSubscribeNorthDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		AepSubscribeNorthClient client = AepSubscribeNorthClient.newClient().build();

		{
			GetSubscriptionRequest request = new GetSubscriptionRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.GetSubscription(request));
		}
		
		{
			GetSubscriptionsListRequest request = new GetSubscriptionsListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.GetSubscriptionsList(request));
		}
		
		{
			DeleteSubscriptionRequest request = new DeleteSubscriptionRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteSubscription(request));
		}
		
		{
			CreateSubscriptionRequest request = new CreateSubscriptionRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateSubscription(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		AepSubscribeNorthClient client = AepSubscribeNorthClient.newClient().build();

		{
			
			List<Future<GetSubscriptionResponse>> res = new ArrayList<Future<GetSubscriptionResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				GetSubscriptionRequest request = new GetSubscriptionRequest();
				// request.setParam..  	// set your request params here

				res.add(client.GetSubscription(request, new ApiCallBack<GetSubscriptionRequest, GetSubscriptionResponse>() {
					@Override
					public void onFailure(GetSubscriptionRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(GetSubscriptionRequest request, GetSubscriptionResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<GetSubscriptionResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<GetSubscriptionsListResponse>> res = new ArrayList<Future<GetSubscriptionsListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				GetSubscriptionsListRequest request = new GetSubscriptionsListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.GetSubscriptionsList(request, new ApiCallBack<GetSubscriptionsListRequest, GetSubscriptionsListResponse>() {
					@Override
					public void onFailure(GetSubscriptionsListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(GetSubscriptionsListRequest request, GetSubscriptionsListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<GetSubscriptionsListResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<DeleteSubscriptionResponse>> res = new ArrayList<Future<DeleteSubscriptionResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				DeleteSubscriptionRequest request = new DeleteSubscriptionRequest();
				// request.setParam..  	// set your request params here

				res.add(client.DeleteSubscription(request, new ApiCallBack<DeleteSubscriptionRequest, DeleteSubscriptionResponse>() {
					@Override
					public void onFailure(DeleteSubscriptionRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(DeleteSubscriptionRequest request, DeleteSubscriptionResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<DeleteSubscriptionResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<CreateSubscriptionResponse>> res = new ArrayList<Future<CreateSubscriptionResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				CreateSubscriptionRequest request = new CreateSubscriptionRequest();
				// request.setParam..  	// set your request params here

				res.add(client.CreateSubscription(request, new ApiCallBack<CreateSubscriptionRequest, CreateSubscriptionResponse>() {
					@Override
					public void onFailure(CreateSubscriptionRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(CreateSubscriptionRequest request, CreateSubscriptionResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<CreateSubscriptionResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		AepSubscribeNorthClient client = AepSubscribeNorthClient.newClient().scheme(Scheme.HTTPS).build();

		{
			GetSubscriptionRequest request = new GetSubscriptionRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.GetSubscription(request));
		}
		
		{
			GetSubscriptionsListRequest request = new GetSubscriptionsListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.GetSubscriptionsList(request));
		}
		
		{
			DeleteSubscriptionRequest request = new DeleteSubscriptionRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteSubscription(request));
		}
		
		{
			CreateSubscriptionRequest request = new CreateSubscriptionRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateSubscription(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		AepSubscribeNorthClient client = AepSubscribeNorthClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			GetSubscriptionRequest request = new GetSubscriptionRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.GetSubscription(request));
		}
		
		{
			GetSubscriptionsListRequest request = new GetSubscriptionsListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.GetSubscriptionsList(request));
		}
		
		{
			DeleteSubscriptionRequest request = new DeleteSubscriptionRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteSubscription(request));
		}
		
		{
			CreateSubscriptionRequest request = new CreateSubscriptionRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateSubscription(request));
		}
		
		client.shutdown();
	}

}
