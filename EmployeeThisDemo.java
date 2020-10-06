class EmployeeThis{  
	private int id;  
	private String name;  
	private float salary;  
	EmployeeThis(int id,String name,float salary){  
	this.id=id;  
	this.name=name;  
	this.salary=salary;  
	}  
	
	void show(){
	System.out.println(id+" "+name+" "+salary);
	}  
}  
  
	class EmployeeThisDemo{  
	public static void main(String args[]){  
	EmployeeThis e1=new EmployeeThis(101,"ankita",5000f);  
	EmployeeThis e2=new EmployeeThis(102,"manju",6000f); 
	EmployeeThis e3=new EmployeeThis(103,"pallavi",7000f);  
	e1.show();  
	e2.show();
	e3.show();  
	}
}  