package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testMethods {
	
	@BeforeTest
	
	public void beforetest() {
		Reporter.log("Before Test_class1",true);
	}
	
	@BeforeSuite
	
	public void beforesuite() {
		Reporter.log("Before Suite_class1");
	}
	
    
    
    @BeforeClass
	
	public void beforeclass() {
		Reporter.log("Before class_class1",true);
	}
    
    @BeforeMethod
	
	public void beforemethod() {
		Reporter.log("Before method_class1",true);
	}
    
    
    
@Test
    
    public void test1() {
    	Reporter.log("Test_1_class1",true);
    }

@AfterMethod

public void aftermethod() {
	Reporter.log("AfterMethod_class1",true);
}

@AfterTest

public void aftertest() {
	Reporter.log("After Test_class 1",true);
}

}
