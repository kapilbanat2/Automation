package abc;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WaitExamples {

	public static void main(String args[]) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		//driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	    driver.get("https://accounts.google.com/ServiceLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	    
	    String actual = driver.findElement(By.xpath("//span[contains(text(),'Enter an email or phone number')]")).getText();
	    String expact = "Enter a password";
	    
	    Assert.assertEquals(actual, expact);
	    Thread.sleep(3000);
	    
	    System.out.println("Error message getting matched as expected");
	    
	    
	    //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
	   // driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
	    //System.out.println("Button is clicked");
	    //Thread.sleep(5000);
	    /*
	    WebDriverWait wait = new WebDriverWait(driver,20);
	    WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='demo' and text()='WebDriver']")));
	    
	    boolean status = ele.isDisplayed();
	    if(status)
	    	System.out.println("WebDriver is Displayed");
	    else {
			System.out.println("WebDriver is not displayed");
		}
	    
	   // sendKeys("8130749400");
	    
		Thread.sleep(5000);
		driver.close();
		*/
	    // Fluent Wait
	    /*
	    Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
	    		.withTimeout(20, TimeUnit.SECONDS)
	    		.pollingEvery(1, TimeUnit.SECONDS)
	    		.ignoring(NoSuchElementException.class);
	    
	    WebElement element = wait.until(new Function<WebDriver, WebElement>()
	    		{
	    	public WebElement apply(WebDriver driver) {
	    		WebElement ele=driver.findElement(By.xpath("//p[@id='demo' and text()='WebDriver']"));
	    		String value=ele.getAttribute("innerHTML");
	    		if(value.equalsIgnoreCase("WebDriver"))
	    			return ele;
	    		else
	    		{
	    			System.out.println("Text which is coming on the screen = "+ value);
	    			return null;
	    		}}}
	    );
	    System.out.println("Element is Displayed ? "+ element.isDisplayed());	
	    	System.out.println(" Element's value = "+ element.getText());
	    */
	    
	    //Error Message
	    
	    
	    
	    	
	    	
	    	
	    	
	    	
	    
	}
	
}
