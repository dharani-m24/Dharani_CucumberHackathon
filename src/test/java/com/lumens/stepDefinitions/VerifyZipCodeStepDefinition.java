package com.lumens.stepDefinitions;

import com.lumens.pageObject.ZipCodePage;
import com.lumens.utilis.BaseClass;

import cucumber.api.java.en.Then;

public class VerifyZipCodeStepDefinition extends BaseClass {
	
	ZipCodePage zipCode;
	
	@Then("^enter the zipCode$")
	public void enter_the_zipCode() throws Throwable {
		zipCode=new ZipCodePage();
		zipCode.enterZipCode();
	  
	}

}
