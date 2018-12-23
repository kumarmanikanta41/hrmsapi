package com.rayistha.tejasapi.modal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Context implements Serializable {

	private static final long serialVersionUID = 1L;
	private String loginId;
	private String displayName;
	private String shortName;
	private String empNo;
	private String empGid;
	private String sessionId;
	private List<String> empRoles = new ArrayList<String>();

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpGid() {
		return empGid;
	}

	public void setEmpGid(String empGid) {
		this.empGid = empGid;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public List<String> getEmpRoles() {
		return empRoles;
	}

	public void setEmpRoles(List<String> empRoles) {
		this.empRoles = empRoles;
	}

	@Override
	public String toString() {
		return "Context [loginId=" + loginId + ", displayName=" + displayName + ", shortName=" + shortName + ", empNo="
				+ empNo + ", empGid=" + empGid + ", sessionId=" + sessionId + ", empRoles=" + empRoles + "]";
	}

}
