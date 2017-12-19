package httpclient;

public class test1 {
	 public static void main(String[] args) {
	        //发送 GET 请求 测试的使用本地的项目，为post请求
	        String s=HttpRequest.sendGet("http://localhost:8050/expert/merchandise/selectByPrimaryKey", "username=admin&password=admin");
	        System.out.println(s);
	        
	        //发送 POST 请求
	      /*  String sr=HttpRequest.sendPost("http://localhost:8050/shirotestssm/login.do", "username=admin&password=admin");
	        System.out.println(sr);*/
	    }
}
