import java.util.*;
class Coupon
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scan.nextInt();
		int array[]=new int[size];
		int count=0,value,index=0,j;
		StaticFunction sf=new StaticFunction(); 
		while(index!=size)
		{
			value=sf.get();
			count++;
			j=0;
			if(index==0)
			{
				array[index]=sf.get();
				index++;
			}
			else
			{
				for(int i:array)
				{
					if(i==value)
					{
						j=1;
						break;
					}
				}
				if(j==0)
				{
					array[index]=value;
					index++;
				}
				
			}
		}
		System.out.println("The "+size+" Random numbers are ");
		for(j=0;j<size;j++)
		{
		System.out.println(" "+array[j]+" ");
		}
		System.out.println(" ");
		Arrays.sort(array);
		System.out.println("the sorted elements are");
		for(j=0;j<size;j++)
		{
		System.out.print(" "+array[j]+" ");
		}
		System.out.println(" ");
		System.out.println("random generated numbers  are "+count+" ");
	}
	public static class StaticFunction
	{
		private int value;
		Random r=new Random();
		public int get()
		{
			value=r.nextInt(99);
			return value;
		}
	}
}
