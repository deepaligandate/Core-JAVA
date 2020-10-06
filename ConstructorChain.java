class Person
{ 
    	Person() 
    	{ 
        
        this(45); 
        System.out.println("no-arg constructor person"); 
    	} 
  
    
   	 Person(int x) 
    	{ 
       	System.out.println("Parameterised constructor person"); 
    } 
}

class Employee extends Person{
	Employee(){
	this(12);
	
	System.out.println("no-arg Employee");
}

	Employee(int x){
	System.out.println("Parameterised constructor employee");
	}
}

class ConstructorChain{
	public static void main(String args[]){
	Employee e1=new Employee();
	}
}