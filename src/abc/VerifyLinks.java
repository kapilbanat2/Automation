package abc;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyLinks {

	public static void main(String args[]) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		//ScreenshotUtility.captureScreenshot(driver, "BrowserOpened");
		//ScreenshotUtility2.captureScreenshot(driver);
		RobotScreenUtility.captureScreenshot(driver, "BrowserOpened");
		
	    driver.manage().window().maximize();
	    //ScreenshotUtility.captureScreenshot(driver, "BrowserMaximized");
	   // ScreenshotUtility2.captureScreenshot(driver);
		
	    List<WebElement> list=driver.findElements(By.tagName("a"));
	    
	    System.out.println("Total number of links : "+list.size());
	    
	    for(int i=0; i<list.size();i++) {
	    	WebElement ele = list.get(i);
	    	String linkurl = ele.getAttribute("href");
	    	verifyLinkActive(linkurl);
	    }
}

	public static void verifyLinkActive(String linkurl) {
		
		try {
			URL url = new URL(linkurl);
			
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			
			if(httpURLConnect.getResponseCode()==200)
				System.out.println("fb  :"+linkurl+"    "+httpURLConnect.getResponseMessage());
			if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
				System.out.println("fb  :"+linkurl+"    "+httpURLConnect.getResponseMessage()+"    "+HttpURLConnection.HTTP_NOT_FOUND);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	


}
