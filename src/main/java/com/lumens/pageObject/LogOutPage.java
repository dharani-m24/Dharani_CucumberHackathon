package com.lumens.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumens.utilis.BaseClass;

public class LogOutPage extends BaseClass{
	
	@FindBy(xpath="//div[@class='btn-group dropdown-group']")
    WebElement account;
    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement signout;

 

    public LogOutPage() {
        PageFactory.initElements(driver, this);
    }

 

    public void signout() {
        Actions action = new Actions(driver);
        action.moveToElement(account).build().perform();
        
        System.out.println("Mouseover action moved successfully");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", signout);
        //signout.click();

//        Actions action1 = new Actions(driver);
//        action1.moveToElement(signout).build().perform().;
        System.out.println("Logout successfully");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

 

    }

}
