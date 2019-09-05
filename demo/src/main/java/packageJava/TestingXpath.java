package packageJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sush.rinwa@gmail.com");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sushila231082");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.findElement(By.xpath("//a[text()='Cookies']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Data')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();

	}

}
