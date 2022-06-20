package com.gymapp2.Repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gymapp2.model.Activity;

public interface IActivityRpositary extends JpaRepository<Activity, Integer> {

}
