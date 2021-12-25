package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoodleBase {
	
	public WebDriver driver;
	
	public void lunchBrowser() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void closeAllBrowser() {
		driver.quit();
	}
	
	
	
	
	
	

}
