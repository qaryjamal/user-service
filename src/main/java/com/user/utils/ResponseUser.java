package com.user.utils;

public class ResponseUser {

	private Object data;
	private int code;
	private String message;

	public ResponseUser() {
	}

	public ResponseUser(Object data, int code, String message) {
		this.data = data;
		this.code = code;
		this.message = message;
	}

	public ResponseUser(Object object, String message) {
		this.data = object;
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
