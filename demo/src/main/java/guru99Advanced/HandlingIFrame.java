package guru99Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		System.out.println("********We are switch to the iframe*******");
 		driver.findElement(By.xpath("html/body/a/img")).click();
		    //Clicks the iframe
   
			System.out.println("*********We are done***************");
			driver.switchTo().defaultContent();

	}

}
