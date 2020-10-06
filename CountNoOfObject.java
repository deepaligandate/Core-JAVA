class Student{
    	private int Id;
    	private String Name;
	private int Marks;
    	public static int counter=0;

    Student(int id,String name,int marks){
        Id=id;
        Name=name;
	Marks=marks;
        counter++;
    }
}

class CountNoOfObject{
	public static void main(String args[]){
        Student s1=new Student(1,"Manju",50);
        Student s2=new Student(2,"Pooja",90);
        Student s3=new Student(3,"Bhagyashri",85);
        Student s4=new Student(4,"Dipali",67);
        Student s5=new Student(5,"Anju",80);

        System.out.println("Total objects count "+Student.counter);
    }
}