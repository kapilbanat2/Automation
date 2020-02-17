package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		//ScreenshotUtility.captureScreenshot(driver, "BrowserOpened");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "BrowserOpened");
		
	    driver.manage().window().maximize();
	    //ScreenshotUtility.captureScreenshot(driver, "BrowserMaximized");
	   // ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "BrowserMaximized");
	    Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,6000)");
		Thread.sleep(5000);
		System.out.println("Execution Completed");
		driver.close();
		
	}

}
