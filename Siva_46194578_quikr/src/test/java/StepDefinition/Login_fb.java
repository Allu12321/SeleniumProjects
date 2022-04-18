package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.browser;
import io.cucumber.java.en.When;

       public class Login_fb extends browser{
	   @When("user clicks on <'facebook'> link")
	   public void user_clicks_on_facebook_link() throws Exception {
	   try {    
			WebElement log=driver.findElement(By.xpath(" //*[@id=\"loginLink\"]/span/label"));
			log.click();	
			System.out.println("Login page open");	
		}
		   catch(Exception e)
		{
			System.out.println("can not click on login ");
		}
	     Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='nls_socialLoginButtons']/a[1]")).click();
		Thread.sleep(20000);  
	}

	    @When("user navigates to the facebook page")
	    public void user_navigates_to_the_facebook_page() {
		WebElement fb=	driver.findElement(By.xpath("//div/input[@autocomplete=\'username\']"));
		fb.click();
		fb.sendKeys("7702783591");
		WebElement pws=	driver.findElement(By.xpath("//div/input[@type=\'password\']"));
		pws.click();
		pws.sendKeys("9000394363s");
		System.out.println("========================================");	 
	}
    }
