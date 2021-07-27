package com.lumens.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lumens.utilis.BaseClass;

public class ZipCodePage extends BaseClass{
	
	@FindBy(xpath="//div[@class='checkout-card px-3']//button[@type='submit']")
	WebElement secureCheckOut;
	
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_firstName")
	WebElement firstName;
	
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_lastName")
	WebElement lastName;
	
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_address1")
	WebElement address;
	
	@FindBy(xpath="//a[text()='Enter address manually']")
	WebElement enterAddressClick;
	
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_city")
	WebElement city;
	
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_states_stateUS")
	WebElement selectState;
	
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_postal")
	WebElement postalCode;
	
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_phone")
	WebElement phoneNumber;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public ZipCodePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterZipCode() {
		secureCheckOut.click();
		firstName.sendKeys("Dharani");
		lastName.sendKeys("M");
		address.sendKeys("Kings landing");
		enterAddressClick.click();
		city.sendKeys("Winter fell");
		Select select=new Select(selectState);
		select.selectByIndex(1);
		postalCode.sendKeys("123");
		phoneNumber.sendKeys("8124926240");
		submit.click();
		
		
	}
	

}
