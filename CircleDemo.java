import java.util.Scanner;
class Circle{
		Scanner sc=new Scanner(System.in);
		int r;
		double area;
		float pi=3.14f;
		
		void init(){
			System.out.println("Enter radius");
			r=sc.nextInt();
			}

		void calculateArea()
   			{
      			   area=(3.14*(r*r));
   			}

		void display(){
			System.out.println("area= " + " "+ area);
			System.out.println("radius=" + " "+ r);
			
			}
		}

class CircleDemo{
		public static void main(String args[]){
	
		Circle c=new Circle();
		c.init();
		c.calculateArea();
		c.display();
		}
	}
