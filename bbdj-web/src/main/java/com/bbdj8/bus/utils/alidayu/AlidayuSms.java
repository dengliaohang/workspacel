package com.bbdj8.bus.utils.alidayu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbdj8.bus.utils.Constant;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

/**
 * 阿里大于短信
 * @author 李文军
 *
 */
public class AlidayuSms {
	private static Logger logger = LoggerFactory.getLogger(AlidayuSms.class);
//	private static String url = "";
//	private static String appkey = "";
//	private static String secret = "";
	private static String url = "http://gw.api.taobao.com/router/rest";
	private static String appkey = "23635836";
	private static String secret = "6547b67dc0f028cf4a2d442bdc302bef";

	/**
	 * 短信发送
	 * @param param 参数
	 * @param tels 收件人
	 * @param template 模板
	 * @return
	 */
	public static String send(String param,String tels,String template) {
		logger.error("发送短信===tels--->"+param+"===tels--->"+tels+"===template--->"+template);
//		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
//		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
//		req.setExtend("");
//		req.setSmsType("normal");
//		req.setSmsFreeSignName("宝贝到家");
//		req.setSmsParamString(param);
//		req.setRecNum(tels);
//		req.setSmsTemplateCode(template);
//		AlibabaAliqinFcSmsNumSendResponse rsp;
//		try {
//			rsp = client.execute(req);
//			logger.error("发送短信反馈===rsp.getBody()--->"+rsp.getBody());
//			return rsp.getBody();
//		} catch (ApiException e) {
//			e.printStackTrace();
//		}
		return "error";
	}

	public static void main(String[] args) {
//		String param = "{e:'',a:'林荫大道30号楼1单元106',t:'17319089869'}";
		String tel = "18623682292";
		System.out.println(tel.substring(0,111));
//		System.out.println(send(param, tel,Constant.SMS_NOTICE_TEMPLATE));
	}
	/**
	 * 发件模板参数
	 * @param express 快递公司
	 * @param addr 取件地址
	 * @param tel 联系电话
	 * @return
	 */
	public static String getOutParam(String express,String addr,String tel){
		return "";
	}
}
