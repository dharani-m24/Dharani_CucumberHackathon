package com.lumens.pageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumens.utilis.BaseClass;

public class AccountCreationPage extends BaseClass{
	
	
	    
	    @FindBy(xpath="//a[@class='ltkpopup-close']") 
	    WebElement close;
	    @FindBy(xpath="//div[@class='btn-group dropdown-group']")
	    WebElement account;
	    @FindBy(id="my_account_hdr_link")
	    WebElement myAccount;
	    @FindBy(xpath="//input[@id='dwfrm_profile_customer_firstname']") 
	    WebElement firstName;
	    @FindBy(xpath="//input[@id='dwfrm_profile_customer_lastname']") 
	    WebElement lastName;
	    @FindBy(xpath="//input[@id='dwfrm_profile_customer_email']") 
	    WebElement email;
	    @FindBy(xpath="//input[@id='dwfrm_profile_customer_emailconfirm']") 
	    WebElement confirmEmail;
	    @FindBy(xpath="//input[@id='dwfrm_profile_login_password']") 
	    WebElement password;
	    @FindBy(xpath="//input[@id='dwfrm_profile_login_passwordconfirm']") 
	    WebElement confirmPassword;
	    @FindBy(xpath="//span[text()='Create Account']") 
	    WebElement createAccount;
	    
	    public AccountCreationPage() {
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void myaccount()
	    {
	        close.click();
	      Actions action=new Actions(driver);
	      action.moveToElement(account).build().perform();
	        //account.click();
	        myAccount.click();
	        
	    }
	    public void detail(String firstname,String lastname,String emailid,String confimemail,String passWord,String cofirmPassWord)
	    {
	    	firstName.sendKeys(firstname);
	    	lastName.sendKeys(lastname);
	        email.sendKeys(emailid);
	        confirmEmail.sendKeys(confimemail);
	        password.sendKeys(passWord);
	        confirmPassword.sendKeys(cofirmPassWord);
	        

	        createAccount.click();
	        System.out.println("Account created Successfully");
	        TakesScreenshot ts=(TakesScreenshot)driver;        
	        File source=ts.getScreenshotAs(OutputType.FILE);
	        try {
	            FileUtils.copyFile(source, new File("./screenshots/AccountCreation.png"));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        System.out.println("Account created successfully  screenshot is taken");
	    }
	    }
	    
	   
	 


