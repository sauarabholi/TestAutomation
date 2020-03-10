package com.cloudcover.cucumber;

import org.junit.runner.RunWith;

import com.cloudcover.testbase.TestBase;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		dryRun=false,
		strict=true,
		monochrome=false,
		features = "src/test/resources/feature/",
		glue = {"com.cloudcover.cucumber.steps.ExchangeSteps"},		
				tags= {"@GetAllBadges"}
		
		)
public class exchangerunner extends TestBase{

}

