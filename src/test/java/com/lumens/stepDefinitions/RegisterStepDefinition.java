package com.lumens.stepDefinitions;

import java.util.ArrayList;

import com.lumens.excelData.ReadExcelFile;
import com.lumens.pageObject.AccountCreationPage;
import com.lumens.utilis.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDefinition extends BaseClass{
	
	AccountCreationPage accountCreation;
	ReadExcelFile excelFile;
	
	@Given("^launch the browser and go to url$")
	public void launch_the_browser_and_go_to_url() throws Throwable {

		BaseClass.launchBrowser();
	}

	@When("^Mouse over to account and click My Account$")
	public void mouse_over_to_account_and_click_My_Account() throws Throwable {
		accountCreation = new AccountCreationPage();
		accountCreation.myaccount();

	}

	@Then("^Enter the given details to create account$")
	public void enter_the_given_details_to_create_account() throws Throwable {
		accountCreation = new AccountCreationPage();
		excelFile = new ReadExcelFile();
		ArrayList<String> testdata = excelFile.getData("user1");
		accountCreation.detail(testdata.get(1), testdata.get(2), testdata.get(3), testdata.get(4), testdata.get(5),
				testdata.get(6));

	}
}
