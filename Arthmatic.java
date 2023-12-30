import java.util.*;
class arth
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a,b,r;
	    System.out.println("enter two num");
	    a=s.nextInt();
	    b=s.nextInt();
	    System .out.println("1.addition\2.subraction\3.multiply\4.division");
	    System.out.println("enter your choice");
	    int ch=s.nextInt();
	    switch(ch)
	    {
	        case 1:
	            r=a+b;
	            System.out.println("sum="+r);
	            break;
	            case 2:
	            r=a-b;
	            System.out.println("sub="+r);
	            break;
	            case 3:
	            r=a*b;
	            System.out.println("mul="+r);
	            break;
	            case 4:
	            r=a/b;
	            System.out.println("div="+r);
	            break;
	            default:
	            System.out.println("invlid num");
	    }
	}
}
	
	            
	            
	            
	            
	       
	         
	        
	    

