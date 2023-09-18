package testpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test4 {

	@BeforeTest
	public void prereuisite() {
		
		System.out.println("i will execute first");
	}
	
	@Test(groups= {"Regression"})
	public void carkia() {
		System.out.println("Dream completed from test4");
	}
	
	@BeforeMethod
	public void befmethod() {
		System.out.println("i will execute before all methods");	
	}
	
	@AfterMethod
	public void aftmethod() {
		System.out.println("i will execute after all methods");	
	}
	
}
