import java.util.*;
class FlipCoin
{
	public static void main(String []args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of times to flip coin");
		num=sc.nextInt(); 
		int h;
		int t;
		Random r=new Random(); 
		float random;
		h=0;
		t=0; 
		if(num>0) 
		{
			for(int i=0;i<num;i++)
			{
				random=r.nextFloat();
				if(random<0.5) 
				{
					h++;
				}
				else
				{
					t++;
				}
			}
			float hpercent =(float) h*100/num; 
			float tpercent =(float) t*100/num;
			System.out.println("Percentage of Heads is " + hpercent + " % .");
			System.out.println("Percentage of Tails is " + tpercent +"% .");
		}
		else 
		{
			System.out.println("enter +ve number ");
		}
	}
}
