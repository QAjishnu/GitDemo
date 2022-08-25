package Test;

import org.testng.annotations.Test;

public class day4 {

	
	@Test
	public void WebloginHomeLoan()
	{
		System.out.println("webloginhomeLoan");
	}
		
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileloginHome");
	}
	
	@Test(dependsOnMethods= {"WebloginHomeLoan"})
	public void LoginAPIHomeLoan()
	{
		System.out.println("APIloginHome");
	}
}
