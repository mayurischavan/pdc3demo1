package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//@RunWith(Cucumber.class)


public class CaseStudy1 {
	WebDriver driver;
	
	@Given("webdemoshop website is launched")
	public void webdemoshop_website_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@Given("user clicks on register button")
	public void user_clicks_on_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		//driver.findElement(By.xpath(""))
	}

	@When("user entering proper data")
	public void user_entering_proper_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Mayuri");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Chavan");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ma1y23@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");
	}

	@Then("clicks on register button for account creation")
	public void clicks_on_register_button_for_account_creation() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		//Thread.sleep(5000);
	}

	@Given("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		driver.findElement(By.className("ico-login")).click();
	}

	@Then("user enters the valid credentials")
	public void user_enters_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("mayuri@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
	}

	@Then("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@Given("user clicks on search box")
	public void user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).click();
		
		
		
	}

	@Then("user searches an item")
	public void user_searches_an_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Jewelry");
	}

	@Then("clicks on the search button")
	public void clicks_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
	}

	@Given("Searched item is displayed")
	public void searched_item_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.className("product-grid"));
	}


	@Then("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
	}



}
