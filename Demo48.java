import java.util.Scanner;

abstract class Processor{
     int data=5;
	
	 public  void showData()
{
	System.out.println(data);

}

	 public abstract void process();
		
	
}

public class Demo48 extends Processor{
	public void process() {
	
	int num;
	int fact=1;
	for(int i=1;i<=num;i++) {
			
		fact=fact*i;
		}
		
		System.out.println("fact is=" +fact);
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any no");
	num=sc.nextInt();
	Processor p=new Demo48();
	p.process();
	p.showData();
	

	

}
}
