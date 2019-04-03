package com.user.wrapper;

import com.user.vo.UserVO;

public class UserWrapper {

	private Long id;
	private String name;
	private String pass;
	private boolean active;
	private boolean verified;
	private String orgonization;

	public UserWrapper() {
	}

	public UserWrapper(UserVO userPostVO) {
		this.name = userPostVO.getName();
		this.pass = userPostVO.getPass();
		this.active = userPostVO.isActive();
		this.verified = userPostVO.isVerified();
		this.orgonization = userPostVO.getOrgonization();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String getOrgonization() {
		return orgonization;
	}

	public void setOrgonization(String orgonization) {
		this.orgonization = orgonization;
	}

}
