package com.cloudcover.cucumber.serenity;

import java.util.HashMap;
import java.util.List;

import com.cloudcover.model.BadgesByIdsRequestParams;
import com.cloudcover.utils.ReusableSpecifications;
import com.cloudcover.utils.TestUtils;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ExchangeSerenitySteps {
	
	@Step("get all badges page:{0}, pageSize:{1}, site:{2}")
	public ValidatableResponse getBadgesApi(String page, String pageSize, String site){
		
		HashMap<String, String> map = TestUtils.UrlParamsMap(page, pageSize, site);
						
	return	SerenityRest.rest().given()
		.spec(ReusableSpecifications.getGenericRequestSpec(map))
		.get().then()
		.log().all();	 
	}

}

