

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.UsrClient;
import com.ctg.ag.sdk.biz.usr.SdkDownloadRequest;
import com.ctg.ag.sdk.biz.usr.SdkDownloadResponse;


public class UsrDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		UsrClient client = UsrClient.newClient().build();

		{
			SdkDownloadRequest request = new SdkDownloadRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.SdkDownload(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		UsrClient client = UsrClient.newClient().build();

		{
			
			List<Future<SdkDownloadResponse>> res = new ArrayList<Future<SdkDownloadResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				SdkDownloadRequest request = new SdkDownloadRequest();
				// request.setParam..  	// set your request params here

				res.add(client.SdkDownload(request, new ApiCallBack<SdkDownloadRequest, SdkDownloadResponse>() {
					@Override
					public void onFailure(SdkDownloadRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(SdkDownloadRequest request, SdkDownloadResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<SdkDownloadResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		UsrClient client = UsrClient.newClient().scheme(Scheme.HTTPS).build();

		{
			SdkDownloadRequest request = new SdkDownloadRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.SdkDownload(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		UsrClient client = UsrClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			SdkDownloadRequest request = new SdkDownloadRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.SdkDownload(request));
		}
		
		client.shutdown();
	}

}
