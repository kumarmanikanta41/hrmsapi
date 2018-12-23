package com.rayistha.tejasapi.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "menu_access")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class MenuAccess extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String menugid;
	private String emprole;
	private String accesstype;

	public String getMenugid() {
		return menugid;
	}

	public void setMenugid(String menugid) {
		this.menugid = menugid;
	}

	public String getEmprole() {
		return emprole;
	}

	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}

	public String getAccesstype() {
		return accesstype;
	}

	public void setAccesstype(String accesstype) {
		this.accesstype = accesstype;
	}

	@Override
	public String toString() {
		return "MenuAccess [menugid=" + menugid + ", emprole=" + emprole + ", accesstype=" + accesstype + ", getId()="
				+ getId() + ", getGid()=" + getGid() + ", getSs()=" + getSs() + ", getCt()=" + getCt() + ", getMt()="
				+ getMt() + ", getSct()=" + getSct() + ", getSmt()=" + getSmt() + "]";
	}

}
