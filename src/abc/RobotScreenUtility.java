package abc;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class RobotScreenUtility {

	
	public static void captureScreenshot(WebDriver driver, String screenshotname) {
		try {
			
			BufferedImage image=new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			ImageIO.write(image, "png", new File("./screenshot/"+screenshotname+".png"));
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
}
