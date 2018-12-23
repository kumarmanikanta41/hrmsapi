package com.rayistha.tejasapi.modal;

import java.io.Serializable;

public class Menu implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private String menugid;
	private String mainMenu;
	private String subMenu;
	private String menuItem;
	private String displayName;
	private String aroute;
	private String menuuri;

	public String getMenugid() {
		return menugid;
	}

	public void setMenugid(String menugid) {
		this.menugid = menugid;
	}

	public String getMainMenu() {
		return mainMenu;
	}

	public void setMainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
	}

	public String getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(String subMenu) {
		this.subMenu = subMenu;
	}

	public String getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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
		return "Menu [menugid=" + menugid + ", mainMenu=" + mainMenu + ", subMenu=" + subMenu + ", menuItem=" + menuItem
				+ ", displayName=" + displayName + ", aroute=" + aroute + ", menuuri=" + menuuri + "]";
	}

}
