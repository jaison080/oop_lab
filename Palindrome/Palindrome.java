import java.io.*;
import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,l;
		String rev="",str;
		char r;
		System.out.println("Enter the string");
		str=in.nextLine();
		l=str.length();
		for(i=l-1;i>=0;i--)
		{
			r=str.charAt(i);
			rev=rev+r;
		}
		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");		
	}
}
