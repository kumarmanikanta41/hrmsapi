package com.rayistha.tejasapi.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Menu")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Menu extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private String mainmenu;
	private String submenu;
	private String menuitem;
	private String displayname;
	private String aroute;
	private String menuuri;

	public String getMainmenu() {
		return mainmenu;
	}

	public void setMainmenu(String mainmenu) {
		this.mainmenu = mainmenu;
	}

	public String getSubmenu() {
		return submenu;
	}

	public void setSubmenu(String submenu) {
		this.submenu = submenu;
	}

	public String getMenuitem() {
		return menuitem;
	}

	public void setMenuitem(String menuitem) {
		this.menuitem = menuitem;
	}

	public String getDisplayname() {
		return displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public String getAroute() {
		return aroute;
	}

	public void setAroute(String aroute) {
		this.aroute = aroute;
	}

	public String getMenuuri() {
		return menuuri;
	}

	public void setMenuuri(String menuuri) {
		this.menuuri = menuuri;
	}

	@Override
	public String toString() {
		return "Menu [mainmenu=" + mainmenu + ", submenu=" + submenu + ", menuitem=" + menuitem + ", displayname="
				+ displayname + ", aroute=" + aroute + ", menuuri=" + menuuri + "]";
	}

}
