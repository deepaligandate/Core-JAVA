import java.util.Scanner;
class LeapYear {
   		public static void main(String args[]){
      		int year;
      		System.out.println("Enter an Year");
      		Scanner sc = new Scanner(System.in);
      		year = sc.nextInt();

      		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         	System.out.println("Leap year");
      		else
         	System.out.println("not a leap year");
   	}
}
