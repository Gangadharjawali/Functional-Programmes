import java.util.*;
import java.io.*;
class TwoDArray
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		PrintWriter print=new PrintWriter(System.out, true); 
		int i,j;
		print.println("enter row size. ");
		int rows=sc.nextInt();
		print.println("enter col size. ");
		int cols=sc.nextInt();
		String array[][]=new String[rows][cols];
		print.println("enter the values ");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				array[i][j]=sc.next();
			}
		}
		print.println("array elements are. ");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				print.print(array[i][j] + "  ");
			}
			print.println(" ");
		}
	}
}
