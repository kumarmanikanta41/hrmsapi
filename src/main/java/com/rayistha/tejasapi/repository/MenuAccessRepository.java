package com.rayistha.tejasapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rayistha.tejasapi.entity.MenuAccess;

public interface MenuAccessRepository extends JpaRepository<MenuAccess, Integer> {

	public List<MenuAccess> findBymenugid(String menuGid);
}
