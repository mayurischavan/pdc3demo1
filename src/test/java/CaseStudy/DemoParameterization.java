package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoParameterization {
	WebDriver driver;

	@Given("application is launched by user")
	public void application_is_launched_by_user() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}
	/*@Given("The DemoWebShop site is launched")
	public void the_DemoWebShop_site_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}*/

	@Then("User selects the register button")
	public void user_selects_on_register_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();

		//driver.findElement(By.xpath(""))
	}

	@When("User provides valid data")
	public void user_provides_valid_data() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Mayuri12");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Chavan");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("lkm11896@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("lkm123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("lkm123");
	}

	@When("User click on the register button")
	public void user_click_on_the_register_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.close();
	}

	/*@Given("The site is launched")
	public void the_site_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.get("http://demowebshop.tricentis.com/");
	}*/


	


	@When("user provides the username {string}")
	public void user_provides_the_username(String un) {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(un);

	}

	@When("user provides the password {string}")
	public void user_provides_the_password(String pw) {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pw);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		driver.close();
	}

	/*@Then("user selects the logn button")
	public void user_selects_the_logn_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.className("button-1 login-button")).click();
		driver.close();
	}*/



	



}
