package abc;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {

	public static void captureScreenshot(WebDriver driver, String screenshotname) {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(source, new File("./screenshot/"+screenshotname+".png"));
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
