package com.rayistha.tejasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rayistha.tejasapi.entity.Auth;

public interface AuthRepository extends JpaRepository<Auth, Integer> {

}
