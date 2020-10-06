import java.util.Scanner;
class Marks{
		public static void main(String args[]){
		int s1,s2,s3,s4,s5,sum;
		double percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of subject1");
		s1=sc.nextInt();
		System.out.println("Enter marks of subject2");
		s2=sc.nextInt();
		System.out.println("Enter marks of subject3");
		s3=sc.nextInt();
		System.out.println("Enter marks of subject4");
		s4=sc.nextInt();
		System.out.println("Enter marks of subject5");
		s5=sc.nextInt();
		sum=s1+s2+s3+s4+s5;
		percentage=(sum/500.0)*100;
		System.out.println("Sum of marks="+sum);
		System.out.println("Percentage="+percentage);
		}
	}
		

















