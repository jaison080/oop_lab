import java.io.*;
import java.util.Scanner;
public class Reverse
{
	public static void main(String args[])
	{
		String str,rev="";
		int i,l;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a string : ");
		str=in.nextLine();
		l=str.length();
		for(i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed string : "+rev);	
	}
}		
