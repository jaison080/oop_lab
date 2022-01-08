import java.io.*;
import java.util.Scanner;
public class Transpose
{
	public static void main(String args[])
	{
		int a[][]=new int[100][100];
		int t[][]=new int[100][100];
		int m,n,i,j;
		Scanner in= new Scanner(System.in);
		System.out.print("Enter the no: of rows : ");
		m=in.nextInt();
		System.out.print("\nEnter the no: of columns : ");
		n=in.nextInt();
		System.out.println("\nEnter the elements of matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				t[j][i]=a[i][j];
			}
		}
		System.out.println("Transpose");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(t[i][j]+"\t");
			}
			System.out.println();
		}
	}
}						
