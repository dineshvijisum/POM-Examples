package logintestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import loginpageObject.LoginPomPageFactory;

public class LoginTCPageFactory {

	@Test
	public void login() {
		System.setProperty("Webdriver.chrome.driver", "/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_in?utm_source=Email&utm_medium=Email&utm_campaign=FreeTrial_Verification");

		PageFactory.initElements(driver,LoginPomPageFactory.class);
		
		
		LoginPomPageFactory.username.sendKeys("pofopo4020@iucake.com");
		LoginPomPageFactory.password.sendKeys("12345678");
		LoginPomPageFactory.submitBtn.click();
	}

}
