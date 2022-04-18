package StepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Browser.browser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Login_Mob extends browser{
	@Then("user disagree the pop up")
	public void user_disagree_the_pop_up() throws Exception {
	System.out.println("popup displayed");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	}

	        @When("click login link")
	        public void click_login_link() throws Exception {
		    try {    
			WebElement log=driver.findElement(By.xpath(" //*[@id=\"loginLink\"]/span/label"));
			log.click();	
			System.out.println("Login page open");	
		    }
		    catch(Exception e)
		    {
			System.out.println("can not click on login ");
		    }
	        Thread.sleep(20000);
	   	        }

	@When("user enters mobile number")
	public void user_enters_mobile_number() throws Exception {
		WebElement log=driver.findElement(By.xpath("//div[@class=\"nls_formControl\"]/input"));
		log.click();
		log.sendKeys("7702783591");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\'nls_loaderContainer nls_continueBtn\']/button")).click();
		Thread.sleep(20000);
		System.out.println("========================================");	
	        }

	@When("clicks on verification")
	public void clicks_on_verification() throws Exception {
		try
		{
			driver.findElement(By.xpath("//div[@class='nls_loaderContainer nls_continueBtn']/button")).click();
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//div[@class='nls_loaderContainer nls_continueBtn']/button")).click();
				}
		Thread.sleep(20000);
		System.out.println("Otp verification done");
		driver.findElement(By.xpath("//div[@class='nls_loaderContainer nls_continueBtn']/button")).click();		 
		}
		
	@Then("page will display")
	public void page_will_display() {
		try {
		String exp_title="Free Classified Ads in Hyderabad, Post Ads Online | Quikr  Hyderabad";
		String current_window_title=driver.getTitle();
		Assert.assertEquals(current_window_title, exp_title);
		System.out.println("The Quikr home page displayed successfully");
		}catch(Exception e) {
			System.out.println("The Quikr home page title is not  displayed");
		}
	}
    }
