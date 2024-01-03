import java.util.*;
class Matrix
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a[][],i,j,n,m;
		System.out.println("enter no of rows and columns");
		m=s.nextInt();
		n=s.nextInt();
		a=new int[m][n];
		System.out.println("enter elements");
		for(i=0;i<m;i++)
		{
		    for(j=0;j<n;j++)
		{
		    a[i][j]=s.nextInt();
		}
		}
		System.out.println("Matrix is");
		for(i=0;i<m;i++)
		{
		 for(j=0;j<n;j++)
		 {
		System.out.print(a[i][j]+" ");
	}
     	System.out.println();
		}
		System.out.println("transpose matrix");
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    {
		        System.out.print(a[j][i]+" ");
		    }
		    System.out.println();
		}
	}
}


