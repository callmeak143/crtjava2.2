import java.util.*;
public class qudratic
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    double a,b,c,d,r1,r2;
	    System.out.println("enter values");
	    a=s.nextDouble();
	    b=s.nextDouble();
	    c=s.nextDouble();
	    d=b*b-4*a*c;
	    if(d<0)
	    
	    else
	{
	r1=(-b+Math.sqrt(d))/(2*a);
	r2=(-b-Math.sqrt(d))/(2*a);
	System.out.println("root1="+r1);{
	        System.out.println("roots are not possible");
	    }
	System.out.println("root2="+r2);
	}
	}
}