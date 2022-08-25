package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day2 {

	 @Test
	 public void ploan()
	{
		System.out.println("good");
		
	}
	 @BeforeSuite
	 public void Bsuit()
		{
			System.out.println("I am number one");
			System.out.println("I am number one1");
			System.out.println("I am number one2");
			System.out.println("I am number one3");
			
		}

@AfterSuite
public void Asuit()
	{
		System.out.println("I am Last one");
		
	}
}
