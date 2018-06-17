package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class EtsySteps {
	
	private WebDriver driver;
	
	@Given("User is on Etsy homepage")
	public void user_is_on_Etsy_homepage() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://etsy.com");
	    Assert.assertEquals("Etsy.com | Shop for anything from creative people everywhere", driver.getTitle());
	}

	@When("User searches for {string}")
	public void user_searches_for(String string) {
	   
	}

	@Then("Search results should be displayed")
	public void search_results_should_be_displayed() {
	    
	}


}






















