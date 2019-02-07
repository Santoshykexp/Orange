package script;

import org.testng.annotations.Test;

import generic.basetest;
import page.login;

public class loginpage extends basetest {
	
	@Test
	
	public void Loginpage() {
		login ol=new login(driver);
		ol.setusername("Admin");
		ol.setpassword("admin123");
		ol.loginBt();
		
		
	}

	
	

}
