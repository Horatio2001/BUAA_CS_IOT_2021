

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.AepSoftwareUpgradeManagementClient;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.OperationalSoftwareUpgradeTaskRequest;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.OperationalSoftwareUpgradeTaskResponse;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.QuerySoftwareUpgradeSubtasksRequest;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.QuerySoftwareUpgradeSubtasksResponse;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.QuerySoftwareUpgradeTaskRequest;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.QuerySoftwareUpgradeTaskResponse;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.CreateSoftwareUpgradeTaskRequest;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.CreateSoftwareUpgradeTaskResponse;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.ModifySoftwareUpgradeTaskRequest;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.ModifySoftwareUpgradeTaskResponse;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.ControlSoftwareUpgradeTaskRequest;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.ControlSoftwareUpgradeTaskResponse;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.DeleteSoftwareUpgradeTaskRequest;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.DeleteSoftwareUpgradeTaskResponse;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.QuerySoftwareUpradeDeviceListRequest;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.QuerySoftwareUpradeDeviceListResponse;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.QuerySoftwareUpgradeDetailRequest;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.QuerySoftwareUpgradeDetailResponse;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.QuerySoftwareUpgradeTaskListRequest;
import com.ctg.ag.sdk.biz.aep_software_upgrade_management.QuerySoftwareUpgradeTaskListResponse;


public class AepSoftwareUpgradeManagementDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		AepSoftwareUpgradeManagementClient client = AepSoftwareUpgradeManagementClient.newClient().build();

		{
			OperationalSoftwareUpgradeTaskRequest request = new OperationalSoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.OperationalSoftwareUpgradeTask(request));
		}
		
		{
			QuerySoftwareUpgradeSubtasksRequest request = new QuerySoftwareUpgradeSubtasksRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpgradeSubtasks(request));
		}
		
		{
			QuerySoftwareUpgradeTaskRequest request = new QuerySoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpgradeTask(request));
		}
		
		{
			CreateSoftwareUpgradeTaskRequest request = new CreateSoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateSoftwareUpgradeTask(request));
		}
		
		{
			ModifySoftwareUpgradeTaskRequest request = new ModifySoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.ModifySoftwareUpgradeTask(request));
		}
		
		{
			ControlSoftwareUpgradeTaskRequest request = new ControlSoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.ControlSoftwareUpgradeTask(request));
		}
		
		{
			DeleteSoftwareUpgradeTaskRequest request = new DeleteSoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteSoftwareUpgradeTask(request));
		}
		
		{
			QuerySoftwareUpradeDeviceListRequest request = new QuerySoftwareUpradeDeviceListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpradeDeviceList(request));
		}
		
		{
			QuerySoftwareUpgradeDetailRequest request = new QuerySoftwareUpgradeDetailRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpgradeDetail(request));
		}
		
		{
			QuerySoftwareUpgradeTaskListRequest request = new QuerySoftwareUpgradeTaskListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpgradeTaskList(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		AepSoftwareUpgradeManagementClient client = AepSoftwareUpgradeManagementClient.newClient().build();

		{
			
			List<Future<OperationalSoftwareUpgradeTaskResponse>> res = new ArrayList<Future<OperationalSoftwareUpgradeTaskResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				OperationalSoftwareUpgradeTaskRequest request = new OperationalSoftwareUpgradeTaskRequest();
				// request.setParam..  	// set your request params here

				res.add(client.OperationalSoftwareUpgradeTask(request, new ApiCallBack<OperationalSoftwareUpgradeTaskRequest, OperationalSoftwareUpgradeTaskResponse>() {
					@Override
					public void onFailure(OperationalSoftwareUpgradeTaskRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(OperationalSoftwareUpgradeTaskRequest request, OperationalSoftwareUpgradeTaskResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<OperationalSoftwareUpgradeTaskResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QuerySoftwareUpgradeSubtasksResponse>> res = new ArrayList<Future<QuerySoftwareUpgradeSubtasksResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QuerySoftwareUpgradeSubtasksRequest request = new QuerySoftwareUpgradeSubtasksRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QuerySoftwareUpgradeSubtasks(request, new ApiCallBack<QuerySoftwareUpgradeSubtasksRequest, QuerySoftwareUpgradeSubtasksResponse>() {
					@Override
					public void onFailure(QuerySoftwareUpgradeSubtasksRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QuerySoftwareUpgradeSubtasksRequest request, QuerySoftwareUpgradeSubtasksResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QuerySoftwareUpgradeSubtasksResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QuerySoftwareUpgradeTaskResponse>> res = new ArrayList<Future<QuerySoftwareUpgradeTaskResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QuerySoftwareUpgradeTaskRequest request = new QuerySoftwareUpgradeTaskRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QuerySoftwareUpgradeTask(request, new ApiCallBack<QuerySoftwareUpgradeTaskRequest, QuerySoftwareUpgradeTaskResponse>() {
					@Override
					public void onFailure(QuerySoftwareUpgradeTaskRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QuerySoftwareUpgradeTaskRequest request, QuerySoftwareUpgradeTaskResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QuerySoftwareUpgradeTaskResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<CreateSoftwareUpgradeTaskResponse>> res = new ArrayList<Future<CreateSoftwareUpgradeTaskResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				CreateSoftwareUpgradeTaskRequest request = new CreateSoftwareUpgradeTaskRequest();
				// request.setParam..  	// set your request params here

				res.add(client.CreateSoftwareUpgradeTask(request, new ApiCallBack<CreateSoftwareUpgradeTaskRequest, CreateSoftwareUpgradeTaskResponse>() {
					@Override
					public void onFailure(CreateSoftwareUpgradeTaskRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(CreateSoftwareUpgradeTaskRequest request, CreateSoftwareUpgradeTaskResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<CreateSoftwareUpgradeTaskResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<ModifySoftwareUpgradeTaskResponse>> res = new ArrayList<Future<ModifySoftwareUpgradeTaskResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				ModifySoftwareUpgradeTaskRequest request = new ModifySoftwareUpgradeTaskRequest();
				// request.setParam..  	// set your request params here

				res.add(client.ModifySoftwareUpgradeTask(request, new ApiCallBack<ModifySoftwareUpgradeTaskRequest, ModifySoftwareUpgradeTaskResponse>() {
					@Override
					public void onFailure(ModifySoftwareUpgradeTaskRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(ModifySoftwareUpgradeTaskRequest request, ModifySoftwareUpgradeTaskResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<ModifySoftwareUpgradeTaskResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<ControlSoftwareUpgradeTaskResponse>> res = new ArrayList<Future<ControlSoftwareUpgradeTaskResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				ControlSoftwareUpgradeTaskRequest request = new ControlSoftwareUpgradeTaskRequest();
				// request.setParam..  	// set your request params here

				res.add(client.ControlSoftwareUpgradeTask(request, new ApiCallBack<ControlSoftwareUpgradeTaskRequest, ControlSoftwareUpgradeTaskResponse>() {
					@Override
					public void onFailure(ControlSoftwareUpgradeTaskRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(ControlSoftwareUpgradeTaskRequest request, ControlSoftwareUpgradeTaskResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<ControlSoftwareUpgradeTaskResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<DeleteSoftwareUpgradeTaskResponse>> res = new ArrayList<Future<DeleteSoftwareUpgradeTaskResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				DeleteSoftwareUpgradeTaskRequest request = new DeleteSoftwareUpgradeTaskRequest();
				// request.setParam..  	// set your request params here

				res.add(client.DeleteSoftwareUpgradeTask(request, new ApiCallBack<DeleteSoftwareUpgradeTaskRequest, DeleteSoftwareUpgradeTaskResponse>() {
					@Override
					public void onFailure(DeleteSoftwareUpgradeTaskRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(DeleteSoftwareUpgradeTaskRequest request, DeleteSoftwareUpgradeTaskResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<DeleteSoftwareUpgradeTaskResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QuerySoftwareUpradeDeviceListResponse>> res = new ArrayList<Future<QuerySoftwareUpradeDeviceListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QuerySoftwareUpradeDeviceListRequest request = new QuerySoftwareUpradeDeviceListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QuerySoftwareUpradeDeviceList(request, new ApiCallBack<QuerySoftwareUpradeDeviceListRequest, QuerySoftwareUpradeDeviceListResponse>() {
					@Override
					public void onFailure(QuerySoftwareUpradeDeviceListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QuerySoftwareUpradeDeviceListRequest request, QuerySoftwareUpradeDeviceListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QuerySoftwareUpradeDeviceListResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QuerySoftwareUpgradeDetailResponse>> res = new ArrayList<Future<QuerySoftwareUpgradeDetailResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QuerySoftwareUpgradeDetailRequest request = new QuerySoftwareUpgradeDetailRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QuerySoftwareUpgradeDetail(request, new ApiCallBack<QuerySoftwareUpgradeDetailRequest, QuerySoftwareUpgradeDetailResponse>() {
					@Override
					public void onFailure(QuerySoftwareUpgradeDetailRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QuerySoftwareUpgradeDetailRequest request, QuerySoftwareUpgradeDetailResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QuerySoftwareUpgradeDetailResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<QuerySoftwareUpgradeTaskListResponse>> res = new ArrayList<Future<QuerySoftwareUpgradeTaskListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QuerySoftwareUpgradeTaskListRequest request = new QuerySoftwareUpgradeTaskListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QuerySoftwareUpgradeTaskList(request, new ApiCallBack<QuerySoftwareUpgradeTaskListRequest, QuerySoftwareUpgradeTaskListResponse>() {
					@Override
					public void onFailure(QuerySoftwareUpgradeTaskListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QuerySoftwareUpgradeTaskListRequest request, QuerySoftwareUpgradeTaskListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QuerySoftwareUpgradeTaskListResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		AepSoftwareUpgradeManagementClient client = AepSoftwareUpgradeManagementClient.newClient().scheme(Scheme.HTTPS).build();

		{
			OperationalSoftwareUpgradeTaskRequest request = new OperationalSoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.OperationalSoftwareUpgradeTask(request));
		}
		
		{
			QuerySoftwareUpgradeSubtasksRequest request = new QuerySoftwareUpgradeSubtasksRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpgradeSubtasks(request));
		}
		
		{
			QuerySoftwareUpgradeTaskRequest request = new QuerySoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpgradeTask(request));
		}
		
		{
			CreateSoftwareUpgradeTaskRequest request = new CreateSoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateSoftwareUpgradeTask(request));
		}
		
		{
			ModifySoftwareUpgradeTaskRequest request = new ModifySoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.ModifySoftwareUpgradeTask(request));
		}
		
		{
			ControlSoftwareUpgradeTaskRequest request = new ControlSoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.ControlSoftwareUpgradeTask(request));
		}
		
		{
			DeleteSoftwareUpgradeTaskRequest request = new DeleteSoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteSoftwareUpgradeTask(request));
		}
		
		{
			QuerySoftwareUpradeDeviceListRequest request = new QuerySoftwareUpradeDeviceListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpradeDeviceList(request));
		}
		
		{
			QuerySoftwareUpgradeDetailRequest request = new QuerySoftwareUpgradeDetailRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpgradeDetail(request));
		}
		
		{
			QuerySoftwareUpgradeTaskListRequest request = new QuerySoftwareUpgradeTaskListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpgradeTaskList(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		AepSoftwareUpgradeManagementClient client = AepSoftwareUpgradeManagementClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			OperationalSoftwareUpgradeTaskRequest request = new OperationalSoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.OperationalSoftwareUpgradeTask(request));
		}
		
		{
			QuerySoftwareUpgradeSubtasksRequest request = new QuerySoftwareUpgradeSubtasksRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpgradeSubtasks(request));
		}
		
		{
			QuerySoftwareUpgradeTaskRequest request = new QuerySoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpgradeTask(request));
		}
		
		{
			CreateSoftwareUpgradeTaskRequest request = new CreateSoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateSoftwareUpgradeTask(request));
		}
		
		{
			ModifySoftwareUpgradeTaskRequest request = new ModifySoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.ModifySoftwareUpgradeTask(request));
		}
		
		{
			ControlSoftwareUpgradeTaskRequest request = new ControlSoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.ControlSoftwareUpgradeTask(request));
		}
		
		{
			DeleteSoftwareUpgradeTaskRequest request = new DeleteSoftwareUpgradeTaskRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.DeleteSoftwareUpgradeTask(request));
		}
		
		{
			QuerySoftwareUpradeDeviceListRequest request = new QuerySoftwareUpradeDeviceListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpradeDeviceList(request));
		}
		
		{
			QuerySoftwareUpgradeDetailRequest request = new QuerySoftwareUpgradeDetailRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpgradeDetail(request));
		}
		
		{
			QuerySoftwareUpgradeTaskListRequest request = new QuerySoftwareUpgradeTaskListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QuerySoftwareUpgradeTaskList(request));
		}
		
		client.shutdown();
	}

}
