package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoodleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleHomePage;

public class Ocean9GoogleSearch  extends GoodleBase{
	GoogleHomePage ghp;
	

	
	

	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		lunchBrowser();
		
	
	}

	@When("I enter search {string}")
	public void i_enter_search(String term) {
		
		//WebElement searchBox = driver.findElement(By.name("q"));
		//searchBox.sendKeys(term);
		//GoogleHomePage ghp= new GoogleHomePage(driver);
		ghp=new GoogleHomePage(driver);
		ghp.enterSarchTerm(term);
		

	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {

		//WebElement searchButton = driver.findElement(By.name("btnK"));
		//searchButton.submit();
	   // GoogleHomePage ghp= new GoogleHomePage(driver);
		ghp.clickSearchButton();
		
	    

	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		
		WebElement results = driver.findElement(By.id("result-stats"));
		String searchCount= results.getText();
		
		
		System.out.println("========================================");
		System.out.println(searchCount);
		System.out.println("==========================================");
		driver.close();

	}
}
