package abc;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility2 {

	public static void captureScreenshot(WebDriver driver) {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(source, new File("./screenshot/"+System.currentTimeMillis()+".png"));
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
