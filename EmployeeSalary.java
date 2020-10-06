import java.util.Scanner;
class EmployeeSalary{
		public static void main(String args[]){
		float bs,gs,da,hra;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary");
		bs=sc.nextFloat();
		
		if(bs<10000)
		{
			hra=bs*10/100;
			da=bs*90/100;
		}
		else
		{
			hra=2000;
			da=bs*98/100;
		}
		gs=bs+hra+da;

		System.out.println("HRA="+hra);
		System.out.println("DA="+da);	
		System.out.println("Gross Salary="+gs);
	}
}
		
		
		
		
		