import java.util.*;
class Harmonic
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number"); 
		int num=sc.nextInt(); 
		float value=0.00f; 
		if(num <= 0) 
		{
			System.out.println("Number is invalid. ");
		}
		else
		{
			for(int i=1;i<=num;i++)
			{
				value=value+(float) 1/i; 
			}
			System.out.println("The "+num+ " harmonic value is "+value+ " .");
		}
	}
}
