package guru99Advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:/mytools/firefoxdriver.exe");
		ProfilesIni Pro=new ProfilesIni();
		org.openqa.selenium.firefox.FirefoxProfile myP=Pro.getProfile("Sush");
		WebDriver driver=new FirefoxDriver(myP);
		driver.manage().window().maximize();
		//Go to URL which you want to navigate
			driver.get("http://www.google.com");
		//Set  timeout  for 5 seconds so that the page may load properly within that time
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		

	}

}
