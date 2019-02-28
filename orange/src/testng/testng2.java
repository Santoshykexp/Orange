package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng2 {
	
@BeforeTest
	
	public void beforetest1() {
		Reporter.log("Before Test1_class2",true);
	}

@Test

public void test() {
	Reporter.log("Test_class2",true);
}

@AfterTest

public void afterTest1() {
	
	Reporter.log("After Test_1_class2",true);
}
}
