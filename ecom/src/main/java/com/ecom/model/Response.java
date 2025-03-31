package com.ecom.model;

public class Response {

	private String responseCode;
	private String responseDesc;
	private Object data;
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDesc() {
		return responseDesc;
	}
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Response(String responseCode, String responseDesc, Object data) {
		
		this.responseCode = responseCode;
		this.responseDesc = responseDesc;
		this.data = data;
	}
	public Response() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Response [responseCode=" + responseCode + ", responseDesc=" + responseDesc + ", data=" + data + "]";
	}
	
	
	
	
	
}
