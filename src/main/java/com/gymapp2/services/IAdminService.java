package com.gymapp2.services;

import java.util.List;

import com.gymapp2.model.Admin;


public interface IAdminService {

	List<Admin> getAdminDetails();

	Admin getAdminById(Integer id);

	void saveOrUpdateAdmin(Admin admin);
	
	void deleteAdmin(Integer id);

    void updateAdmin(Admin admin, Integer id);
	 
}
