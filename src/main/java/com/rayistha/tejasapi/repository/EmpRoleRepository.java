package com.rayistha.tejasapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rayistha.tejasapi.entity.EmpRole;

public interface EmpRoleRepository extends JpaRepository<EmpRole, Integer> {

	public List<EmpRole> findByempgid(String empGid);
	
}
