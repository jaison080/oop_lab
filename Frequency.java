import java.io.*;
import java.util.Scanner;
public class Frequency
{
	public static void main(String args[])
	{
		int i,l,count=0;
		char c;
		String str;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string:");
		str=in.nextLine();
		System.out.println("Enter the character:");
		c=in.next().charAt(0);
		l=str.length();
		for(i=0;i<l;i++)
		{
			if(str.charAt(i)==c)
				count++;
		}
		System.out.println("Frequency of charcter "+c+" : "+count);
	}
}						
