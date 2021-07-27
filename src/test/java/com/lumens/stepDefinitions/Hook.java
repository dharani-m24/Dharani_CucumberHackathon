package com.lumens.stepDefinitions;

import com.lumens.utilis.BaseClass;

import cucumber.api.java.After;

public class Hook extends  BaseClass {
	
	@After
	public void closeBrowser() {
		
		driver.quit();
		
	}

}
