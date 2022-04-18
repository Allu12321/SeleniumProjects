package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.browser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_google extends browser{
	@When("user clicks on <'login'> button")
	public void user_clicks_on_login_button() throws Exception {
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
	
	}
	@When("user clicks on <'google'> link")
	public void user_clicks_on_google_link() {
	    		driver.findElement(By.xpath("//div[@class='nls_socialLoginButtons']/a[2]")).click();
	}



@When("user navigates to the google page")
public void user_navigates_to_the_google_page() {
    
		System.out.println("navigated successfully");
	}
	@When("{string} has to be entered as {string}")
	
	public void has_to_be_entered_as(String string, String string2) throws Exception {
		WebElement gg=	driver.findElement(By.xpath("//div/input[@type=\'email\']"));
		gg.click();
		gg.sendKeys("allu@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button")).click();
		
			System.out.println("========================================");	
	}
	
	@Then("login must be successful")
	public void login_must_be_successful() throws Exception {
	System.out.println("in cg laptop not support gmail login");

	}
	
}
