import java.util.*;
public class div
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a,b,c;
	    System.out.println("enter two no");
	    a=s.nextInt();
	    b=s.nextInt();
	    if(b==0)
	{
	    System.out.println("second number cannot be zero");
	    b=1;
	}
	c=a/b;
	System.out.println(c);
	}
	
}
