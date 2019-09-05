package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestBase {
	public static WebDriver driver = null;
	@BeforeAll
	 public void initialize() throws IOException{
	 
	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver(); 
	 //To maximize browser
	                driver.manage().window().maximize();
	         //Implicit wait
	         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 //To open facebook
	                driver.get("https://www.facebook.com");
	 
	 }
	 
	 @AfterAll
	 //Test cleanup
	 public void TeardownTest()
	    {
	        TestBase.driver.quit();
	    }

	@Test
	void test() {
		
	}

}
