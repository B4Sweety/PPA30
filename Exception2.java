import java.util.*;

class Exception2
{
	public static void main(String arg[])
	{
		int ans = 0, no1 = 0, no2 = 0;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("plz enter 1st no:");
		no1 = sobj.nextInt();
		
		System.out.println("plz enter 2nd no:");
		no2 = sobj.nextInt();
		
		try
		{
		ans = no1/no2;	//Exception prone code
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Exception occured as :"+obj);
		}
		finally
		{
			sobj.close();	//resource release karna
		}
		
		System.out.println("Division is :"+ans);
	}
}