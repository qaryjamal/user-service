package com.user.exception;

public class BaseException extends Exception {
	private static final long serialVersionUID = -1L;
	private Object data;
	private int code;
	private String message;

	public BaseException(String message, int code, Object data) {
		this.message = message;
		this.code = code;
		this.data = data;
	}

	public BaseException(Object data, String message) {
		this.data = data;
		this.message = message;
	}

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
