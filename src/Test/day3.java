package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 

public class day3 {

	@Test
	@Parameters({"URL"})
	public void WebloginCarLoan(String urlname)
	{
		System.out.println("webloginCArLoan");
		System.out.println(urlname);
	}
		
	@Test(groups={"Smoke"})
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileloginCar");
	}
	
	@Test
	public void LoginAPICarLoan()
	{
		System.out.println("APIloginCar");
	}
}
