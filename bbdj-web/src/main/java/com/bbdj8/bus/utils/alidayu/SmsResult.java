package com.bbdj8.bus.utils.alidayu;

/**
 * 短信发送响应类
 * @author 李文军
 *
 */
public class SmsResult {
	/**
	 * 错误代码
	 */
	private String err_code;
	/**
	 * 反馈结果
	 */
	private String model;
	/**
	 * true表示成功，false表示失败
	 */
	private boolean success;
	/**
	 * 返回信息描述
	 */
	private String msg;
	public String getErr_code() {
		return err_code;
	}
	public void setErr_code(String err_code) {
		this.err_code = err_code;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
