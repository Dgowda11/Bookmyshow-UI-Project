package Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageBase.PageBase;

public class SportsPage extends PageBase {

	public SportsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//body/div[@id='super-wrapper']/div[@id='super-container']/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]")
	public WebElement This_Weekend;

	@FindBy(xpath = "//*[@id='super-container']/div[2]/div[4]/div[1]/div[1]/div[2]/div[4]/div/div[1]")
	public WebElement Price_Link;

	@FindBy(xpath = "//*[@id='super-container']/div[2]/div[4]/div[1]/div[1]/div[2]/div[4]/div[2]/div[2]/div[2]/div/div")
	public WebElement lowest_price;

	public MoviesPage SportsActivies() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		This_Weekend.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Price_Link.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> sportsname = driver.findElements(By.xpath("//div[@class='sc-7o7nez-0 bJKnib']"));

		for (WebElement link : sportsname) {

			System.out.println(link.getText());
}
		return PageFactory.initElements(driver, MoviesPage.class);
}
}