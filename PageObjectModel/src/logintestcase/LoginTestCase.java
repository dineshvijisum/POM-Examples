package logintestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import loginpageObject.LoginPageObject;

public class LoginTestCase {
	
	@Test
	public void login() {
		
		System.setProperty("Webdriver.chrome.driver", "/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_in?utm_source=Email&utm_medium=Email&utm_campaign=FreeTrial_Verification");
		
		LoginPageObject.username(driver).sendKeys("pofopo4020@iucake.com");
		LoginPageObject.password(driver).sendKeys("12345678");
		LoginPageObject.loginBtn(driver).click();
		
	}

}
