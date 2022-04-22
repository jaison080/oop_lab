class Employee {
	String name;
	int age;
	long phone;
	String address;
	long salary;

	void printSalary(long salary) {
		System.out.println("Salary: " + salary);
	}
}

class Officer extends Employee {
	String specialization;
	String department;
}

class Manager extends Employee {
	String specialization;
	String department;
}

class Employee2 {
	public static void main(String args[]) {
		Officer off1 = new Officer();
		off1.name = "sneha";
		off1.age = 19;
		off1.phone = 986745678l;
		off1.address = "My house, kakkanad, kochi";
		off1.salary = 34567;
		System.out.println("Details of officer:");
		System.out.println("Name : " + off1.name);
		System.out.println("Age : " + off1.age);
		System.out.println("Phone number: " + off1.phone);
		System.out.println("Address: " + off1.address);
		System.out.println("Salary: " + off1.salary);
		System.out.println("******************************");
		Manager man1 = new Manager();
		man1.name = "sona";
		man1.age = 20;
		man1.phone = 4645342367l;
		man1.address = "My house, thrikkakara, kochi";
		man1.salary = 54236;
		System.out.println("Details of manager:");
		System.out.println("Name : " + man1.name);
		System.out.println("Age : " + man1.age);
		System.out.println("Phone number: " + man1.phone);
		System.out.println("Address: " + man1.address);
		System.out.println("Salary: " + man1.salary);
		System.out.println("******************************");
	}
}