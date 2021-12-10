package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import test.Baseclass;

public class LoginPage {
	WebDriver driver = Baseclass.driver;
	ExtentTest test = Baseclass.test;
	
	//*************************WebElements**********************
	@FindBy(linkText="Login/Signup")
	WebElement SignBtn;
	
	@FindBy(css="input[name*='email_id']")
	WebElement email;
	
	@FindBy(css="input[name*='pwd']")
	WebElement password;
	
	@FindBy(css="button")
	WebElement LoginFinal;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String Emailval,String Passwordval) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(SignBtn));
		SignBtn.click();
		email.sendKeys(Emailval);
		password.sendKeys(Passwordval);
		LoginFinal.click();
	}
	

}
