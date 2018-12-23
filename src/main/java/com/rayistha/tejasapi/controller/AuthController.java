package com.rayistha.tejasapi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rayistha.tejasapi.modal.AuthReq;
import com.rayistha.tejasapi.modal.Context;
import com.rayistha.tejasapi.redis.RedisRepository;
import com.rayistha.tejasapi.service.AuthService;

@RestController
public class AuthController {

	@Autowired
	private AuthService authService;

	@Autowired
	private RedisRepository redisRepository;

	@PostMapping(value = "/login/validate", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity authenticate(@RequestBody AuthReq authReq, HttpServletRequest request,
			HttpServletResponse response) {
		Context context = authService.authenticate(authReq, request.getSession().getId());
		redisRepository.set(context);
		ResponseEntity responseEntity = null;
		if (context != null) {
			responseEntity = new ResponseEntity<Context>(context, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity("User Not Exist or Password Mismatch", HttpStatus.UNAUTHORIZED);
		}
		return responseEntity;
	}

}
