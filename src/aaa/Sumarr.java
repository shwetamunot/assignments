package aaa;
import java.util.*;
public class Sumarr {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,sum;
		sum=0;
		System.out.println("Enter how many elements you want?");
		n=sc.nextInt();
		
		int a[]=new int[n];
	    System.out.println("Enter Elements");
		for(i=0;i<n;i++)
	    {
		a[i]=sc.nextInt();
		sum=sum+a[i];
	    }
	    System.out.println("the sum of elements"+sum);
	  
	    }
}
