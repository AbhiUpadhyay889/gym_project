package com.gymapp2.services;

import java.util.List;

import com.gymapp2.model.Diet;

public interface IDietService {
	List<Diet> getDietDetails();

    Diet getDietById(Integer dietId);

    void saveOrUpdateDiet(Diet diet);

    void deleteDiet(Integer dietId);

    void updateDiet(Diet diet, Integer dietId);

    Diet getDietByCalories(Float calorie);
}
