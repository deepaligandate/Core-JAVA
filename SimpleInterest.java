import java.util.Scanner;
class SimpleInterest{
			public static void main(String args[])
			{
				float p,r,t,s;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter principal amount");
				p=sc.nextFloat();
				System.out.println("Enter rate of interest");
				r=sc.nextFloat();
				System.out.println("Enter time");
				t=sc.nextFloat();
				s=(p*r*t)/100;
				System.out.println("Simple interest is=" +s);
			}
		}
			