package com.coderscampus.Elizabeth_Assignment_10.spoonacular;

import java.util.List;

public class DayResponse {

	private List<Meals> meals;
	private Nutrients nutrients;
	
	public List<Meals> getMeals() {
		return meals;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	
}
