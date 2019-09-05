package guru99Advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/" );
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		aTitle=driver.getTitle();
		if(aTitle.contentEquals(eTitle)) {
			System.out.println(aTitle);
		}else
		{
			System.out.println("Test Failed");
		}
		

	}

}
