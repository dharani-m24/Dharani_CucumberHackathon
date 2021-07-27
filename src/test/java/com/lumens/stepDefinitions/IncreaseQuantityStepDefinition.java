package com.lumens.stepDefinitions;

import com.lumens.pageObject.IncreaseQuantityOfProduct;
import com.lumens.utilis.BaseClass;

import cucumber.api.java.en.Then;

public class IncreaseQuantityStepDefinition extends BaseClass{
	
	IncreaseQuantityOfProduct increase;

	@Then("^select the product and increase the quantity of the product$")
	public void select_the_product_and_increase_the_quantity_of_the_product() throws Throwable {
		increase=new IncreaseQuantityOfProduct();
		increase.increaseQuantity();
	    
	}

}
