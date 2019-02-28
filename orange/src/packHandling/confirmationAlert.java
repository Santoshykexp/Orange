package packHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class confirmationAlert {
	
	@Test
	public void confirmAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.xpath("//*[@id='content']/p[8]/button")).click();
		Thread.sleep(5000);
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}

}
