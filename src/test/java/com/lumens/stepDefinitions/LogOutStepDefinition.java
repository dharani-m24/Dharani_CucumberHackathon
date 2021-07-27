package com.lumens.stepDefinitions;

import com.lumens.pageObject.LogOutPage;
import com.lumens.utilis.BaseClass;

import cucumber.api.java.en.Then;

public class LogOutStepDefinition extends BaseClass{
	
	LogOutPage logOut;
	
	@Then("^user click on signout btn and able to signout$")
	public void user_click_on_signout_btn_and_able_to_signout() throws Throwable {
		logOut=new LogOutPage();
		logOut.signout();
	  
	}

}
