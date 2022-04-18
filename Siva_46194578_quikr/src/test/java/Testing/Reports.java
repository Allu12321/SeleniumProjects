package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Reports  {
	public static ExtentHtmlReporter obj1=new ExtentHtmlReporter("./reports/extentreport1.html");
	public static ExtentHtmlReporter duplicateobj1=new ExtentHtmlReporter("./reports/extentreport2.html");
	public static ExtentReports obj2=new ExtentReports();
	public static WebDriver driver;
	
	@BeforeClass
	public static void setDriver()
	{
		obj2.attachReporter(obj1);
		ExtentTest obj3=obj2.createTest("Opening the Test");
		obj3.log(Status.INFO,"Opening the browser");
		try
		{
			WebDriverManager.chromedriver().setup();
		      driver = new ChromeDriver();		
	      obj3.log(Status.PASS,"The url open");
		}
		catch(Exception e)
		{
			System.out.println("Before Report block");
			obj3.log(Status.FAIL,"The URL does not opened");
		}
		obj2.flush();
	}
	@Test 
	public static void search()
	{
		obj2.attachReporter(duplicateobj1);
		ExtentTest obj4=obj2.createTest("Opening the Application and Login");
		obj4.log(Status.INFO,"Opening the Quikr site");
		try
		{
		 driver.get("https:www.quikr.com");
		 driver.manage().window().maximize();
			Thread.sleep(1000);
		 obj4.log(Status.PASS,"The application opened in the browser");
		 WebElement search=driver.findElement(By.xpath(" //*[@id=\"loginLink\"]/span/label"));
		 search.click();
		 Thread.sleep(20000);
		 WebElement log=driver.findElement(By.xpath("//div[@class=\"nls_formControl\"]/input"));
		 log.click();
		 log.sendKeys("7702783591");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class=\'nls_loaderContainer nls_continueBtn\']/button")).click();
		 Thread.sleep(100000);
		 System.out.println("========================================");	
		 	try
		 	{
		 		driver.findElement(By.xpath("//div[@class='nls_loaderContainer nls_continueBtn']/button")).click();
		 	}
		 	catch(Exception e)
		 	{
		 		driver.findElement(By.xpath("//div[@class='nls_loaderContainer nls_continueBtn']/button")).click();
		 	
		 	}
		 Screenshot.screenShot(1);
		 Thread.sleep(3000);
		 obj4.log(Status.PASS,"The application navigated to the next page");
		 String filepath=System.getProperty("user.dir")+"//ScreenShot//Screenshot1.png";
		 obj4.addScreenCaptureFromPath(filepath);
		}
		catch(Exception e)
		{
			System.out.println("Reports");
			obj4.log(Status.FAIL,"The applcation failed");
		}
		obj2.flush();
		 
	}
	
	//@AfterClass
	/*public static void OpenHomePageQuikr()
	{
		obj2.attachReporter(obj1);
		ExtentTest obj5=obj2.createTest("open  the quikr home page");
		obj5.log(Status.INFO,"opening  the Application");
		try
		{
			Thread.sleep(100000);
			System.out.println("Otp verification done");
			driver.findElement(By.xpath("//div[@class='nls_loaderContainer nls_continueBtn']/button")).click();		
		obj5.log(Status.PASS,"The application opened successfully");
		}
		catch(Exception e)
		{
			System.out.println("After Reports block");
			obj5.log(Status.FAIL,"The applcation doesn't closed ");
		}
		obj2.flush();
	}*/
	

}

