package com.gymapp2.services;

import java.util.List;

import com.gymapp2.model.GymPlan;

public interface IGymPlanService {

	List<GymPlan> getAllGymPlan();

	GymPlan getGymPlanById(Integer gymPlanId);

	void deleteGymPlan(Integer gymPlanId);

	void saveOrUpdateGymPlan(GymPlan gymplan);

	void updateGymPlan(GymPlan gymplan,Integer gymPlanId);
	
	

}
