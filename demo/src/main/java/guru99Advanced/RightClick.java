package guru99Advanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions action=new Actions(driver);
		WebElement rightclick=driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(rightclick).perform();
		WebElement edit=driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		edit.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

}
