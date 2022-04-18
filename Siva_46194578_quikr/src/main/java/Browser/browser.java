package Browser;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class browser {
		//static By Search=By.name("q");
		public static WebDriver driver;
		
		public static WebDriver setDriver(){
			
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();     
		    return driver;		
		}
		
		public static void getURL(String url){
			String searchData =url;
			try {
				driver.get(searchData);
			}
			catch(Exception e)
			{
				System.out.println("Inside URL Method");
			}
			
		}
		public static String getTitle() throws Exception {
			String actualTitle = driver.getTitle();
			return actualTitle;			
		}
		
		
		public static WebElement findElement(By element) throws Exception {
			WebElement actualElement = driver.findElement(element);
			return actualElement;			
		}
		
		public static void display() {
			try
			{
			Assert.assertEquals(browser.getTitle(),"Free Classified Ads in India, Post Ads Online | Quikr India");
			}
			catch(Exception e)
			{
				System.out.println("Title not found");
			}
			//browser.closeBrowser();
		}
		
			// Driver Close Method
			public static void closeBrowser() {
				try {
					//driver.quit();
				}catch(Exception e)
				{
					System.out.println("closing");
				}
			}		
	}


