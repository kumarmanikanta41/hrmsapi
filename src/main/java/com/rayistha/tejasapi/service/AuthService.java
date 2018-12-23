package com.rayistha.tejasapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rayistha.tejasapi.entity.Emp;
import com.rayistha.tejasapi.entity.EmpRole;
import com.rayistha.tejasapi.modal.AuthReq;
import com.rayistha.tejasapi.modal.Context;
import com.rayistha.tejasapi.repository.EmpRepository;
import com.rayistha.tejasapi.repository.EmpRoleRepository;

@Service
public class AuthService {

	@Autowired
	private EmpRepository empRepository;

	@Autowired
	private EmpRoleRepository empRoleRepository;

	public Context authenticate(AuthReq authReq, String sessionId) {
		Context context = null;
		Emp emp = empRepository.findEmpByLoginIdAndPassKey(authReq.getLoginId(), authReq.getPassKey());
		if (emp != null) {
			context = new Context();
			context.setDisplayName(emp.getDisplayname());
			context.setEmpNo(emp.getEmpno());
			context.setLoginId(emp.getLoginid());
			context.setShortName(emp.getShortname());
			context.setEmpGid(emp.getGid());
			context.setSessionId(sessionId);
			List<EmpRole> empRoles = empRoleRepository.findByempgid(emp.getGid());
			for (EmpRole empRole : empRoles) {
				context.getEmpRoles().add(empRole.getEmprole());
			}
		}
		return context;
	}
}
