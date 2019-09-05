package guru99Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		WebElement Element=driver.findElement(By.xpath("//*[@id=\"home\"]"));
		
		//WebElement Element=driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		Robot robot = new Robot();  // Robot class throws AWT Exception	
        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
        robot.keyPress(KeyEvent.VK_DOWN);  
        robot.keyPress(KeyEvent.VK_UP);
        robot.mousePress(InputEvent.BUTTON1_MASK);
	
		

	}

}
