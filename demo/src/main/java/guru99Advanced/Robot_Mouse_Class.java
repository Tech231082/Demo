package guru99Advanced;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Mouse_Class {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.stqatools.com");
		Robot robot = new Robot();
		 
		// Scroll MouseWheel
		robot.mouseWheel(5);

	}

}
