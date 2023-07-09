package loginpageObject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("user_email_login"));

	}
	public static WebElement password(WebDriver driver) {
	return	driver.findElement(By.id("user_password"));
		
	}
	public static WebElement loginBtn(WebDriver driver) {
		return driver.findElement(By.id("user_submit"));

	}

}
