package com.user.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.exception.UserAlreadyExists;
import com.user.exception.UserNotFound;
import com.user.service.UserService;
import com.user.utils.ResponseUser;
import com.user.vo.UserVO;
import com.user.wrapper.UserWrapper;

@RestController
@RequestMapping("/api/")
public class UserController {

	Logger logger = LogManager.getLogger(UserController.class);

	
	@Autowired
	private UserService userService;

	@PostMapping("user")
	public ResponseEntity<?> createUser(@RequestBody UserVO userPostVO) throws Exception {
		logger.info("CreateUser Called.............................");
		if (this.userService.getUserByName(userPostVO.getName()) != null) {
			throw new UserAlreadyExists("User Already Exists", HttpStatus.CONFLICT.value(), null);
		}
		this.userService.saveUser(new UserWrapper(userPostVO));

		logger.info("CreateUser Finished.......................");
		return new ResponseEntity<>(new ResponseUser(null, HttpStatus.CREATED.value(), HttpStatus.CREATED.toString()),
				HttpStatus.CREATED);
	}

	@PutMapping("user")
	public ResponseEntity<?> updateUser(@RequestBody UserVO userVO) throws Exception {
		logger.info("CreateUser Called.............................");

		if (userVO.getId() <= 0) {
			throw new UserNotFound(null, HttpStatus.NOT_FOUND.value(), "User Not Found. Plese select proper user");
		}
		if (this.userService.getUserByName(userVO.getName()) != null) {
			throw new UserAlreadyExists(null, HttpStatus.CONFLICT.value(), "User Already Exists");
		}
		this.userService.saveUser(new UserWrapper(userVO));

		logger.info("CreateUser Finished.......................");
		return new ResponseEntity<>(new ResponseUser(null, HttpStatus.CREATED.value(), "User Created Successfully."),
				HttpStatus.CREATED);
	}
}
