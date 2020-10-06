import java.util.Scanner;
class MathOpe
{
	int res=0;
	 int add(int x,int y)
	{
	 res=x+y;
	}
}
class MathOpeDemo
{
public static void main(String[] arg)
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	MathOpe c=new MathOpe(a,b);
	System.out.println("Addition of two numbers is : "+c.res);
}
}