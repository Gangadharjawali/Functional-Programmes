import java.util.*;
class UserName
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name "); 
		String name=sc.nextLine(); 
		int length=name.length();
		if(length>=3) 
		{
		System.out.println("Hello  " + name + "  How are you ?");
		}
		else
		{
			System.out.println("the given name is too small ..!!");
		}
	}
}
