package com.rayistha.tejasapi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rayistha.tejasapi.modal.Context;
import com.rayistha.tejasapi.modal.Menu;
import com.rayistha.tejasapi.service.MenuService;

@RestController
public class MenuController extends BaseController {

	@Autowired
	public MenuService menuService;

	@GetMapping(value = "/menus", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity getMenus(HttpServletRequest request, HttpServletResponse response) {
		List<Menu> menus = new ArrayList<Menu>();
		ResponseEntity responseEntity = new ResponseEntity("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
		Context context = validateJSessionIdInRedis(request);
		if (context.getEmpGid() != null) {
			menus = menuService.getAllMenus(context);
			responseEntity = new ResponseEntity(menus, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity("You are unauthorized", HttpStatus.UNAUTHORIZED);
		}
		return responseEntity;
	}

}
