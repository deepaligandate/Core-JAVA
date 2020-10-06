import java.util.Scanner;
class Circle{
		public static void main(String args[]){
		int r;
		double pi=3.14,area,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		r=sc.nextInt();
		area=pi*r*r;
		System.out.println("Area=" +area);
		c=2*pi*r;
		System.out.println("Circumference=" +c);
	}
}
