package sceenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.commons.io.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
	public static void main(String[] args) throws IOException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest =new File("C:/Users/ionassessment/git/Orange/orange/photo/x.png");
	
	FileUtils.copyFile(src, dest);
	
	}
}
