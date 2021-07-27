package com.lumens.pageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.utilis.BaseClass;

public class IncreaseQuantityOfProduct extends BaseClass{
	
	@FindBy(xpath = "//span[@title='Lighting']")
	WebElement lighting;
	@FindBy(xpath = "//a[@title='Ceiling Lights']")
	WebElement ceilingLight;
	@FindBy(xpath = "//a[@title='Ceiling Lights Chandeliers']")
	WebElement chandeliers;
	@FindBy(xpath = "//a[text()='large chandelier']")
	WebElement largeChandeliers;
	@FindBy( xpath="(//a[@title='Catalyst Chandelier'])[1]")
	WebElement productImg;
	
	@FindBy(id="Quantity")
	WebElement quantity;
	
	@FindBy(xpath="//button[@id='add-to-cart']")
	WebElement addToCart;
	@FindBy(xpath="//a[text()='CHECKOUT']")
	WebElement checkOut;
	
	@FindBy(xpath="//a[@id='mcBookMark']")
	WebElement cart;
	
	@FindBy(xpath="//a[text()='VIEW CART']")
	WebElement viewCart;
	
	@FindBy(xpath="//input[@id='MFM688978_1.0']")
	WebElement dropDown;
	
	@FindBy(xpath="//div[@id='qty_MFM688978']//a[@data-value='2']")
	WebElement selectDropDown;
	
	
	public IncreaseQuantityOfProduct() {
		PageFactory.initElements(driver, this);
		
	}
	public void increaseQuantity() throws InterruptedException {
		
		Actions action=new Actions(driver);
		action.moveToElement(lighting).build().perform();
		

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", ceilingLight);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ceilingLight);
		
//		JavascriptExecutor js4= (JavascriptExecutor) driver;
//		js4.executeScript("arguments[0].click();", chandeliers);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", chandeliers);
		
		largeChandeliers.click();
		

		WebDriverWait wait = new WebDriverWait (driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Catalyst Chandelier'])[1]")));
		
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("arguments[0].click();", productImg);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", productImg);
		//productImg.click();
		quantity.clear();
		quantity.sendKeys("2");
		System.out.println("Quantity increased");
		 TakesScreenshot ts=(TakesScreenshot)driver;        
	        File source=ts.getScreenshotAs(OutputType.FILE);
	        try {
	            FileUtils.copyFile(source, new File("./screenshots/QuantityIncreased.png"));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        System.out.println("Quantity incresed successfully  screenshot is taken");
	    }
		
		
	}


