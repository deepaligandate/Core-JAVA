
class Student{
	int rollno;
	float percentage;

	Student()
	{
		System.out.println("Default constructor in student");	
	}

	Student(int rollno,float percentage)
	{
		this.rollno=rollno;
		this.percentage=percentage;
		System.out.println("Parameterised constructor in student");
	}

	 void show()
	{
		System.out.println(rollno+" "+percentage);
	}
}

class CollegeStudent extends Student{
	int semester;

	CollegeStudent()
	{
		System.out.println("Default constructor in college student");	
	}

	CollegeStudent(int semester)
	{
		this.semester=semester;
		System.out.println("Parameterised constructor in college student");
	}

	void show()
	{
		
		System.out.println(semester+" ");
	}
}

class SchoolStudent extends Student{

	String className;
	
	
	SchoolStudent()
	{
		System.out.println("Default constructor in school student");	
	}

	SchoolStudent(String className)
	{
		this.className=className;
		System.out.println("Parameterised constructor in school student");
	}

	 void show()
	{
		
		System.out.println(className+" ");
	}
}

class Demo45{
	public static void main(String args[]){
	CollegeStudent c[ ]= new CollegeStudent[2];
	c[0] = new CollegeStudent(2);
	c[1] = new CollegeStudent(3);
	SchoolStudent s[ ]= new SchoolStudent[3];
	s[0] = new SchoolStudent("tenth");
	s[1] = new SchoolStudent("twelveth");
	s[2] = new SchoolStudent("nineth");

	System.out.println( "CollegeStudent data in college c 0: "); 
        c[0].show();

	System.out.println( "CollegeStudent data in college c 1: "); 
        c[1].show();

	System.out.println( "SchoolStudent data in school s 0: "); 
        s[0].show(); 

	System.out.println( "SchoolStudent data in school s 1: "); 
        s[1].show(); 
        
        System.out.println( "SchoolStudent data in school s 2: "); 
        s[2].show(); 
	}
}




