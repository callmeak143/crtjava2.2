import java.util.Scanner;
import Anil.Arth;
class Test
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("enter two num");
		a=s.nextInt();
		b=s.nextInt();
		Arth a1=new Arth();
		int r=a1.add(a,b);
		System.out.println("Addition="+r);
		System.out.println("pr4oduct="+a1.mul(a,b));
	}
}
	
