package guru99Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Mouse {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.stqatools.com");
		 
		// Create object of Robot class
		Robot robot = new Robot();
		 
		// Press Left button
		robot.mousePress(InputEvent.BUTTON1_MASK);
		 
		// Release Left button
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		 
		// Press Middle button
		robot.mousePress(InputEvent.BUTTON2_MASK);
		 
		// Release Middle button
		robot.mouseRelease(InputEvent.BUTTON2_MASK);
		 
		// Press Right button
		robot.mousePress(InputEvent.BUTTON3_MASK);
		 
		// Release Right button
		robot.mouseRelease(InputEvent.BUTTON3_MASK);

	}

}
