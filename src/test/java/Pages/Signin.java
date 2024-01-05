package Pages;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import PageBase.PageBase;

public class Signin extends PageBase{
	
	public Signin (WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(xpath= "//div[text()='Sign in']")
	public WebElement Signin_Link;
	
	@FindBy(xpath = "//div[contains(text(),'Continue with Email')]")
	public WebElement Email_Login;
	
	@FindBy(xpath = "//input[@id='emailId']")
	public WebElement Email_PlaceHolder;

	@FindBy(xpath="//div[@id='Error message']")
	public WebElement Error_Link;
	
	public EndPage UserSignin() {
		
		Signin_Link.click();
		
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Email_Login.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Email_PlaceHolder.sendKeys("abc@gmail");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Error = Error_Link.getText();
		System.out.println("Error is: " + Error);
		
		return PageFactory.initElements(driver, EndPage.class); 
	}
}
