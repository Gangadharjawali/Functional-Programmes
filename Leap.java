import java.util.*;
class Leap
{
	public static void main(String args[])
	{	
		int year;
		System.out.println("enter the year to check leap not not");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year%4 != 0)
		{	
			System.out.println(year+"is not a leap year");
		}
		else
		{
			if(year%100 == 0)
			{
				if(year%400 == 0)
				{
					System.out.println(year+"is a leap year");
				}
				else
				{
					System.out.println(year+"is not leap year");
				}
			}
			else
			{
				System.out.println(year+"is a leap year");
			}
		}
	}
}				
							
		 
