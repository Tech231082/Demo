package guru99Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		//String cellText=driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]")).getText();
			//     System.out.println(cellText);
		WebElement mytable = driver.findElement(By.xpath("html/body/table/tbody"));
		System.out.println(mytable);

		
		

	}

}
