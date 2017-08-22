import java.util.*;
class Gambler
{
	public static void main(String []args)
	{
		int stake,goal,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Stake value.");
		stake=sc.nextInt();
		System.out.println("Enter the Goal value.");
		goal=sc.nextInt();
		System.out.println("enter the number of times ? ");
		num=sc.nextInt(); 
		Random r=new Random();
		float random;
		int win=0,loss=0;
		int temp;
		float percentofwin=0.00f,percentofloss=0.00f;
		int i;		
		for(i=0;i<num;i++) 
		{
			temp=stake; 
			while(temp!=goal)
			{
				random=r.nextFloat(); 
					if(random<=0.5) 
				{
					temp-=1;
				}
				else
				{
					temp+=1;
				}
				if(temp==0)
				{
					break;
				}
			}
			System.out.println(temp);
			if(temp==0)
			{
				loss++; 
			}
			else
			{
				win++; 
			}
		}
		percentofwin=(float) win*100/num;
		percentofloss=(float) loss*100/num;
		System.out.println("number of wins = "+win+ " percentage of win = "+percentofwin+ " % ");
		System.out.println("number of loss="+loss+" percentage of loss="+percentofloss+ "%");
	}
}



