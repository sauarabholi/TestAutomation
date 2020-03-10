package com.cloudcover.cucumber.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cloudcover.cucumber.serenity.ExchangeSerenitySteps;
import com.cloudcover.utils.TestUtils;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class ExchangeSteps {
	static String email=null;
	
	@Steps
	ExchangeSerenitySteps steps;
					
	@When("^User sends a GET request by badge id (\\d+),they must get back a valid status code (\\d+)$")
	public void user_sends_a_GET_request_by_badge_id_they_must_get_back_a_valid_status_code(int badgeId, int statusCode)
	{
		SerenityRest.rest()
		.given()
		.when()
		.get("/"+badgeId)
		.then()
		.statusCode(statusCode);
	}	
	       
	@When("^I get all badges page (.*) pageSize (.*) site (.*) verify status (.*)$")	
	public void getAllBadges(int page, int pageSize, String site, int status){
		String page_string = Integer.toString(page); 
		String pageSize_string = Integer.toString(pageSize);
		
		steps.getBadgesApi(page_string, pageSize_string, site)
		 .assertThat()
		 .statusCode(200);		
	}
			
	@When("^Negative Test get all badges page (.*) pageSize (.*) site (.*) verify status (.*)$")	
	public void getAllBadgesNegative(float page, float pageSize, String site, int status){
		String page_string = String.valueOf(page); 
		String pageSize_string = String.valueOf(pageSize);

		steps.getBadgesApi(page_string, pageSize_string, site)
		 .assertThat()
		 .statusCode(200);		
	}
	
	//@Then("^I verify response error_message (.*)")	

}
