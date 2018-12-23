package com.rayistha.tejasapi.modal;

public class AuthReq {

	private String loginId;
	private String passKey;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassKey() {
		return passKey;
	}

	public void setPassKey(String passKey) {
		this.passKey = passKey;
	}

	@Override
	public String toString() {
		return "AuthReq [loginId=" + loginId + ", passKey=" + passKey + "]";
	}

}
