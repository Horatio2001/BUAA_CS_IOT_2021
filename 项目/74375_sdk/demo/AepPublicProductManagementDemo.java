

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.AepPublicProductManagementClient;
import com.ctg.ag.sdk.biz.aep_public_product_management.QueryPublicByPublicProductIdRequest;
import com.ctg.ag.sdk.biz.aep_public_product_management.QueryPublicByPublicProductIdResponse;
import com.ctg.ag.sdk.biz.aep_public_product_management.QueryPublicByProductIdRequest;
import com.ctg.ag.sdk.biz.aep_public_product_management.QueryPublicByProductIdResponse;
import com.ctg.ag.sdk.biz.aep_public_product_management.InstantiateProductRequest;
import com.ctg.ag.sdk.biz.aep_public_product_management.InstantiateProductResponse;
import com.ctg.ag.sdk.biz.aep_public_product_management.QueryAllPublicProductListRequest;
import com.ctg.ag.sdk.biz.aep_public_product_management.QueryAllPublicProductListResponse;
import com.ctg.ag.sdk.biz.aep_public_product_management.QueryMyPublicProductListRequest;
import com.ctg.ag.sdk.biz.aep_public_product_management.QueryMyPublicProductListResponse;


public class AepPublicProductManagementDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		AepPublicProductManagementClient client = AepPublicProductManagementClient.newClient().build();

		{
			QueryPublicByPublicProductIdRequest request = new QueryPublicByPublicProductIdRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryPublicByPublicProductId(request));
		}
		
		{
			QueryPublicByProductIdRequest request = new QueryPublicByProductIdRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryPublicByProductId(request));
		}
		
		{
			InstantiateProductRequest request = new InstantiateProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.InstantiateProduct(request));
		}
		
		{
			QueryAllPublicProductListRequest request = new QueryAllPublicProductListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryAllPublicProductList(request));
		}
		
		{
			QueryMyPublicProductListRequest request = new QueryMyPublicProductListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryMyPublicProductList(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		AepPublicProductManagementClient client = AepPublicProductManagementClient.newClient().build();

		{
			
			List<Future<QueryPublicByPublicProductIdResponse>> res = new ArrayList<Future<QueryPublicByPublicProductIdResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryPublicByPublicProductIdRequest request = new QueryPublicByPublicProductIdRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryPublicByPublicProductId(request, new ApiCallBack<QueryPublicByPublicProductIdRequest, QueryPublicByPublicProductIdResponse>() {
					@Override
					public void onFailure(QueryPublicByPublicProductIdRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryPublicByPublicProductIdRequest request, QueryPublicByPublicProductIdResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryPublicByPublicProductIdResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryPublicByProductIdResponse>> res = new ArrayList<Future<QueryPublicByProductIdResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryPublicByProductIdRequest request = new QueryPublicByProductIdRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryPublicByProductId(request, new ApiCallBack<QueryPublicByProductIdRequest, QueryPublicByProductIdResponse>() {
					@Override
					public void onFailure(QueryPublicByProductIdRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryPublicByProductIdRequest request, QueryPublicByProductIdResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryPublicByProductIdResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<InstantiateProductResponse>> res = new ArrayList<Future<InstantiateProductResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				InstantiateProductRequest request = new InstantiateProductRequest();
				// request.setParam..  	// set your request params here

				res.add(client.InstantiateProduct(request, new ApiCallBack<InstantiateProductRequest, InstantiateProductResponse>() {
					@Override
					public void onFailure(InstantiateProductRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(InstantiateProductRequest request, InstantiateProductResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<InstantiateProductResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryAllPublicProductListResponse>> res = new ArrayList<Future<QueryAllPublicProductListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryAllPublicProductListRequest request = new QueryAllPublicProductListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryAllPublicProductList(request, new ApiCallBack<QueryAllPublicProductListRequest, QueryAllPublicProductListResponse>() {
					@Override
					public void onFailure(QueryAllPublicProductListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryAllPublicProductListRequest request, QueryAllPublicProductListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryAllPublicProductListResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryMyPublicProductListResponse>> res = new ArrayList<Future<QueryMyPublicProductListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryMyPublicProductListRequest request = new QueryMyPublicProductListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryMyPublicProductList(request, new ApiCallBack<QueryMyPublicProductListRequest, QueryMyPublicProductListResponse>() {
					@Override
					public void onFailure(QueryMyPublicProductListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryMyPublicProductListRequest request, QueryMyPublicProductListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryMyPublicProductListResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		AepPublicProductManagementClient client = AepPublicProductManagementClient.newClient().scheme(Scheme.HTTPS).build();

		{
			QueryPublicByPublicProductIdRequest request = new QueryPublicByPublicProductIdRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryPublicByPublicProductId(request));
		}
		
		{
			QueryPublicByProductIdRequest request = new QueryPublicByProductIdRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryPublicByProductId(request));
		}
		
		{
			InstantiateProductRequest request = new InstantiateProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.InstantiateProduct(request));
		}
		
		{
			QueryAllPublicProductListRequest request = new QueryAllPublicProductListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryAllPublicProductList(request));
		}
		
		{
			QueryMyPublicProductListRequest request = new QueryMyPublicProductListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryMyPublicProductList(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		AepPublicProductManagementClient client = AepPublicProductManagementClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			QueryPublicByPublicProductIdRequest request = new QueryPublicByPublicProductIdRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryPublicByPublicProductId(request));
		}
		
		{
			QueryPublicByProductIdRequest request = new QueryPublicByProductIdRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryPublicByProductId(request));
		}
		
		{
			InstantiateProductRequest request = new InstantiateProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.InstantiateProduct(request));
		}
		
		{
			QueryAllPublicProductListRequest request = new QueryAllPublicProductListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryAllPublicProductList(request));
		}
		
		{
			QueryMyPublicProductListRequest request = new QueryMyPublicProductListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryMyPublicProductList(request));
		}
		
		client.shutdown();
	}

}
