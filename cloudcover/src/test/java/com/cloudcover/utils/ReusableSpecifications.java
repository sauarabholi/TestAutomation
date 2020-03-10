package com.cloudcover.utils;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.cloudcover.model.BadgesByIdsRequestParams;

public class ReusableSpecifications {
	
	public static RequestSpecBuilder rspec;
	public static RequestSpecification requestSpecification;
	
	public static ResponseSpecBuilder respec;
	public static ResponseSpecification responseSpecification;

	
	public static RequestSpecification getGenericRequestSpec(HashMap<String, String> parametersMap){		
		rspec = new RequestSpecBuilder();
		rspec.setContentType(ContentType.JSON);
		rspec.addFormParams(parametersMap);
		requestSpecification = rspec.build();
		return requestSpecification;		
	}
	
	public static ResponseSpecification getGenericResponseSpec(){
		respec = new ResponseSpecBuilder();
		respec.expectHeader("Content-Type","application/json;charset=UTF-8");
		respec.expectHeader("Transfer-Encoding","chunked");
		respec.expectResponseTime(lessThan(5L),TimeUnit.SECONDS);
		responseSpecification = respec.build();
		return responseSpecification;
		
	}
}
