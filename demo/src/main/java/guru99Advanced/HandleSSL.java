package guru99Advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class HandleSSL {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:/mytools/firefoxdriver.exe");
		ProfilesIni prof = new ProfilesIni();
		//It create firefox profile
		FirefoxProfile profile=prof.getProfile("Sush");
		 
		// This will set the true value
		profile.setAcceptUntrustedCertificates(true);
		 
		// This will open  firefox browser using above created profile
		WebDriver driver=new FirefoxDriver(profile);
		 
		driver.get(" http://demo.guru99.com/test/cookie/selenium_aut.php");

	}

}
