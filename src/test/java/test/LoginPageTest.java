package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;


public class LoginPageTest extends Baseclass {
	XSSFWorkbook wbook;
	XSSFSheet sheet;
	
	@Parameters({"Email","Password"})
	@Test
	public void LoginTest(String Emailval,String Passwordval) {
		
		test = report.startTest("Login Page");
		LoginPage Login = new LoginPage();
		Login.login(Emailval, Passwordval);
		
		
	}
	

}
