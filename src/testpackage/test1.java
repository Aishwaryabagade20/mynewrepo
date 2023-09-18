package testpackage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {

	@Parameters({"url", "Apikey/username"})
	@Test
	public void logincarloan(String urlname,String key) {
		System.out.println("logincarloan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	
	@Test
	public void run() {
		
		System.out.println("Hello i am using testng here");
	//	Assert.assertTrue(false);
	}
	
	@Test
	public void run1() {
		
		System.out.println("this is testng test annotation");
	}
	
	@BeforeMethod
	public void befmethod() {
		System.out.println("execute before every method");
	}
	
}
