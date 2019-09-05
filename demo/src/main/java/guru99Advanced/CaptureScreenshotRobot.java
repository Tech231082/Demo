package guru99Advanced;

import java.awt.AWTException;
import java.awt.Rectangle;

import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotRobot {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		// open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		// open webpage
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Robot robot = new Robot();
		int x = 10;
		int y = 10;
		int width = 500;
		int height = 200;
		Rectangle area = new Rectangle(x, y, width, height);
		
		BufferedImage bufferedImage = robot.createScreenCapture(area);
		File imageFile = new File("C:\\Selenium\\Robot.png");
		ImageIO.write(bufferedImage, "png", imageFile);
		

	}

}
