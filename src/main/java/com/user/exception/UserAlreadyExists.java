package com.user.exception;

public class UserAlreadyExists extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8524527187375046272L;

	public UserAlreadyExists(String exceptionMessage, int code, Object data) {
		super(exceptionMessage, code, data);
	}

	public UserAlreadyExists(Object data, String message) {
		super(data, message);
	}

}
