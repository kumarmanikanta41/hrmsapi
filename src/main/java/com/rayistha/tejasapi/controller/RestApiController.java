package com.rayistha.tejasapi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rayistha.tejasapi.entity.Auth;
import com.rayistha.tejasapi.modal.Context;
import com.rayistha.tejasapi.repository.AuthRepository;

@RestController
@RequestMapping("/auth")
public class RestApiController extends BaseController {

	@Autowired
	private AuthRepository authRepository;

	@GetMapping
	public ResponseEntity list(HttpServletRequest request) {
		List<Auth> auths = authRepository.findAll();
		ResponseEntity responseEntity = new ResponseEntity("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
		Context context = validateJSessionIdInRedis(request);
		if (context.getEmpGid() != null) {
			auths = authRepository.findAll();
			responseEntity = new ResponseEntity(auths, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity("You are unauthorized", HttpStatus.UNAUTHORIZED);
		}
		return responseEntity;
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Auth create(@RequestBody Auth auth) {
		return authRepository.save(auth);
	}

	@GetMapping("/{id}")
	public Auth get(@PathVariable("id") Integer id) {
		return authRepository.getOne(id);
	}

}
