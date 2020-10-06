import java.util.Scanner;

interface Taxable
{
	int salesTax=7;
	float incomeTax=10.5f;
        abstract void calcTax();
}

class Employee implements Taxable{
	int empId;
	String name;
	float salary;

	Employee(int empId,String name,float salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }

 public void calcTax(){
        float empIncomeTax=salary*incomeTax/100;
        System.out.println("Income tax: "+empIncomeTax);
    }
}


class Product implements Taxable{
	int pid;
	float price;
	int quantity;
	
	Product(int pid,float price,int quantity){
	this.pid=pid;
	this.price=price;
	this.quantity=quantity;
	}

	public void calcTax(){
        float prodTax = price*quantity*salesTax/100;
        System.out.println("Sales product tax: "+prodTax);
    }
}

class Main49{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  Employee Id : ");
        int empId = sc.nextInt();
        System.out.print("Enter Employee Name : ");
        String name = sc.next();
        System.out.print("Enter Employee Salary : ");
        float salary = sc.nextFloat();

        Employee e = new Employee(empId , name , salary);
        e.calcTax();

        System.out.print("Enter Product Pid : ");
        int pid = sc.nextInt();
        System.out.print("Enter Product Price : ");
        float price = sc.nextFloat();
        System.out.print("Enter Product Quantity : ");
        int quantity = sc.nextInt();

        Product p = new Product(pid,price,quantity);
        p.calcTax();

    }
}

