package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import PageBase.PageBase;

public class EndPage extends PageBase{
	
	public EndPage (WebDriver driver) {
		this.driver = driver;
	}
	// TAKING SCREENSHOT OF THE ERROR DISPLAYED AFTER ENTERING THE WRONG EMAIL ID 
			public void TakeScreenshot() {
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
				try {
					FileUtils.copyFile(scrFile,
							new File("C:\\Users\\Darshan Gowda\\workspace\\MainProject\\Screenshots\\ErrorScreeshot.PNG"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Screenshot has been taken");
			}
}
