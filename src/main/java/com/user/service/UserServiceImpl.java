package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.user.model.User;
import com.user.repository.UserRepo;
import com.user.wrapper.UserWrapper;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public String saveUser(UserWrapper userWrapper) throws Exception {
		User user = new User(userWrapper);
		this.userRepo.save(user);
		return "SUCCESS";
	}

	@Override
	public String getUser(UserWrapper userWrapper) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserWrapper getUserByName(String name) throws Exception {
		User user = this.userRepo.findByName(name);
		if (user != null) {
			UserWrapper userWrapper = new UserWrapper();
			userWrapper.setId(user.getId());
			userWrapper.setName(user.getName());
			userWrapper.setActive(user.isActive());
			userWrapper.setVerified(user.isVerified());
			userWrapper.setOrgonization(user.getOrgonization());
			return userWrapper;
		}

		return null;
	}

	@Override
	public String updateUser(UserWrapper userWrapper) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
