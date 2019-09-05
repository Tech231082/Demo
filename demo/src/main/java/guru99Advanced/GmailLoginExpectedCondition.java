package guru99Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginExpectedCondition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(driver,20);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]")).sendKeys("sush.rinwa@gmail.com");
		

	}

}
