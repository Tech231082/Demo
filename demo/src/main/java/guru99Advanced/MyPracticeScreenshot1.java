package guru99Advanced;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.selenesedriver.TakeScreenshot;

public class MyPracticeScreenshot1  {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		// open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://www.stqatools.com");
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C://screen/secondScreenshot.png"));
		System.out.println("Saved");
		

	}

}
