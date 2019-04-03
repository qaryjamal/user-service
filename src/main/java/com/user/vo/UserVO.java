package com.user.vo;

public class UserVO {

	private long id;
	private String name;
	private String pass;
	private boolean active;
	private boolean verified;
	private String orgonization;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserVO() {
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
