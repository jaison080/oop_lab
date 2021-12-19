import java.io.*;
import java.util.Scanner;
class Employee
{
	long phone;
	String name;
	int age;
	String address;
	double salary;
	void printSalary()
	{
		System.out.println("Salary of the employee : "+salary);
	}
}
class Officer extends Employee
{
	String specialization;
	
}
class Manager extends Employee
{
	String department;
	
}
class Inheritance
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Manager obj1=new Manager();
		Officer obj2=new Officer();
		System.out.println("Enter the name of the manager : ");
		String name1,add1,add2;
		name1=in.nextLine();
		System.out.println("Enter the address : ");
		add1=in.nextLine();
		obj1.address=add1;
		System.out.println("Enter the name of the officer : ");
		String name2;
		name2=in.nextLine();
		System.out.println("Enter the address : ");
		add2=in.nextLine();
		obj2.address=add2;
		System.out.println("Enter the age of mananger : ");
		int age1;
		age1=in.nextInt();
		obj1.age=age1;
		System.out.println("Enter the phone : ");
		long phone1;	
		phone1=in.nextLong();
		obj1.phone=phone1;
		System.out.println("Enter the salary : ");
		double sal1;
		sal1=in.nextDouble();
		obj1.salary=sal1;
		System.out.println("Enter the age of officer : ");
		int age2;
		age2=in.nextInt();
		obj2.age=age2;
		System.out.println("Enter the phone : ");
		long phone2;
		phone2=in.nextLong();
		obj2.phone=phone2;
		System.out.println("Enter the salary : ");
		double sal2;
		sal2=in.nextDouble();
		obj2.salary=sal2;
		System.out.println("Manager");
		System.out.println("Name : "+name1+"\tAge : "+obj1.age+"\tPhone : "+obj1.phone+"\tSalary : "+obj1.salary+"\tAddress : "+obj1.address);
		System.out.println("Officer");
		System.out.println("Name : "+name2+"\tAge : "+obj2.age+"\tPhone : "+obj2.phone+"\tSalary : "+obj2.salary+"\tAddress : "+obj2.address);
	}
}
