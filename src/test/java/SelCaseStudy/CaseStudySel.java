package SelCaseStudy;

import org.testng.annotations.Test;
import org.testng.internal.DynamicGraph.Status;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class CaseStudySel {
	WebDriver driver;
	ExtentHtmlReporter htmlreporter;
 	ExtentTest logger;
	ExtentReports extent;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/");

		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport5432.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		htmlreporter.config().setDocumentTitle("Extent Report Demo");
		htmlreporter.config().setReportName("Test Report");
		htmlreporter.config().setTheme(Theme.DARK);
		htmlreporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}

	@Test(priority=1)
	public void registration() throws InterruptedException {
		String UsrInput;
		String condn;


		//logger = extent.createTest("passTest");
		//internet obj=new internet();
		//obj.getDriver("chrome");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		String exists = "Name Already Exists";
		do {
			UsrInput =JOptionPane.showInputDialog("Enter User Name");
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(UsrInput);
			driver.findElement(By.xpath("//input[@id='firstName']")).click();
			Thread.sleep(2000);
			condn= driver.findElement(By.xpath("//span[@id='err']")).getText();
			Thread.sleep(2000);
			//System.out.println(condn);
		}while(exists.equalsIgnoreCase(condn));

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Elephant");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Haathi");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mayuri1");
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("mayuri1");
		driver.findElement(By.xpath("//span[contains(.,'Male')]")).click();
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("elephant@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@placeholder='Date of Birth- mm/dd/yyyy']")).sendKeys("06/04/1997");


		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Pune");

		Select obj = new Select(driver.findElement(By.name("securityQuestion")));
		obj.selectByIndex(0);
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("Gadhinglaj");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Test(priority=2)
	public void Login() { 
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("lalitha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

	@Test(priority=3)
	public void AddtoCart() throws InterruptedException { 
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Headphone");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form//input[@name='val']")).click();

	}




	@AfterMethod 
	public void getResultAfterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(com.aventstack.extentreports.Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger.log(com.aventstack.extentreports.Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
		} 
		else if(result.getStatus() == ITestResult.SKIP) {
			logger.log(com.aventstack.extentreports.Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		}

	}
	@AfterTest 
	public void afterTest()
	{
		extent.flush();
	}



}
