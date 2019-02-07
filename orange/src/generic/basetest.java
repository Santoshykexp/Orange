package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class basetest implements IAutoConst {
	public WebDriver driver;
	
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);

	}
	
	@BeforeMethod
	
	public void openApp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}

}
