package com.rayistha.tejasapi.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Emp")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Emp extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String loginid;
	private String firstname;
	private String middlename;
	private String lastname;
	private String displayname;
	private String empno;
	private String shortname;
	private String gender;
	private String status;
	private Integer isactive;
	private String type;

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDisplayname() {
		return displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getIsactive() {
		return isactive;
	}

	public void setIsactive(Integer isactive) {
		this.isactive = isactive;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Emp [loginid=" + loginid + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname="
				+ lastname + ", displayname=" + displayname + ", empno=" + empno + ", shortname=" + shortname
				+ ", gender=" + gender + ", status=" + status + ", isactive=" + isactive + ", type=" + type
				+ ", getId()=" + getId() + ", getGid()=" + getGid() + ", getSs()=" + getSs() + ", getCt()=" + getCt()
				+ ", getMt()=" + getMt() + ", getSct()=" + getSct() + ", getSmt()=" + getSmt() + "]";
	}

}