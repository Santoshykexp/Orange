package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testMethods {
	
	@BeforeTest
	
	public void beforetest() {
		Reporter.log("Before Test",true);
	}
	
	@BeforeSuite
	
	public void beforesuite() {
		Reporter.log("Before Suite");
	}
	
    @BeforeTest
	
	public void beforetest1() {
		Reporter.log("Before Test1",true);
	}
    
    @BeforeClass
	
	public void beforeclass() {
		Reporter.log("Before class",true);
	}
    
    @BeforeMethod
	
	public void beforemethod() {
		Reporter.log("Before method",true);
	}
    
    @Test
    
    public void test() {
    	Reporter.log("Test",true);
    }
    
@Test
    
    public void test1() {
    	Reporter.log("Test_1",true);
    }

@AfterMethod

public void aftermethod() {
	Reporter.log("AfterMethod",true);
}

}
