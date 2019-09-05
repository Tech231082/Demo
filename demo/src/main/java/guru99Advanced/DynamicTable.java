package guru99Advanced;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.stqatools.com");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("tableId"));
		List rows = (List) table.findElements(By.tagName("tr"));
		String Expected = "CellName";
		  // Print data from each row (Data from each td tag)
		 
		  for (WebElement row : rows) {
		 
		  List cols = (List) row.findElements(By.tagName("td"));
		 
		  for (WebElement col : cols) {
		 
		  System.out.print(col.getText() + "\t");
		 
		  String Actual = col.getText();
		 
		  // Check Expected Cell is present or not in WebTable
		  if (Actual.equals(Expected)) {
		 
		  System.out.println("Cell Exist in WebTable...");
		 
		  }
		  }
		 
		  System.out.println();
		  }

	}

}
