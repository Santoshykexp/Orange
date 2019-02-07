package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	@FindBy(id="txtUsername")
	private WebElement unTB;
	
	@FindBy(id="txtPassword")
	private WebElement psTB;
	
	@FindBy(id="btnLogin")
	private WebElement lgBT;
	
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String un) {
		unTB.sendKeys(un);
	}
	
	public void setpassword(String ps) {
		psTB.sendKeys(ps);
	}
	
	public void loginBt() {
		lgBT.click();
		
	}

}
