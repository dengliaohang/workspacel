package com.bbdj8.bus.utils;

import com.bbdj8.bus.utils.alidayu.AlidayuSms;

/**
 * 消息工具类
 * @author liwenjun
 *
 */
public class MessageUtil {
	
	/**
	 * 发送通知取件短信
	 * @param tels 电话 收件人
	 * @param courierTel 快递员电话
	 * @return
	 */
	public static String sendNotice(String tels,String courierTel){
		String param = "{e:'"+courierTel+"',a:'林荫大道30号楼1单元106',t:'"+Constant.TEL+"'}";
		AlidayuSms.send(param, tels, Constant.SMS_NOTICE_TEMPLATE);
		return "发送成功";
	}
}
