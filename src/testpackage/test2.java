package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class test2 {

	@Test(groups= {"Regression"})
	public void run2() {
		
		System.out.println("This is second test");
		
		System.out.println("I am in test 2 class");
		
	}
	
	@Test
	public void gun() {
		System.out.println("This is a gun method");
	}
	
	@AfterClass
	public void aftclass() {
		
		System.out.println("i will execute after all methods from this test2 class");
	}
}
