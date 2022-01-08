import java.io.*;
import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
	{
		int n,i,k=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=in.nextInt();
		for(i=1;i<=n;i++)
		{	
			if(n%i==0)
				k++;
		}
		if(k==2)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	}
}						
