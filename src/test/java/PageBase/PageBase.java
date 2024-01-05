package PageBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.HomePage;


public class PageBase {

	public WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop;


	// invoke the browsers
	public void invokeBrowser(String browserNameKey) {
		
		// Invoking chrome
		if (browserNameKey.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Darshan Gowda\\workspace\\MainProject\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		// Invoking firefox
		else if (browserNameKey.equalsIgnoreCase("Mozilla")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Darshan Gowda\\workspace\\MainProject\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

	
		else {
			driver = new SafariDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public HomePage openURL() {
		driver.get("https://in.bookmyshow.com");
		return PageFactory.initElements(driver, HomePage.class);
	}
	


	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

}
