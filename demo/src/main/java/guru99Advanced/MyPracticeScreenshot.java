package guru99Advanced;

import java.awt.AWTException;
import java.awt.Dimension;
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

public class MyPracticeScreenshot {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		// open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.get("https://www.stqatools.com");
		Robot robot=new Robot();
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		BufferedImage img=robot.createScreenCapture(new Rectangle(size));
		File destination=new File("C://screen/screenshot.png");
		ImageIO.write(img, "JPG", destination);
		System.out.println("Screenshot taken and saved to the destination folder");
		

	}

}
