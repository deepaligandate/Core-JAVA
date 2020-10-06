package ass7;

import java.util.Scanner;

class Employee{
	private int empId;
	private String empName;
	private float salary;
	public Employee(int empId, String empName, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public String toString() {
		return empId + " " + empName + " " + salary;
	}
	
}

public class fifty {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Employee e[]=new Employee[5];
		for(int i=0;i<e.length;i++) {
			
			
			System.out.println("Enter emp ID");
			int id=s.nextInt();
			System.out.println("Enter emp name");
			String name=s.next();
			System.out.println("Enter salary");
			float sal=s.nextFloat();
			e[i]=new Employee(id, name, sal);
		}
		for(Employee e1:e) {
			System.out.println(e1);
		}

	}

}