package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageBase.PageBase;



public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}
    
	@FindBy(xpath = "//span[text()='Bengaluru']")
	public WebElement Place_Link;
	
	@FindBy(xpath = "//button[@id='wzrk-cancel']")
	public WebElement Updates_Link;
	
	@FindBy(xpath = "//a[contains(text(),'Sports')]")
	public WebElement Sports_Link;

	public SportsPage click() {
		Place_Link.click();
		
		/*
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * Updates_Link.click(); // driver.switchTo().alert().accept();
		 */
		Sports_Link.click();
		return PageFactory.initElements(driver, SportsPage.class);
	}

}
