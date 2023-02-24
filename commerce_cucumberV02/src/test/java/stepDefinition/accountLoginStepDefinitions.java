package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class accountLoginStepDefinitions {
	
	public WebDriver driver = null;
	
	@Given("Open browser")
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", "/Users/abhishek/Downloads/chromedriver_mac64 2/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@When("Enter the url {string}")
	public void enter_the_url(String string) {
		driver.get("https://practice.automationtesting.in/my-account/");
	}

	@When("Enter registered username and password")
	public void enter_registered_username_and_password() {
	   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ab2k@gmail.com");
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ab@8130062744");
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
	    
	}

	@Then("User must be logged in to webpage")
	public void user_must_be_logged_in_to_webpage() {
	   String s = driver.findElement(By.xpath("//*[@id=\'page-36\']/div/div[1]/div/p[1]/strong")).getText();
	   Assert.assertEquals(true,s.contains( "ab2k"));
	   
	}



}
