package com.gxyj.test.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
	
	private Integer userId;
	
	private String userName;
	
	public UserDTO(){}
	
	public UserDTO(Integer userid,String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
