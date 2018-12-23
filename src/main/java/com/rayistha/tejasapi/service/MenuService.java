package com.rayistha.tejasapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rayistha.tejasapi.modal.Context;
import com.rayistha.tejasapi.modal.Menu;
import com.rayistha.tejasapi.repository.MenuRepository;

@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;

	public List<Menu> getAllMenus(Context context) {
		List<Menu> returnMenus = new ArrayList<Menu>();
		List<com.rayistha.tejasapi.entity.Menu> menus = menuRepository.findMenuByEmpGid(context.getEmpGid());
		for (com.rayistha.tejasapi.entity.Menu menu : menus) {
			Menu menu2 = new Menu();
			menu2.setAroute(menu.getAroute());
			menu2.setDisplayName(menu.getDisplayname());
			menu2.setMainMenu(menu.getMainmenu());
			menu2.setMenugid(menu.getGid());
			menu2.setMenuItem(menu.getMenuitem());
			menu2.setMenuuri(menu.getMenuuri());
			menu2.setSubMenu(menu.getSubmenu());
			returnMenus.add(menu2);
		}
		return returnMenus;
	}
}
