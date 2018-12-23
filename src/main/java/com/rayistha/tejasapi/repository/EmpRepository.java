package com.rayistha.tejasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rayistha.tejasapi.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer>{

	@Query(value="SELECT e FROM Emp e JOIN Auth a ON e.gid = a.empgid AND e.loginid = :loginId AND a.passkey = :passKey")
	public Emp findEmpByLoginIdAndPassKey(@Param("loginId") String loginId, @Param("passKey") String passKey);
}
