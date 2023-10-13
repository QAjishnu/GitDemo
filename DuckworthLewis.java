package InterviewQuestions;
import java.util.Scanner;
public class DuckworthLewis {
	public static void main(String[] args) {
		double runsA ,runsB;
		double OversA ,OversB;
		double OversReamainnig;
		double value=0.0;
		double newvalue;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the runs scored by team A");
		runsA = sc.nextDouble();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the runs scored by team B");
		runsB =sc1.nextDouble();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the wickets lost");
		double w=sc1.nextDouble();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the Overs remiaing");
		double d=sc1.nextDouble();
		if(d==50.00 && w==0)
		{
		value=100.00;	
		}
		else if(d==50.00 && (0<w && w<=2))
		{
			value=85.10;
		}
		else if(d==50.00 && (2<w && w<=5))
		{
			value=49.00;
		}
		else if(d==50.00 && (5<w && w<=7))
		{
			value=22.00;
		}
		else if(d==50.00 && (7<w && w<=9))
		{
			value=4.70;
		}
		
		else if((50.00>d && d>=40.00) && (w==0))
		{
			value=89.30;
		}
		
		else if((50.00>d && d>=40.00) && (0<w && w<=2))
		{
			value=77.80;
		}
		else if((50.00>d && d>=40.00) && (2<w && w<=5))
		{
			value=47.60;
		}
		else if((50.00>d && d>=40.00) && (5<w && w<=7))
		{
			value=22.00;
		}
		else if((50.00>d && d>=40.00) && (7<w && w<=9))
		{
			value=4.70;
		}	
		
		else if((40.00>d && d>=30.00) && (w==0))
		{
			value=75.10;
		}
		
		else if((40.00>d && d>=30.00) && (0<w && w<=2))
		{
			value=67.30;
		}
		else if((40.00>d && d>=30.00) && (2<w && w<=5))
		{
			value=44.70;
		}
		else if((40.00>d && d>=30.00) && (5<w && w<=7))
		{
			value=21.80;
		}
		else if((40.00>d && d>=30.00) && (7<w && w<=9))
		{
			value=4.70;
		}	
		
		else if((30.00>d && d>=20.00) && (w==0))
		{
			value=56.60;
		}
		
		else if((30.00>d && d>=20.00) && (0<w && w<=2))
		{
			value=52.40;
		}
		else if((30.00>d && d>=20.00) && (2<w && w<=5))
		{
			value=38.60;
		}
		else if((30.00>d && d>=20.00) && (5<w && w<=7))
		{
			value=21.20;
		}
		else if((30.00>d && d>=20.00) && (7<w && w<=9))
		{
			value=4.70;
		}	
		
		else if((20.00>d && d>=10.00) && (w==0))
		{
			value=32.10;
		}
		
		else if((20.00>d && d>=10.00) && (0<w && w<=2))
		{
			value=30.80;
		}
		else if((20.00>d && d>=10.00) && (2<w && w<=5))
		{
			value=26.10;
		}
		else if((20.00>d && d>=10.00) && (5<w && w<=7))
		{
			value=17.90;
		}
		else if((20.00>d && d>=10.00) && (7<w && w<=9))
		{
			value=4.70;
		}	
		
		else if((10.00>d && d>=5.00) && (w==0))
		{
			value=17.20;
		}
		
		else if((10.00>d && d>=5.00) && (0<w && w<=2))
		{
			value=16.80;
		}
		else if((10.00>d && d>=5.00) && (2<w && w<=5))
		{
			value=15.40;
		}
		else if((10.00>d && d>=5.00) && (5<w && w<=7))
		{
			value=12.50;
		}
		else if((10.00>d && d>=5.00) && (7<w && w<=9))
		{
			value=4.60;
		}	
		
		System.out.println(value);
		newvalue = 100-value;
		double DLTarget =(runsA*(newvalue/100));
		System.out.println("The updated target to chase on is " + Math.round(DLTarget));
		
		if(DLTarget<=runsB)
		{
			System.out.println("Team B has won the match by " + Math.round(runsB-DLTarget) + "Runs (D/L) rule");
		}
		else if(DLTarget>=runsB)
		{
			System.out.println("Team B has Lost the match by " + Math.round(DLTarget-runsB) + "Runs (D/L) rule");
		}	
	}
}
