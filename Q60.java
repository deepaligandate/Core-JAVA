import java.util.*;

interface StudentFee {
	public void getFee();
}
class InvalidFeeException extends Exception{

	public InvalidFeeException() {
		super("Invalid Fee");
		
	}
	
}
class Student12 implements StudentFee{
	String name;
	int fee;
	
	@Override
	public void getFee(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = sc.nextLine();
		try {
			System.out.println("Enter fee : ");
			fee = sc.nextInt();
			if(fee < 0) {
				throw new InvalidFeeException();
			}
			
		}catch(InvalidFeeException | InputMismatchException e) {
			e.printStackTrace();
		}
		

	}
	
	public void show(){
		
		System.out.println(name+" "+fee);
	}
	
}
class ExpStud{
	public static void main(String[] args) {
	 
		Student12 s = new Student12();
		s.getFee();
		s.show();
	}
}
