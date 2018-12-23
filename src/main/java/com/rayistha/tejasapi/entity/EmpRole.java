package com.rayistha.tejasapi.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "emp_role")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class EmpRole extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String empgid;
	private String emprole;
	public String getEmpgid() {
		return empgid;
	}
	public void setEmpgid(String empgid) {
		this.empgid = empgid;
	}
	public String getEmprole() {
		return emprole;
	}
	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}

	@Override
	public String toString() {
		return "EmpRole [empgid=" + empgid + ", emprole=" + emprole + ", getId()=" + getId() + ", getGid()=" + getGid()
				+ ", getSs()=" + getSs() + ", getCt()=" + getCt() + ", getMt()=" + getMt() + ", getSct()=" + getSct()
				+ ", getSmt()=" + getSmt() + "]";
	}
	
}
