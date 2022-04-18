package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Browser.browser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register extends browser{
	    @When("enter {string}")
	    public void enter(String string) throws Exception {
		driver.navigate().to("https:www.quikr.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	   }
	        @When("user clicks on register button")
	        public void user_clicks_on_register_button() throws Exception {
		try {    
			WebElement log=driver.findElement(By.xpath(" //*[@id=\"loginLink\"]/span/label"));
			log.click();	
			System.out.println("Register page open");	
		}
		    catch(Exception e)
	    {
			System.out.println("can not open register page ");
		}
		Thread.sleep(10000);
	    }
	      @When("user enters valid mobile number {string}")
	       public void user_enters_valid_mobile_number(String string) throws Exception {
		   
            Thread.sleep(2000);			
            WebElement log=driver.findElement(By.xpath("//div[@class=\"nls_formControl\"]/input"));
			log.click();
			log.sendKeys("9989362453");
			driver.findElement(By.xpath("//div[@class=\'nls_loaderContainer nls_continueBtn\']/button")).click();
			
			System.out.println("========================================");	
	}
	        @When("user enters valid name {string}")
             public void user_enters_valid_name(String string) throws Exception {
	        	Thread.sleep(10000);
	        	//driver.findElement(By.xpath("//div[@class='nls_loaderContainer nls_continueBtn']/button")).click();
	        	WebElement reg=driver.findElement(By.xpath("//div[@class='nls_formContainer']/div[2]/input"));
	        	reg.click();
	        	reg.sendKeys("Sivareddy");
    }

	         @When("user enters valid email address {string}")
	          public void user_enters_valid_email_address(String string) {
	        	 WebElement Ei=driver.findElement(By.xpath("//div[@class='nls_formContainer']/div[3]/input"));
	        		Ei.click();
	        		Ei.sendKeys("allu38969@gmail.com");
	}

	          @When("user enters valid password  {string}")
	           public void user_enters_valid_password(String string) {
	        	  WebElement pws=driver.findElement(By.xpath("//div[@class='nls_formContainer']/div[4]/input"));
	        		pws.click();
	        		pws.sendKeys("Siva1234");
	        		
	}

	            @When("user clicks on send otp button")
	            public void user_clicks_on_send_otp_button() {
	            	driver.findElement(By.xpath("//div[@class=\'nls_loaderContainer nls_continueBtn\']/button")).click();
	            	System.out.println("Enter the Captcha");
	}

	            @When("user  enters otp manually")
	             public void user_enters_otp_manually() throws Exception {
	            	
	            	Thread.sleep(100000);
	            	try {
	            	driver.findElement(By.xpath("//div[@class=\'nls_loaderContainer nls_continueBtn\']/button")).click();
	            	System.out.println("===================================");
	            	}
	            	catch(Exception e){
	            		System.out.println("Bug occured");
	            	}
	            	
	            	
	}

	             @Then("user Successful created account in applicaion and is redirected to home page of quikr")
	              public void user_Successful_created_account_in_applicaion_and_is_redirected_to_home_page_of_quikr() {
	             System.out.println("Home page open successfully");
	             driver.findElement(By.xpath("//div[@class='nls_loaderContainer nls_continueBtn']/button")).click();
	             
	}

}
