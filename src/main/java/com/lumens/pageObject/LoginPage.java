package com.lumens.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.utilis.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//a[@class='ltkpopup-close']")
	WebElement close;
	@FindBy(xpath = "//div[@class='btn-group dropdown-group']")
	WebElement account;

	@FindBy(xpath = "//div[@class='dropdown-menu']//a[text()='Sign In']")
	WebElement signIn;

	@FindBy(id = "dwfrm_login_username")
	WebElement email;

	@FindBy(id = "dwfrm_login_password")
	WebElement password;

	@FindBy(xpath = "//button[@name='dwfrm_login_login']")
	WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public void selectSignIn() {
		close.click();
		Actions action = new Actions(driver);
		action.moveToElement(account).build().perform();
		signIn.click();
	}

	public void login(String emailId, String passWord) throws InterruptedException {

		
		Thread.sleep(3000);
		email.sendKeys(emailId);
		
		Thread.sleep(3000);
		password.sendKeys(passWord);
		Thread.sleep(3000);
	
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("arguments[0].click();", loginButton);
		// loginButton.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
		System.out.println("User logined successfully");

	}

}
