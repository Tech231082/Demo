package guru99Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		// open firefox
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		// open web page
		driver.get("https://chercher.tech/files/minion.zip");
		Thread.sleep(3000);
		// create object to robot class
		Robot robot = new Robot();
		// press tab first time
		robot.keyPress(KeyEvent.VK_TAB);
		// press tab second time
		//robot.keyPress(KeyEvent.VK_TAB);
		// press enter key
		//robot.keyPress(KeyEvent.VK_ENTER);


	}

}
