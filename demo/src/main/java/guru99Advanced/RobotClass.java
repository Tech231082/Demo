package guru99Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.stqatools.com");
		 
		// Create object of Robot class
		Robot robot = new Robot();
		 
		// This will press Escape key on keyboard.
		robot.keyPress(KeyEvent.VK_ESCAPE);
		 
		// This will release the CAPS_LOCK key.
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		 
		// This will press Left mouse button.
		robot.mousePress(InputEvent.BUTTON1_MASK);
		 
		// This will release Left mouse button.
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Point coordinates = driver.findElement(By.id("img_location")).getLocation();
		 
		robot.mouseMove(coordinates.getX(), coordinates.getY());

	}

}
