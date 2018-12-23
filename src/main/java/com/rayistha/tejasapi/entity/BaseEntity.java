package com.rayistha.tejasapi.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rayistha.tejasapi.constant.Constants;

@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String gid;
	private Integer ss;
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DD HH:MM:SS.SSS")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private String ct;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private String mt;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private String sct;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private String smt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public Integer getSs() {
		return ss;
	}

	public void setSs(Integer ss) {
		this.ss = ss;
	}

	public String getCt() {
		return ct;
	}

	public void setCt(String ct) {
		this.ct = ct;
	}

	public String getMt() {
		return mt;
	}

	public void setMt(String mt) {
		this.mt = mt;
	}

	public String getSct() {
		return sct;
	}

	public void setSct(String sct) {
		this.sct = sct;
	}

	public String getSmt() {
		return smt;
	}

	public void setSmt(String smt) {
		this.smt = smt;
	}

	@PrePersist
	public void prePersist() {
		this.gid = UUID.randomUUID().toString();
		Date date = new Date();
		this.ct = Constants.DATE_FORMAT.format(date);
		this.sct = Constants.DATE_FORMAT.format(date);
		this.mt = Constants.DATE_FORMAT.format(date);
		this.smt = Constants.DATE_FORMAT.format(date);
	}

	@PreUpdate
	public void preUpdate() {
		Date date = new Date();
		this.mt = Constants.DATE_FORMAT.format(date);
		this.smt = Constants.DATE_FORMAT.format(date);
	}
}
