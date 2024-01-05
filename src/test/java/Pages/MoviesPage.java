package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageBase.PageBase;

public class MoviesPage extends PageBase {

	public MoviesPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"super-container\"]/div[2]/div[2]/header/div[2]/div/div/div/div[1]/div/a[1]")
	public WebElement moviesBtn;

	public Signin getMovieNames() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		moviesBtn.click();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		List<WebElement> languages = driver
				.findElements(By.xpath("//div[contains(@class,'sc-133848s-2 sc-7naidv-0 bZPSnn')]"));

		System.out.println("All the Languges avaiable are: ");
		for (WebElement lang : languages) {

			System.out.println(lang.getText());

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,-500)"); // Scrolling up

		}

		return PageFactory.initElements(driver, Signin.class);

	}

}
