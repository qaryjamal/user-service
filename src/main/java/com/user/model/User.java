package com.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.user.utils.UserUtils;
import com.user.wrapper.UserWrapper;

@Entity(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Column(name = "name", unique = true)
	private String name;
	@NotNull
	private String pass;
	private boolean active;
	private boolean verified;
	private String orgonization;

	public User() {
	}

	public User(UserWrapper userWrapper) {
		this.name = userWrapper.getName();
		this.pass = UserUtils.encodPassword(userWrapper.getPass());
		this.active = userWrapper.isActive();
		this.verified = userWrapper.isVerified();
		this.orgonization = userWrapper.getOrgonization();
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
