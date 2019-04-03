package com.user.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserUtils {

	public static String encodPassword(String pass) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.encode(pass);
	}

}
