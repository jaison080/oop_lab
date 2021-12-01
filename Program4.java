import java.io.*;
import java.util.Scanner;
public class Program4
{
	public static void main(String args[])
	{
		int n,k,sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an integer");
		n=in.nextInt();
		while(n>=1)
		{
			k=n%10;
			sum=sum+k;
			n=n/10;
		}
		System.out.println("Sum of digits : " + sum);
	}
}
