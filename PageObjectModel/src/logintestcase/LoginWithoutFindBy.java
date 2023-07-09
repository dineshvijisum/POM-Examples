package logintestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {
	public static WebElement user_email_login;
	public static WebElement user_password;
	public static WebElement user_submit;

	@Test
	public void loginwithoutFindBy() {
		System.setProperty("Webdriver.chrome.driver", "/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_in?utm_source=Email&utm_medium=Email&utm_campaign=FreeTrial_Verification");

		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		
		user_email_login.sendKeys("pofopo4020@iucake.com");
		user_password.sendKeys("12345678");
		user_submit.click();
	}
}
