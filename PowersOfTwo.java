import java.util.*;
class PowersOfTwo
 {
	public static void main(String[] args) 
	{
		 int n = Integer.parseInt(args[0]);// read the number through comand line arguments
	        int i = 0;             
	        int powerOfTwo = 1;    
	        while (i <= n) 
		{
	            System.out.println(i + " " + powerOfTwo);  
        	    powerOfTwo = 2 * powerOfTwo;         
        	    i = i + 1;
        	}
	    }
}

