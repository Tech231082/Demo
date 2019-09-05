package guru99Advanced;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.net.HttpURLConnection;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://newtours.demoaut.com/");
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(1000);
		List<WebElement> links= (List<WebElement>) driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			URL link=new URL(url);
			HttpURLConnection connection= (HttpURLConnection) link.openConnection();
			Thread.sleep(1000);
			connection.connect();
			int responseCode=connection.getResponseCode();
			if(responseCode>400) {
				System.out.println("The link is broken  "+link);
				
			}
			else {
				System.out.println("The link is valid link  "+link);
			}
			
			
			
			
		}
		
		
		

	}

}
