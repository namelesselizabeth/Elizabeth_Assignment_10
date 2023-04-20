package com.coderscampus.Elizabeth_Assignment_10.spoonacular;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class SpoonacularIntegration {

	public ResponseEntity<DayResponse> getDayResponse(String numCalories, String diet, String exclusions) {	
		RestTemplate rt = new RestTemplate();
		
		URI uriDay = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				.queryParam("timeFrame", "day")
				.queryParam("targetCalories", Integer.parseInt(numCalories))
				.queryParam("diet", diet)
				.queryParam("exclude", exclusions)
				.queryParam("apiKey", "56d9135f996c482bbe376f8e5b705fc7")
				.build()
				.toUri();
		
		ResponseEntity<DayResponse> responseDay = rt.getForEntity(uriDay, DayResponse.class);
		return responseDay;
	}
	
	public ResponseEntity<WeekResponse> getWeekResponse(String numCalories, String diet, String exclusions) {
		RestTemplate rt = new RestTemplate();
		
		URI uriWeek = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
										.queryParam("timeFrame", "week")
										.queryParam("targetCalories", Integer.parseInt(numCalories))
										.queryParam("diet", diet)
										.queryParam("exclude", exclusions)
										.queryParam("apiKey", "56d9135f996c482bbe376f8e5b705fc7")
										.build()
										.toUri();
		
		
		ResponseEntity<WeekResponse> responseWeek = rt.getForEntity(uriWeek, WeekResponse.class);
		return responseWeek;
		
	}
}
