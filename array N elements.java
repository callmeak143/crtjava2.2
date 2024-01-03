import java.util.*;
class Array
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a[],i,n;
	    a=new int[5];
	    System.out.println("enter the elements");
	    n=s.nextInt();
	    System.out.println("enter size elements");
	    for(i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	    }
	    System.out.println("enter n elements");
	    for(i=0;i<n;i++)
	    {
	    a[i]=s.nextInt();
	    }
	    System.out.println("the values");
	    for(i=0;i<n;i++)
	    {
		System.out.println(a[i]+" ");
	}
	}
}