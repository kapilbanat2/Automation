package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FailureScreenshot {

	public static void main(String args[]) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		//ScreenshotUtility.captureScreenshot(driver, "BrowserOpened");
		ScreenshotUtility2.captureScreenshot(driver);
		
	    driver.manage().window().maximize();
	    //ScreenshotUtility.captureScreenshot(driver, "BrowserMaximized");
	    ScreenshotUtility2.captureScreenshot(driver);
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		try {
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("8130749400");	
		//ScreenshotUtility.captureScreenshot(driver, "EmailIDPassed");
		ScreenshotUtility2.captureScreenshot(driver);
		
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("@complementrydakkta&");
		//ScreenshotUtility.captureScreenshot(driver, "PasswordPassed");
		ScreenshotUtility2.captureScreenshot(driver);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		//ScreenshotUtility.captureScreenshot(driver, "LginClicked");
		ScreenshotUtility2.captureScreenshot(driver);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		//ScreenshotUtility.captureScreenshot(driver, "LogoutNavigation");
		ScreenshotUtility2.captureScreenshot(driver);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			ScreenshotUtility.captureScreenshot(driver, "FailureStep");
		}
		
		System.out.println("Execution Complete");
		driver.close();
		
		
	}
	
	
}
