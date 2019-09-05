package packageJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//a[contains(@class,'gh-p')]")).click();
		//List <WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println(links);
		//System.out.println(links.size());
		List <WebElement> inputs=driver.findElements(By.tagName("input"));
		//System.out.println(inputs);
		System.out.println(inputs.size());
		for(int i=0;i<inputs.size();i++) {
			String input=inputs.get(i).getText();
			System.out.println(input);
			
		}

	}

}
