package com.rayistha.tejasapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rayistha.tejasapi.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer>{

	@Query(value="SELECT m FROM Menu m JOIN EmpRole er ON er.empgid = :empGid JOIN MenuAccess ma ON ma.emprole = er.emprole AND ma.menugid = m.gid")
	public List<Menu> findMenuByEmpGid(@Param("empGid") String empGid);
}
