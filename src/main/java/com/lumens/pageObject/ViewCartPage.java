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

public class ViewCartPage extends BaseClass {

	@FindBy(xpath = "//span[@title='Lighting']")
	WebElement lighting;
	@FindBy(xpath = "//a[@title='Ceiling Lights']")
	WebElement ceilingLight;
	@FindBy(xpath = "//a[@title='Ceiling Lights Chandeliers']")
	WebElement chandeliers;
	@FindBy(xpath = "//a[text()='large chandelier']")
	WebElement largeChandeliers;
	@FindBy(xpath = "//span[text()='1 business day']")
	WebElement readyToShip;
	@FindBy(xpath="//span[contains(text(),'Transitional')]")
	WebElement style;
	@FindBy(xpath="//a[@title='Studio Chandelier(Polished Nickel/5 Lights)-OPEN BOX RETURN' and @class='thumb-link']")
	WebElement product;
	@FindBy(xpath="//button[@id='add-to-cart']")
	WebElement addToCart;
	@FindBy(xpath="//a[text()='CHECKOUT']")
	WebElement checkOut;
	
	@FindBy(xpath="//a[@id='mcBookMark']")
	WebElement cart;
	
	@FindBy(xpath="//a[text()='VIEW CART']")
	WebElement viewCart;
	
	public ViewCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectProduct() throws InterruptedException {
		
		Actions action=new Actions(driver);
		action.moveToElement(lighting).build().perform();
		


		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ceilingLight);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", chandeliers);
		largeChandeliers.click();
	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", readyToShip);
		WebDriverWait wait = new WebDriverWait (driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Transitional')]")));
		
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", style);
		
		WebDriverWait wait2 = new WebDriverWait (driver, 50);

		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Studio Chandelier(Polished Nickel/5 Lights)-OPEN BOX RETURN' and @class='thumb-link']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", product);
		
		
		
	}
	
	
	public void addTheProductToCart() throws InterruptedException {
		addToCart.click();
		WebDriverWait wait2 = new WebDriverWait (driver, 50);

		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='CHECKOUT']")));
		checkOut.click();
		
		
	}
	
	public void viewCart() {
		cart.click();
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("arguments[0].click();", viewCart);
		//viewCart.click();
	}

}
