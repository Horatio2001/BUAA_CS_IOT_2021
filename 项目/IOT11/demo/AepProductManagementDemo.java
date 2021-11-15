

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.AepProductManagementClient;
import com.ctg.ag.sdk.biz.aep_product_management.QueryProductRequest;
import com.ctg.ag.sdk.biz.aep_product_management.QueryProductResponse;
import com.ctg.ag.sdk.biz.aep_product_management.QueryProductListRequest;
import com.ctg.ag.sdk.biz.aep_product_management.QueryProductListResponse;
import com.ctg.ag.sdk.biz.aep_product_management.DeleteProductRequest;
import com.ctg.ag.sdk.biz.aep_product_management.DeleteProductResponse;
import com.ctg.ag.sdk.biz.aep_product_management.CreateProductRequest;
import com.ctg.ag.sdk.biz.aep_product_management.CreateProductResponse;
import com.ctg.ag.sdk.biz.aep_product_management.UpdateProductRequest;
import com.ctg.ag.sdk.biz.aep_product_management.UpdateProductResponse;


public class AepProductManagementDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		AepProductManagementClient client = AepProductManagementClient.newClient().build();

		{
			QueryProductRequest request = new QueryProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryProduct(request));
		}
		
		{
			QueryProductListRequest request = new QueryProductListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryProductList(request));
		}
		
		{
			DeleteProductRequest request = new DeleteProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteProduct(request));
		}
		
		{
			CreateProductRequest request = new CreateProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateProduct(request));
		}
		
		{
			UpdateProductRequest request = new UpdateProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateProduct(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		AepProductManagementClient client = AepProductManagementClient.newClient().build();

		{
			
			List<Future<QueryProductResponse>> res = new ArrayList<Future<QueryProductResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryProductRequest request = new QueryProductRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryProduct(request, new ApiCallBack<QueryProductRequest, QueryProductResponse>() {
					@Override
					public void onFailure(QueryProductRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryProductRequest request, QueryProductResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryProductResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryProductListResponse>> res = new ArrayList<Future<QueryProductListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryProductListRequest request = new QueryProductListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryProductList(request, new ApiCallBack<QueryProductListRequest, QueryProductListResponse>() {
					@Override
					public void onFailure(QueryProductListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryProductListRequest request, QueryProductListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryProductListResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<DeleteProductResponse>> res = new ArrayList<Future<DeleteProductResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				DeleteProductRequest request = new DeleteProductRequest();
				// request.setParam..  	// set your request params here

				res.add(client.DeleteProduct(request, new ApiCallBack<DeleteProductRequest, DeleteProductResponse>() {
					@Override
					public void onFailure(DeleteProductRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(DeleteProductRequest request, DeleteProductResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<DeleteProductResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<CreateProductResponse>> res = new ArrayList<Future<CreateProductResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				CreateProductRequest request = new CreateProductRequest();
				// request.setParam..  	// set your request params here

				res.add(client.CreateProduct(request, new ApiCallBack<CreateProductRequest, CreateProductResponse>() {
					@Override
					public void onFailure(CreateProductRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(CreateProductRequest request, CreateProductResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<CreateProductResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<UpdateProductResponse>> res = new ArrayList<Future<UpdateProductResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				UpdateProductRequest request = new UpdateProductRequest();
				// request.setParam..  	// set your request params here

				res.add(client.UpdateProduct(request, new ApiCallBack<UpdateProductRequest, UpdateProductResponse>() {
					@Override
					public void onFailure(UpdateProductRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(UpdateProductRequest request, UpdateProductResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<UpdateProductResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		AepProductManagementClient client = AepProductManagementClient.newClient().scheme(Scheme.HTTPS).build();

		{
			QueryProductRequest request = new QueryProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryProduct(request));
		}
		
		{
			QueryProductListRequest request = new QueryProductListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryProductList(request));
		}
		
		{
			DeleteProductRequest request = new DeleteProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteProduct(request));
		}
		
		{
			CreateProductRequest request = new CreateProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateProduct(request));
		}
		
		{
			UpdateProductRequest request = new UpdateProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateProduct(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		AepProductManagementClient client = AepProductManagementClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			QueryProductRequest request = new QueryProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryProduct(request));
		}
		
		{
			QueryProductListRequest request = new QueryProductListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryProductList(request));
		}
		
		{
			DeleteProductRequest request = new DeleteProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteProduct(request));
		}
		
		{
			CreateProductRequest request = new CreateProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateProduct(request));
		}
		
		{
			UpdateProductRequest request = new UpdateProductRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateProduct(request));
		}
		
		client.shutdown();
	}

}
