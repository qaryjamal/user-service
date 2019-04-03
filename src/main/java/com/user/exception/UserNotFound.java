package com.user.exception;

public class UserNotFound extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8524527187375046272L;

	public UserNotFound(String exceptionMessage, int code, Object data) {
		super(exceptionMessage, code, data);
	}

}
