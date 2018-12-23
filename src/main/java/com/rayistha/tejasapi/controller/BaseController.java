package com.rayistha.tejasapi.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.rayistha.tejasapi.modal.Context;
import com.rayistha.tejasapi.redis.RedisRepository;

public class BaseController {

	@Autowired
	private RedisRepository redisRepository;

	public Context validateJSessionIdInRedis(HttpServletRequest request) {
		Context context = null;
		for (Cookie cookie : request.getCookies()) {
			if (cookie.getName().equals("JSESSIONID")) {
				context = redisRepository.get(cookie.getValue());
				if (context.getEmpGid() != null) {
					redisRepository.set(context);
				}
				break;
			}
		}
		return context;
	}
}
