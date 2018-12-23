package com.rayistha.tejasapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rayistha.tejasapi.entity.Emp;
import com.rayistha.tejasapi.modal.EmpReq;
import com.rayistha.tejasapi.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;

	@PostMapping(value = "/emp")
	public Emp saveEmp(@RequestBody EmpReq empReq) {
		System.out.println(empReq);
		Emp emp = empService.saveEmp(empReq);
		return emp;
	}

	@GetMapping(value = "/emp")
	public List<Emp> findAllEmp() {
		return empService.getAllEmp();
	}

}
