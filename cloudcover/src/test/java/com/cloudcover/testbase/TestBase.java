package com.cloudcover.testbase;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class TestBase {

	@BeforeClass
	public static void init(){
		String accessToken = "fT2CTG5vd3FcjJN1Y5h7JQ((";
		RestAssured.baseURI = "https://api.stackexchange.com/badges/";
		RestAssured.oauth2(accessToken);
	}
}


