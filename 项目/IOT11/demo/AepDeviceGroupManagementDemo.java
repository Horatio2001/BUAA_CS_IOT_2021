

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.AepDeviceGroupManagementClient;
import com.ctg.ag.sdk.biz.aep_device_group_management.CreateDeviceGroupRequest;
import com.ctg.ag.sdk.biz.aep_device_group_management.CreateDeviceGroupResponse;
import com.ctg.ag.sdk.biz.aep_device_group_management.UpdateDeviceGroupRequest;
import com.ctg.ag.sdk.biz.aep_device_group_management.UpdateDeviceGroupResponse;
import com.ctg.ag.sdk.biz.aep_device_group_management.DeleteDeviceGroupRequest;
import com.ctg.ag.sdk.biz.aep_device_group_management.DeleteDeviceGroupResponse;
import com.ctg.ag.sdk.biz.aep_device_group_management.QueryDeviceGroupListRequest;
import com.ctg.ag.sdk.biz.aep_device_group_management.QueryDeviceGroupListResponse;
import com.ctg.ag.sdk.biz.aep_device_group_management.QueryGroupDeviceListRequest;
import com.ctg.ag.sdk.biz.aep_device_group_management.QueryGroupDeviceListResponse;
import com.ctg.ag.sdk.biz.aep_device_group_management.UpdateDeviceGroupRelationRequest;
import com.ctg.ag.sdk.biz.aep_device_group_management.UpdateDeviceGroupRelationResponse;
import com.ctg.ag.sdk.biz.aep_device_group_management.GetGroupDetailByDeviceIdRequest;
import com.ctg.ag.sdk.biz.aep_device_group_management.GetGroupDetailByDeviceIdResponse;


public class AepDeviceGroupManagementDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		AepDeviceGroupManagementClient client = AepDeviceGroupManagementClient.newClient().build();

		{
			CreateDeviceGroupRequest request = new CreateDeviceGroupRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateDeviceGroup(request));
		}
		
		{
			UpdateDeviceGroupRequest request = new UpdateDeviceGroupRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateDeviceGroup(request));
		}
		
		{
			DeleteDeviceGroupRequest request = new DeleteDeviceGroupRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteDeviceGroup(request));
		}
		
		{
			QueryDeviceGroupListRequest request = new QueryDeviceGroupListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryDeviceGroupList(request));
		}
		
		{
			QueryGroupDeviceListRequest request = new QueryGroupDeviceListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryGroupDeviceList(request));
		}
		
		{
			UpdateDeviceGroupRelationRequest request = new UpdateDeviceGroupRelationRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateDeviceGroupRelation(request));
		}
		
		{
			GetGroupDetailByDeviceIdRequest request = new GetGroupDetailByDeviceIdRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.getGroupDetailByDeviceId(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		AepDeviceGroupManagementClient client = AepDeviceGroupManagementClient.newClient().build();

		{
			
			List<Future<CreateDeviceGroupResponse>> res = new ArrayList<Future<CreateDeviceGroupResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				CreateDeviceGroupRequest request = new CreateDeviceGroupRequest();
				// request.setParam..  	// set your request params here

				res.add(client.CreateDeviceGroup(request, new ApiCallBack<CreateDeviceGroupRequest, CreateDeviceGroupResponse>() {
					@Override
					public void onFailure(CreateDeviceGroupRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(CreateDeviceGroupRequest request, CreateDeviceGroupResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<CreateDeviceGroupResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<UpdateDeviceGroupResponse>> res = new ArrayList<Future<UpdateDeviceGroupResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				UpdateDeviceGroupRequest request = new UpdateDeviceGroupRequest();
				// request.setParam..  	// set your request params here

				res.add(client.UpdateDeviceGroup(request, new ApiCallBack<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse>() {
					@Override
					public void onFailure(UpdateDeviceGroupRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(UpdateDeviceGroupRequest request, UpdateDeviceGroupResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<UpdateDeviceGroupResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<DeleteDeviceGroupResponse>> res = new ArrayList<Future<DeleteDeviceGroupResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				DeleteDeviceGroupRequest request = new DeleteDeviceGroupRequest();
				// request.setParam..  	// set your request params here

				res.add(client.DeleteDeviceGroup(request, new ApiCallBack<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse>() {
					@Override
					public void onFailure(DeleteDeviceGroupRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(DeleteDeviceGroupRequest request, DeleteDeviceGroupResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<DeleteDeviceGroupResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryDeviceGroupListResponse>> res = new ArrayList<Future<QueryDeviceGroupListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryDeviceGroupListRequest request = new QueryDeviceGroupListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryDeviceGroupList(request, new ApiCallBack<QueryDeviceGroupListRequest, QueryDeviceGroupListResponse>() {
					@Override
					public void onFailure(QueryDeviceGroupListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryDeviceGroupListRequest request, QueryDeviceGroupListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryDeviceGroupListResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QueryGroupDeviceListResponse>> res = new ArrayList<Future<QueryGroupDeviceListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryGroupDeviceListRequest request = new QueryGroupDeviceListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryGroupDeviceList(request, new ApiCallBack<QueryGroupDeviceListRequest, QueryGroupDeviceListResponse>() {
					@Override
					public void onFailure(QueryGroupDeviceListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryGroupDeviceListRequest request, QueryGroupDeviceListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryGroupDeviceListResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<UpdateDeviceGroupRelationResponse>> res = new ArrayList<Future<UpdateDeviceGroupRelationResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				UpdateDeviceGroupRelationRequest request = new UpdateDeviceGroupRelationRequest();
				// request.setParam..  	// set your request params here

				res.add(client.UpdateDeviceGroupRelation(request, new ApiCallBack<UpdateDeviceGroupRelationRequest, UpdateDeviceGroupRelationResponse>() {
					@Override
					public void onFailure(UpdateDeviceGroupRelationRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(UpdateDeviceGroupRelationRequest request, UpdateDeviceGroupRelationResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<UpdateDeviceGroupRelationResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<GetGroupDetailByDeviceIdResponse>> res = new ArrayList<Future<GetGroupDetailByDeviceIdResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				GetGroupDetailByDeviceIdRequest request = new GetGroupDetailByDeviceIdRequest();
				// request.setParam..  	// set your request params here

				res.add(client.getGroupDetailByDeviceId(request, new ApiCallBack<GetGroupDetailByDeviceIdRequest, GetGroupDetailByDeviceIdResponse>() {
					@Override
					public void onFailure(GetGroupDetailByDeviceIdRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(GetGroupDetailByDeviceIdRequest request, GetGroupDetailByDeviceIdResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<GetGroupDetailByDeviceIdResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		AepDeviceGroupManagementClient client = AepDeviceGroupManagementClient.newClient().scheme(Scheme.HTTPS).build();

		{
			CreateDeviceGroupRequest request = new CreateDeviceGroupRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateDeviceGroup(request));
		}
		
		{
			UpdateDeviceGroupRequest request = new UpdateDeviceGroupRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateDeviceGroup(request));
		}
		
		{
			DeleteDeviceGroupRequest request = new DeleteDeviceGroupRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteDeviceGroup(request));
		}
		
		{
			QueryDeviceGroupListRequest request = new QueryDeviceGroupListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryDeviceGroupList(request));
		}
		
		{
			QueryGroupDeviceListRequest request = new QueryGroupDeviceListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryGroupDeviceList(request));
		}
		
		{
			UpdateDeviceGroupRelationRequest request = new UpdateDeviceGroupRelationRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateDeviceGroupRelation(request));
		}
		
		{
			GetGroupDetailByDeviceIdRequest request = new GetGroupDetailByDeviceIdRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.getGroupDetailByDeviceId(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		AepDeviceGroupManagementClient client = AepDeviceGroupManagementClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			CreateDeviceGroupRequest request = new CreateDeviceGroupRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateDeviceGroup(request));
		}
		
		{
			UpdateDeviceGroupRequest request = new UpdateDeviceGroupRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateDeviceGroup(request));
		}
		
		{
			DeleteDeviceGroupRequest request = new DeleteDeviceGroupRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteDeviceGroup(request));
		}
		
		{
			QueryDeviceGroupListRequest request = new QueryDeviceGroupListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryDeviceGroupList(request));
		}
		
		{
			QueryGroupDeviceListRequest request = new QueryGroupDeviceListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryGroupDeviceList(request));
		}
		
		{
			UpdateDeviceGroupRelationRequest request = new UpdateDeviceGroupRelationRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.UpdateDeviceGroupRelation(request));
		}
		
		{
			GetGroupDetailByDeviceIdRequest request = new GetGroupDetailByDeviceIdRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.getGroupDetailByDeviceId(request));
		}
		
		client.shutdown();
	}

}
