package com.user.service;

import com.user.wrapper.UserWrapper;

public interface UserService {

	String saveUser(UserWrapper userWrapper) throws Exception;

	String getUser(UserWrapper userWrapper) throws Exception;

	String updateUser(UserWrapper userWrapper) throws Exception;

	String deleteUser(long id) throws Exception;

	UserWrapper getUserByName(String userName) throws Exception;

}
