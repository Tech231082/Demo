package guru99Advanced;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookies {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    //driver.manage().deleteAllCookies();
	    driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");   
	    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("abc123");							
        driver.findElement(By.name("password")).sendKeys("123xyz");							
        driver.findElement(By.name("submit")).click();		
	    Set<Cookie> cookies = driver.manage().getCookies();
	    /*for (Cookie cookie : cookies) {
	        System.out.println(" Cookie Name - " + cookie.getName() 
	    			+ " Cookie Value - "  + cookie.getValue());
	    }*/
	    System.out.println("\n");
	    System.out.println(cookies.size());
	    System.out.println("\n");
	    driver.manage().getCookieNamed("Selenium");
	    System.out.println(driver.manage().getCookieNamed("Selenium"));
	    System.out.println("\n");
	    Cookie newCookie=new Cookie("myCookie","456");
	    System.out.println("\n");
	    driver.manage().addCookie(newCookie);
	    System.out.println(newCookie);
	    cookies=driver.manage().getCookies();
	    System.out.println("\n");
	    for (Cookie cookie : cookies) {
	        System.out.println(" Cookie Name - " + cookie.getName() 
	    			+ " Cookie Value - "  + cookie.getValue());
	    }
	    System.out.println("\n");
	    System.out.println(cookies.size());
	    driver.manage().deleteCookieNamed("Selenium");
	    cookies=driver.manage().getCookies();
	    System.out.println(cookies.size());
	    driver.manage().deleteCookie(newCookie);
	    //driver.manage().deleteAllCookies();
	    cookies=driver.manage().getCookies();
	    System.out.println(cookies.size());
	    

	}

}
