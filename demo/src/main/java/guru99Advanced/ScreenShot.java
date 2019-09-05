package guru99Advanced;
import javax.imageio.ImageIO;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.stqatools.com");
		 
		// Create object of Robot class
		Robot robot = new Robot();
		 
		// Get Screen Size
		java.awt.Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		 
		// Capture ScreenShot
		BufferedImage img = robot.createScreenCapture(new Rectangle(size));
		 
		// Store image into file
		File path = new File("C://profile/profile.jpg");
		 
		// Write image path
		ImageIO.write(img, "JPG", path);

	}

}
