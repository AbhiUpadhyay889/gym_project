package com.gymapp2.Repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gymapp2.model.GymPlan;

public interface IGymPlanRepository extends JpaRepository<GymPlan, Integer> {

}
