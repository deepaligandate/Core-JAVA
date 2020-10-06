import java.util.Scanner;
class LargestUsingTernary{
   			public static void main(String[] args) 
  			{
      			int num1, num2, num3, largest;
      			Scanner sc = new Scanner(System.in);
      			System.out.println("Enter first number: ");
      			num1 = sc.nextInt();
      			System.out.println("Enter second number: ");
      			num2 = sc.nextInt();
      			System.out.println("Enter third number: ");
     			num3 = sc.nextInt();
      			largest = num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);
      			System.out.println("Largest number is: " + largest);
   
   			}
		}
