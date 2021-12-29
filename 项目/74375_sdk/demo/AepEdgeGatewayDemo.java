

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.AepEdgeGatewayClient;
import com.ctg.ag.sdk.biz.aep_edge_gateway.DeleteEdgeInstanceDeviceRequest;
import com.ctg.ag.sdk.biz.aep_edge_gateway.DeleteEdgeInstanceDeviceResponse;
import com.ctg.ag.sdk.biz.aep_edge_gateway.QueryEdgeInstanceDeviceRequest;
import com.ctg.ag.sdk.biz.aep_edge_gateway.QueryEdgeInstanceDeviceResponse;
import com.ctg.ag.sdk.biz.aep_edge_gateway.CreateEdgeInstanceRequest;
import com.ctg.ag.sdk.biz.aep_edge_gateway.CreateEdgeInstanceResponse;
import com.ctg.ag.sdk.biz.aep_edge_gateway.EdgeInstanceDeployRequest;
import com.ctg.ag.sdk.biz.aep_edge_gateway.EdgeInstanceDeployResponse;
import com.ctg.ag.sdk.biz.aep_edge_gateway.DeleteEdgeInstanceRequest;
import com.ctg.ag.sdk.biz.aep_edge_gateway.DeleteEdgeInstanceResponse;
import com.ctg.ag.sdk.biz.aep_edge_gateway.AddEdgeInstanceDeviceRequest;
import com.ctg.ag.sdk.biz.aep_edge_gateway.AddEdgeInstanceDeviceResponse;
import com.ctg.ag.sdk.biz.aep_edge_gateway.AddEdgeInstanceDriveRequest;
import com.ctg.ag.sdk.biz.aep_edge_gateway.AddEdgeInstanceDriveResponse;


public class AepEdgeGatewayDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		AepEdgeGatewayClient client = AepEdgeGatewayClient.newClient().build();

		{
			DeleteEdgeInstanceDeviceRequest request = new DeleteEdgeInstanceDeviceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteEdgeInstanceDevice(request));
		}
		
		{
			QueryEdgeInstanceDeviceRequest request = new QueryEdgeInstanceDeviceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryEdgeInstanceDevice(request));
		}
		
		{
			CreateEdgeInstanceRequest request = new CreateEdgeInstanceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateEdgeInstance(request));
		}
		
		{
			EdgeInstanceDeployRequest request = new EdgeInstanceDeployRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.EdgeInstanceDeploy(request));
		}
		
		{
			DeleteEdgeInstanceRequest request = new DeleteEdgeInstanceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteEdgeInstance(request));
		}
		
		{
			AddEdgeInstanceDeviceRequest request = new AddEdgeInstanceDeviceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.AddEdgeInstanceDevice(request));
		}
		
		{
			AddEdgeInstanceDriveRequest request = new AddEdgeInstanceDriveRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.AddEdgeInstanceDrive(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		AepEdgeGatewayClient client = AepEdgeGatewayClient.newClient().build();

		{
			
			List<Future<DeleteEdgeInstanceDeviceResponse>> res = new ArrayList<Future<DeleteEdgeInstanceDeviceResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				DeleteEdgeInstanceDeviceRequest request = new DeleteEdgeInstanceDeviceRequest();
				// request.setParam..  	// set your request params here

				res.add(client.DeleteEdgeInstanceDevice(request, new ApiCallBack<DeleteEdgeInstanceDeviceRequest, DeleteEdgeInstanceDeviceResponse>() {
					@Override
					public void onFailure(DeleteEdgeInstanceDeviceRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(DeleteEdgeInstanceDeviceRequest request, DeleteEdgeInstanceDeviceResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<DeleteEdgeInstanceDeviceResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryEdgeInstanceDeviceResponse>> res = new ArrayList<Future<QueryEdgeInstanceDeviceResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryEdgeInstanceDeviceRequest request = new QueryEdgeInstanceDeviceRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryEdgeInstanceDevice(request, new ApiCallBack<QueryEdgeInstanceDeviceRequest, QueryEdgeInstanceDeviceResponse>() {
					@Override
					public void onFailure(QueryEdgeInstanceDeviceRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryEdgeInstanceDeviceRequest request, QueryEdgeInstanceDeviceResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryEdgeInstanceDeviceResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<CreateEdgeInstanceResponse>> res = new ArrayList<Future<CreateEdgeInstanceResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				CreateEdgeInstanceRequest request = new CreateEdgeInstanceRequest();
				// request.setParam..  	// set your request params here

				res.add(client.CreateEdgeInstance(request, new ApiCallBack<CreateEdgeInstanceRequest, CreateEdgeInstanceResponse>() {
					@Override
					public void onFailure(CreateEdgeInstanceRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(CreateEdgeInstanceRequest request, CreateEdgeInstanceResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<CreateEdgeInstanceResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<EdgeInstanceDeployResponse>> res = new ArrayList<Future<EdgeInstanceDeployResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				EdgeInstanceDeployRequest request = new EdgeInstanceDeployRequest();
				// request.setParam..  	// set your request params here

				res.add(client.EdgeInstanceDeploy(request, new ApiCallBack<EdgeInstanceDeployRequest, EdgeInstanceDeployResponse>() {
					@Override
					public void onFailure(EdgeInstanceDeployRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(EdgeInstanceDeployRequest request, EdgeInstanceDeployResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<EdgeInstanceDeployResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<DeleteEdgeInstanceResponse>> res = new ArrayList<Future<DeleteEdgeInstanceResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				DeleteEdgeInstanceRequest request = new DeleteEdgeInstanceRequest();
				// request.setParam..  	// set your request params here

				res.add(client.DeleteEdgeInstance(request, new ApiCallBack<DeleteEdgeInstanceRequest, DeleteEdgeInstanceResponse>() {
					@Override
					public void onFailure(DeleteEdgeInstanceRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(DeleteEdgeInstanceRequest request, DeleteEdgeInstanceResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<DeleteEdgeInstanceResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<AddEdgeInstanceDeviceResponse>> res = new ArrayList<Future<AddEdgeInstanceDeviceResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				AddEdgeInstanceDeviceRequest request = new AddEdgeInstanceDeviceRequest();
				// request.setParam..  	// set your request params here

				res.add(client.AddEdgeInstanceDevice(request, new ApiCallBack<AddEdgeInstanceDeviceRequest, AddEdgeInstanceDeviceResponse>() {
					@Override
					public void onFailure(AddEdgeInstanceDeviceRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(AddEdgeInstanceDeviceRequest request, AddEdgeInstanceDeviceResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<AddEdgeInstanceDeviceResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<AddEdgeInstanceDriveResponse>> res = new ArrayList<Future<AddEdgeInstanceDriveResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				AddEdgeInstanceDriveRequest request = new AddEdgeInstanceDriveRequest();
				// request.setParam..  	// set your request params here

				res.add(client.AddEdgeInstanceDrive(request, new ApiCallBack<AddEdgeInstanceDriveRequest, AddEdgeInstanceDriveResponse>() {
					@Override
					public void onFailure(AddEdgeInstanceDriveRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(AddEdgeInstanceDriveRequest request, AddEdgeInstanceDriveResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<AddEdgeInstanceDriveResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		AepEdgeGatewayClient client = AepEdgeGatewayClient.newClient().scheme(Scheme.HTTPS).build();

		{
			DeleteEdgeInstanceDeviceRequest request = new DeleteEdgeInstanceDeviceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteEdgeInstanceDevice(request));
		}
		
		{
			QueryEdgeInstanceDeviceRequest request = new QueryEdgeInstanceDeviceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryEdgeInstanceDevice(request));
		}
		
		{
			CreateEdgeInstanceRequest request = new CreateEdgeInstanceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateEdgeInstance(request));
		}
		
		{
			EdgeInstanceDeployRequest request = new EdgeInstanceDeployRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.EdgeInstanceDeploy(request));
		}
		
		{
			DeleteEdgeInstanceRequest request = new DeleteEdgeInstanceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteEdgeInstance(request));
		}
		
		{
			AddEdgeInstanceDeviceRequest request = new AddEdgeInstanceDeviceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.AddEdgeInstanceDevice(request));
		}
		
		{
			AddEdgeInstanceDriveRequest request = new AddEdgeInstanceDriveRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.AddEdgeInstanceDrive(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		AepEdgeGatewayClient client = AepEdgeGatewayClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			DeleteEdgeInstanceDeviceRequest request = new DeleteEdgeInstanceDeviceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteEdgeInstanceDevice(request));
		}
		
		{
			QueryEdgeInstanceDeviceRequest request = new QueryEdgeInstanceDeviceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryEdgeInstanceDevice(request));
		}
		
		{
			CreateEdgeInstanceRequest request = new CreateEdgeInstanceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateEdgeInstance(request));
		}
		
		{
			EdgeInstanceDeployRequest request = new EdgeInstanceDeployRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.EdgeInstanceDeploy(request));
		}
		
		{
			DeleteEdgeInstanceRequest request = new DeleteEdgeInstanceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteEdgeInstance(request));
		}
		
		{
			AddEdgeInstanceDeviceRequest request = new AddEdgeInstanceDeviceRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.AddEdgeInstanceDevice(request));
		}
		
		{
			AddEdgeInstanceDriveRequest request = new AddEdgeInstanceDriveRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.AddEdgeInstanceDrive(request));
		}
		
		client.shutdown();
	}

}
