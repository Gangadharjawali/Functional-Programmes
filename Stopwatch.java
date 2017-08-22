import java.util.*;
class Stopwatch
{
	public static void main(String []args)
	{
		double start_time,end_time,time;
		Scanner sc=new Scanner(System.in);
		start_time=System.currentTimeMillis();
		//System.out.println(start_time);
		sc.nextLine();
		end_time=System.currentTimeMillis();
		//System.out.println(end_time);
		time=(double) end_time-start_time;
		System.out.println(" "+time+" millisec ");
	}
}
