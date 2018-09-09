package autoit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComposeEmail {
	
	public WebDriver driver =null;
	public static String Chrome_key = "webdriver.chrome.driver";
	public static String Chrome_Value  = "D:\\Selenium workspace\\Selenium Project\\Drivers\\chromedriver.exe";
    public static WebDriverWait wait = null;
	@BeforeMethod
	
	public void precondition()
	{
		 System.setProperty("Chrome_key", "Chrome_Value");
			
	        driver = new ChromeDriver();
	        driver.get("https://www.gmail.com/");
	        wait = new WebDriverWait(driver,10);
	        driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	
	 }
	//autoit helps open attachment in new window
	
	public void RunAutoIt()
	{
		try
		{
			
			
			String strFilePath = "D:\\Files\\testing.txt";
			String strPath ="D:\\Files\\attachment.exe";
			String strParameter =strPath+" "+strFilePath;
			Runtime.getRuntime().exec(strParameter);
		}
		
		catch(Exception e)
		{
			System.out.println("Unable to upload file");
		}
		
	}
	@Test
	public void ComposeEmailWithAttachment()
	{
		
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("avutu007@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("edureka");
		By loadingImage = By.id("loading image ID");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		/*WebElement next = driver.findElement(By.xpath("//span[@class ='RveJvd snByac']"));
		next.click();*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		wait.until(ExpectedConditions.titleContains("Inbox"));
		
	    WebElement composeBtn = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
	    composeBtn.click();
		driver.findElement(By.xpath("//div[@class = 'a1 aaA aMZ']")).click();
		RunAutoIt();
	}
	
	
	/*@AfterMethod
	
	public void closeBrowser()
	{
		driver.close();
	}*/

}
