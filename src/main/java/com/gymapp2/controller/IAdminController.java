package com.gymapp2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gymapp2.model.Admin;



public interface IAdminController {

	
	@GetMapping("/admin")
    List<Admin> getAllAdminDetails();

    @GetMapping("/admin/{id}")
    Admin getAdminById(@PathVariable("id") Integer Id);

    @PostMapping ("/admins")
    Integer SaveAdmin(@RequestBody  Admin admin);
	
}
