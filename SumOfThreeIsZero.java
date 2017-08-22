import java.util.*;
public class SumOfThreeIsZero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		int i,j,k,sum,count=0;;
		for(i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<=a.length-3;i++)
		{
			for(j=i+1;j<=a.length-2;j++)
			{
				for(k=j+1;k<=a.length-1;k++)
				{
					sum=a[i]+a[j]+a[k];
					if(sum==0)
					{	
						count++;
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}					
				}
			}
		}
		System.out.println(count);
	}
}

