package com.coderscampus.Elizabeth_Assignment_10.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coderscampus.Elizabeth_Assignment_10.spoonacular.DayResponse;
import com.coderscampus.Elizabeth_Assignment_10.spoonacular.SpoonacularIntegration;
import com.coderscampus.Elizabeth_Assignment_10.spoonacular.WeekResponse;

@RestController
public class MealController {
	SpoonacularIntegration integration = new SpoonacularIntegration();
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
		return integration.getWeekResponse(numCalories, diet, exclusions);
		
	}
	
	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
		return integration.getDayResponse(numCalories, diet, exclusions);
	}
	

}
