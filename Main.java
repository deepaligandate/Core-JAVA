import java.util.Scanner;

abstract class Process1{
    int fact=1;
    abstract void fact();
    void display(){
        System.out.println("Factorial: "+fa);;
    }
}

abstract class Process2{
    float a;
    float pi=3.14f;
    abstract void area();
    void show(){
        System.out.println("Area of circle is: "+a);
    }
}

class Factorial extends Process1{
    void fact(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
    }
}


class Circle extends Process2{
    void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius");
        float r=s.nextFloat();
        a=2*pi*r;
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("Enter your choice");
            int choice=sc.nextInt();

            switch (choice) {
            
            case 1:
                Factorial f=new Factorial();
                f.fact();
                f.display();
                break;

	   case 2:
                Circle c=new Circle();
                c.area();
                c.show();
                break;
            }
                
        }
       
    }
}