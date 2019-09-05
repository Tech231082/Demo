package guru99Advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SSLCertificate {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:/mytools/firefoxdriver.exe");
		ProfilesIni prof = new ProfilesIni();				
				FirefoxProfile ffProfile= prof.getProfile ("Sush");
				ffProfile.setAcceptUntrustedCertificates(true);
				ffProfile.setAssumeUntrustedCertificateIssuer(false);
				WebDriver driver = new FirefoxDriver (ffProfile);
				driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");

	}

}
