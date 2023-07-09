package loginpageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPomPageFactory {
	
	@FindBy(how=How.ID,using="user_email_login")
	public static WebElement username;
	@FindBy(id ="user_password")
	public static WebElement password;
	@FindBy(id = "user_submit")
	public static WebElement submitBtn;
	

}
