package windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectHandling {
	
		
		
	public void s() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//select[@id='month']"));
		Select se=new Select(ele);
		se.selectByVisibleText("Mar");
	}

	
	public static void main(String[] args) {
		
		selectHandling sh=new selectHandling();
		sh.s();
		
	}

}
