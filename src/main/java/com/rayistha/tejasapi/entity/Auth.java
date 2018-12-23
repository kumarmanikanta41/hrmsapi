package com.rayistha.tejasapi.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Auth")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Auth extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String empgid;
	private String passkey;
	private String authstatus;
	private String authuri;
	private String authtype;

	public String getEmpgid() {
		return empgid;
	}

	public void setEmpgid(String empgid) {
		this.empgid = empgid;
	}

	public String getPasskey() {
		return passkey;
	}

	public void setPasskey(String passkey) {
		this.passkey = passkey;
	}

	public String getAuthstatus() {
		return authstatus;
	}

	public void setAuthstatus(String authstatus) {
		this.authstatus = authstatus;
	}

	public String getAuthuri() {
		return authuri;
	}

	public void setAuthuri(String authuri) {
		this.authuri = authuri;
	}

	public String getAuthtype() {
		return authtype;
	}

	public void setAuthtype(String authtype) {
		this.authtype = authtype;
	}

	@Override
	public String toString() {
		return "Auth [empgid=" + empgid + ", passkey=" + passkey + ", authstatus=" + authstatus + ", authuri=" + authuri
				+ ", authtype=" + authtype + ", getId()=" + getId() + ", getGid()=" + getGid() + ", getSs()=" + getSs()
				+ ", getCt()=" + getCt() + ", getMt()=" + getMt() + ", getSct()=" + getSct() + ", getSmt()=" + getSmt()
				+ "]";
	}

}
