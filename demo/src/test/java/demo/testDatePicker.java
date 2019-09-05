package demo;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class testDatePicker {

	@Test
	void testDateTimePicker() {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");
		driver.manage().window().maximize();
		WebElement date=driver.findElement(By.xpath("//*[@id=\"example\"]/div/span/span/span[2]/span[1]/span"));
		date.click();
		WebElement moveLeft=driver.findElement(By.xpath("//*[@id=\"d0bedf2a-3f00-4926-891b-5866c36de84a\"]/div[1]/a[1]/span"));
		WebElement moveRight=driver.findElement(By.xpath("//*[@id=\"d0bedf2a-3f00-4926-891b-5866c36de84a\"]/div[1]/a[3]/span"));
		WebElement center=driver.findElement(By.xpath("//*[@id=\"d0bedf2a-3f00-4926-891b-5866c36de84a\"]/div[1]/a[2]"));
		String main = "";
		String s[] = main.split(" ",2);
		String part1 = s[0];
		String part2 = s[1];

		WebElement time=driver.findElement(By.xpath("//*[@id=\"example\"]/div/span/span/span[2]/span[2]/span"));
		
		
	}

}
