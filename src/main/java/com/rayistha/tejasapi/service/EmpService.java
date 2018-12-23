package com.rayistha.tejasapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rayistha.tejasapi.entity.Emp;
import com.rayistha.tejasapi.modal.EmpReq;
import com.rayistha.tejasapi.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private EmpRepository empRepository;

	@Transactional
	public Emp saveEmp(EmpReq empReq) {
		Emp emp = new Emp();
		emp.setLoginid(empReq.getLoginid());
		emp.setFirstname(empReq.getFirstname());
		emp.setMiddlename(empReq.getMiddlename());
		emp.setLastname(empReq.getLastname());
		emp.setDisplayname(empReq.getDisplayname());
		emp.setEmpno(empReq.getEmpno());
		emp.setShortname(empReq.getShortname());
		emp.setGender(empReq.getGender());
		emp.setStatus(empReq.getStatus());
		emp.setIsactive(1);
		emp.setSs(0);
		emp.setType(empReq.getType());
		emp.setGid(UUID.randomUUID().toString());
		emp = empRepository.save(emp);
		return emp;
	}
	
	public List<Emp> getAllEmp(){
		List<Emp> emps = new ArrayList<Emp>();
		
		for (Emp emp : empRepository.findAll()) {
			emps.add(emp);
		}
		
		return emps;
	}
	
}
