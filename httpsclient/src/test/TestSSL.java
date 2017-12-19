package test;

import java.util.HashMap;
import java.util.Map;

import client.util.HttpClientUtil;

//对接口进行测试  
public class TestSSL {
	private String url = "http://localhost:8050/expert/merchandise/selectByPrimaryKey";//接口只是把差un过来的参数返回
	private String charset = "utf-8";
	private HttpClientUtil httpClientUtil = null;

	public TestSSL() {
		httpClientUtil = new HttpClientUtil();
	}
	
	public void test() {
		Map<String, String> createMap = new HashMap<String, String>();
		createMap.put("username", "admin");
		createMap.put("password", "admin");
		String httpOrgCreateTestRtn = httpClientUtil.doPost(url, createMap,
				charset);
		System.out.println("result:" + httpOrgCreateTestRtn); 
	}

	public static void main(String[] args) {
		TestSSL main = new TestSSL();
		main.test();
	}
}