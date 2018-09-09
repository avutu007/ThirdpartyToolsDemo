package autoit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//using sikulix
public class LoginToFacebook {
	
	public WebDriver driver =null;
	public static String Chrome_key = "webdriver.chrome.driver";
	public static String Chrome_Value  = "D:\\Selenium workspace\\Selenium Project\\Drivers\\chromedriver.exe";
    public static WebDriverWait wait = null;
	@BeforeMethod
	
	public void precondition()
	{
		 System.setProperty("Chrome_key", "Chrome_Value");
			
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        wait = new WebDriverWait(driver,10);
	        driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	
	 }
	
	@Test
	
	public void loginToFacebook() throws FindFailed
	{
		Screen screen = new Screen();
		Pattern username =new Pattern("D:\\Files\\Username.PNG");
		Pattern password =new Pattern("D:\\Files\\Password.PNG");
		Pattern loginBtn =new Pattern("D:\\Files\\LoginBtn.PNG");
		
		screen.wait(username, 10);
		screen.type(username, "edureka");
		screen.type(password, "edureka");
		screen.click(loginBtn);
		
	}
	

}
