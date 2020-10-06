package ass7;
import java.util.Scanner;

public class fiftyeight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s[]= {"sun","mon","tue","wed","thurs","fri","sat"};
		try {
			System.out.println("Enter day");
			int i=sc.nextInt();
			if(i>=0 && i<7) {
				System.out.println("Day is "+s[i]);
			}
			else {
				throw new ArrayIndexOutOfBoundsException();
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		};

	}

}
