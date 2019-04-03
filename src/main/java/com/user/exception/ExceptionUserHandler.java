package com.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.user.utils.ResponseUser;

@ControllerAdvice
public class ExceptionUserHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> exceptionUserHandler(Exception exception) {
		return new ResponseEntity<>(new ResponseUser(null, 0, "INTERNAL SERVER ERROR"),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(UserAlreadyExists.class)
	public ResponseEntity<?> userAlreadyExistsHandler(UserAlreadyExists exception) {
		return new ResponseEntity<>(new ResponseUser(null, exception.getCode(), exception.getMessage()),
				HttpStatus.CONFLICT);
	}

	@ExceptionHandler(UserNotFound.class)
	public ResponseEntity<?> userNotFoundHandler(UserNotFound exception) {
		return new ResponseEntity<>(new ResponseUser(null, exception.getCode(), exception.getMessage()),
				HttpStatus.NOT_FOUND);
	}

}
