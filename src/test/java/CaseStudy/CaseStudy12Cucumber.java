package CaseStudy;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy12Cucumber {
	WebDriver driver;
	

@Given("Browser and correct url is loaded")
public void browser_and_correct_url_is_loaded() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp/");
}



	///////*  Scenario 1  *////// 
	
	@Given("user clicks on the sign up button to register")
	public void user_clicks_on_the_sign_up_button_to_register() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@Given("user enters usrname {string}")
	public void user_enters_usrname(String uName) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(uName);
	}

	@Then("user provide firstname {string}")
	public void user_provide_firstname(String fname) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fname);
	}

	@Then("user provide lastname {string}")
	public void user_provide_lastname(String lname) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lname);
	}

	@Then("user enter all the remaining data")
	public void user_enter_all_the_remaining_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass345");
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("pass345");
		driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("gadha@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("10/12/2019");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("abcghdg");
		
		Select obj = new Select(driver.findElement(By.xpath("//select[@id='securityQuestion']")));
		obj.selectByIndex(0);
		
		driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("Gadhinglaj");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		System.out.println("Scenario 1 done");
		
		driver.close();
		//driver.findElement(By.xpath(""))
	}

	/*@Given("user click on sign in button")
	public void user_click_on_sign_in_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	}*/
	
	///////*   Scenario 2   */////////
	
	@Given("user provide the username {string}")
	public void user_provide_the_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.findElement(By.xpath("//*[@id=\"userName\"]")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
	}

	@When("user provide the password {string}")
	public void user_provide_the_password(String  pswrd ) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pswrd);
	}
	@Then("user hits the log in button")
	public void user_hits_the_log_in_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.close();
		
		System.out.println("Scenario 2 done");
		driver.close();
	}
	
	
	//////*  Scenario 3   */////
	
	@Given("user searches the required product")
	public void user_searches_the_required_product() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Head");
		driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).click();
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		driver.close();
		//driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		//driver.findElement(By.xpath(""))
		
		System.out.println("Scenario 3 done");
		driver.close();
	}
	
	
	////*  Scenario 4  *//////
	
	@Given("Alex goes to HomePage")
	public void alex_goes_to_HomePage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a")).click();
		
	}

	@Given("Alex searches heaphone")
	public void alex_searches_heaphone() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("heaphone");
		Boolean a = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).isDisplayed();
		if(a==false)
		{
			System.out.println("Please select a product");
		}
		else
		{
			System.out.println("IDK");
		}
		
		System.out.println("Scenario 4 done");
		driver.close();
	}

	//System.out.println("Scenario 4 done");
	
	
}
