package aaa;
import java.util.*;
public class Maxarray {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i,j,temp;
	int a[]=new int[5];
	System.out.println("Enter Elements");
	for(i=0;i<5;i++)
	{	
	a[i]=sc.nextInt();
}
	for(i=0;i<5;i++)
 {
	 for(j=0;j<5;j++)
	 {
		 if(a[i]<a[j])
		 {
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
	 }
 }
 System.out.println("the maximum number is"+a[4]);
		 }
}
