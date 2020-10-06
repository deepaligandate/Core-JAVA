import java.util.Scanner;
class Temperature{
			public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter temperature in farenheit");
			float temp=sc.nextInt();
			temp=((temp-32)*5)/9;
			System.out.println("Temperature in Celcius=" +temp);
		}
	}
			