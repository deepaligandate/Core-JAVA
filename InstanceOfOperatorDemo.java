class Student{ 
	private String name;
        private int age;
	private int id;

	void set(String name,int age,int id){
	this.name=name;
	this.age=age;
	this.id=id;
	}

	void show(){
	System.out.println(name + " "+age+" "+id);
	}
}
        

class InstanceOfOperatorDemo {
    public static void main (String[] args){

	Student s=new Student();
	s.set("manju",23,101);
	s.show();
	System.out.println("Is e an instance of Student: "+ (s instanceof Student));
    }
}