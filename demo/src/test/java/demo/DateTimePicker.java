package demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class DateTimePicker {

	@Test
	void dateTimePicker() {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/");
		WebElement date=driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		date.sendKeys("10231982");
		date.sendKeys(Keys.TAB);
		date.sendKeys("0600AM");
	    driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		
		
	}

}
