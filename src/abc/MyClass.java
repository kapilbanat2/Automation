package abc;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MyClass {

	public static void main(String args[]) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		//ScreenshotUtility.captureScreenshot(driver, "BrowserOpened");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "BrowserOpened");
		
	    driver.manage().window().maximize();
	    //ScreenshotUtility.captureScreenshot(driver, "BrowserMaximized");
	   // ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "BrowserMaximized");
	    Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		email.sendKeys("8130749400");
		int width= email.getSize().getWidth();
		int height= email.getSize().getHeight();
		
		System.out.println("Height of the element: "+height);
		System.out.println("Width of the element: "+width);
		
		//ScreenshotUtility.captureScreenshot(driver, "EmailIDPassed");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "EmailIDPassed");
		
		
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("@complementrydata&");
		//ScreenshotUtility.captureScreenshot(driver, "PasswordPassed");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "PasswordPassed");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		//ScreenshotUtility.captureScreenshot(driver, "LginClicked");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "LginClicked");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		//ScreenshotUtility.captureScreenshot(driver, "LogoutNavigation");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "LogoutNavigation");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		//ScreenshotUtility.captureScreenshot(driver, "ClickonLogout");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "ClickonLogout");
		Thread.sleep(3000);
		
		/*
		
		WebElement day_dropdown=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month_dropdown=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year_dropdown=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select sel1=new Select(day_dropdown);
		Select sel2=new Select(month_dropdown);
		Select sel3=new Select(year_dropdown);
		
		sel1.selectByVisibleText("13");
		System.out.println("Day selected");
		sel2.selectByVisibleText("Feb");
		System.out.println("Month selected");
		sel3.selectByVisibleText("1990");
		System.out.println("Year selected");
		
		WebElement selected_month1=sel2.getFirstSelectedOption();
		System.out.println("Current selected month = "+selected_month1.getText());
		
		sel2.selectByVisibleText("Mar");
		
		WebElement selected_month2=sel2.getFirstSelectedOption();
		System.out.println("Current selected month = "+selected_month2.getText());
		
		
		
		Select all_list=new Select(month_dropdown);
		List<WebElement> l1=all_list.getOptions();
		int all_month=l1.size();
				System.out.println("Total number of months = "+all_month);
		
				Assert.assertEquals(all_month,13);
			System.out.println("Assertion passed Successfully");	
				
		for(WebElement ele:l1) {
			
			String month_nm=ele.getText();
			System.out.println(" Month = "+month_nm);
			
		}
		*/
		
		Thread.sleep(5000);
		driver.close();
		
	}
	
}
