package testpackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test3 {

	@Test
	public void carloan() {
		
		System.out.println("i have bought new car");
	}
	
	@Test(dependsOnMethods= {"carloan"})
	public void carkia() {
		System.out.println("Dream completed");
	}
	
	@BeforeClass
	public void befclass() {
		System.out.println("i will execute before class ");
	}
	
	@BeforeSuite
	public void bsuite() {
		System.out.println("I am no 1 ");
		
	}
	
	@AfterSuite
	public void basuite() {
		System.out.println("I am no last ");
		
	}
	
	
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] o = new Object[2][2];
		o[0][0]="Aishwaya";
		o[0][1]="1234";
		o[1][0]="Aditya";
		o[1][1]="6789";
		return o;
	}
		
		@Test(dataProvider="getData")
		public void Mobilelogin(String username, String password) {
			
			System.out.println("Mobilelogincar");
			System.out.println(username);
			System.out.println(password);
			
			}
		
		
	
}
