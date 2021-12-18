import java.io.*;
import java.util.Scanner;
public class Program11
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		int i,j,n,temp,small;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of elements of the array : ");
		n=in.nextInt();
		System.out.println("\nEnter the elements of the array");
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}	
		}		
		small=a[n-2];
		System.out.println("Second smallest element : "+small);
	}			
}
