package abc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GeneratesLoggerDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		Logger logger = Logger.getLogger("GeneratesLoggerDemo");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		//ScreenshotUtility.captureScreenshot(driver, "BrowserOpened");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "BrowserOpened");
		logger.info("BrowserOpened13");
		
	    driver.manage().window().maximize();
	    //ScreenshotUtility.captureScreenshot(driver, "BrowserMaximized");
	   // ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "BrowserMaximized");
		logger.info("BrowserMaximized");
		
	    Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("implicitly wait applied");
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("8130749400");	
		logger.info("BrowserMaximized");
		//ScreenshotUtility.captureScreenshot(driver, "EmailIDPassed");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "EmailIDPassed");
		
		
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("@complementrydata&");
		logger.info("PasswordPassed");
		//ScreenshotUtility.captureScreenshot(driver, "PasswordPassed");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "PasswordPassed");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		logger.info("LginClicked");
		//ScreenshotUtility.captureScreenshot(driver, "LginClicked");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "LginClicked");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		logger.info("LogoutNavigation");
		//ScreenshotUtility.captureScreenshot(driver, "LogoutNavigation");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "LogoutNavigation");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		logger.info("ClickonLogout");
		//ScreenshotUtility.captureScreenshot(driver, "ClickonLogout");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "ClickonLogout");
		Thread.sleep(3000);
	    
		driver.close();
	}

}
