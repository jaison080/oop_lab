import java.io.*;
import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		String str;
		int i,l;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string:");
		str=in.nextLine();
		l=str.length();
		for(i=l-1;i>=0;i--)
			System.out.print(str.charAt(i));
		System.out.println("\n");
	}
}			
