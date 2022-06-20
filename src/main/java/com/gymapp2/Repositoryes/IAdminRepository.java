package com.gymapp2.Repositoryes;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gymapp2.model.Admin;

public interface IAdminRepository extends JpaRepository<Admin,Integer>{
	Optional<Admin> findByAdminName(String adminName);

}
