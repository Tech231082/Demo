package guru99Advanced;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenshotRobot {

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		// open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// open webpage
		driver.get("https://chercher.tech/java/practice-pop-ups-selenium-webdriver");
		// create object to robt class
		Robot robot = new Robot();
		// create rectangle for full screenshot
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		// capture screen of the desktop
		BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		// save the screenshot to local system
		ImageIO.write(screenFullImage, "png", new File("C:\\Selenium\\FullScreenshotRobot.png"));

		System.out.println("Full Desktop screenshot saved!");

	}

}
