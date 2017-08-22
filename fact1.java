import java.util.Scanner;
public class fact1 {
    public static void main(String[] args) {
	int num;        
	Scanner sc=new Scanner(System.in);     
        System.out.println("enter the number ");
        num=sc.nextInt();       
        while(num%2==0)
        {
            System.out.print(2+" ");
            num=num/2;
        }
	int i;
        for(i=3; i<=Math.sqrt(num); i+=2)
        {
            while(num%i==0)
            {
                System.out.print(i+" ");
                num=num/i;
            }
        }        
        if(num>2)
        {
            System.out.print(num);
        }
    }
}
