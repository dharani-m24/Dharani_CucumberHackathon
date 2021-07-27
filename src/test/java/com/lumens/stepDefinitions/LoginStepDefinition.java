package com.lumens.stepDefinitions;

import java.util.ArrayList;

import com.lumens.excelData.ReadExcelFile;
import com.lumens.pageObject.LoginPage;
import com.lumens.utilis.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends BaseClass{
	
	LoginPage loginPage;
	ReadExcelFile excelFile;

	@When("^Mouse over to account and click sign In button$")
	public void mouse_over_to_account_and_click_sign_In_button() throws Throwable {
		loginPage = new LoginPage();
		loginPage.selectSignIn();

	}

	@Then("^Enter the valid credentials$")
	public void enter_the_valid_credentials() throws Throwable {
		loginPage = new LoginPage();
		excelFile = new ReadExcelFile();
		ArrayList<String> testdata = excelFile.getData("user1");
		loginPage.login(testdata.get(3), testdata.get(5));

	}
}
