public class Quadratic
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 6;
        int c = 4;
	System.out.println("a="+a+"b="+b+"c="+c);
        double temp = Math.sqrt(b * b - 4 * a * c);
        double r1 = (-b +  temp) / (2*a) ;
        double r2 = (-b -  temp) / (2*a) ;
        System.out.println("The roots of the Quadratic Equation \"2x2 + 6x + 4 = 0\" are "+r1+" and "+r2);
    }
}
