package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ToolTipExample {

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com");
	//ScreenshotUtility.captureScreenshot(driver, "BrowserOpened");
	//ScreenshotUtility2.captureScreenshot(driver);
	//RobotScreenUtility.captureScreenshot(driver,"BrowserOpened");
	
    driver.manage().window().maximize();
    
    driver.findElement(By.xapth("//input[@id='u_0_q']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xapth("//div[@class='_8e63 _ihd _3ma _6s']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xapth("//input[@id='u_0_q']")).click();
    Thread.sleep(3000);
    String actual_msg=driver.findElement(By.xapth("//div[@id='js_123']")).getText();
    System.o
    
    String expected_msg="What's your name?";
    
	
}
