import java.util.Scanner;
class ReverseNumber
{
   public static void main(String args[])
   {
      int num=0;
      int reversenum =0;
      System.out.println("Enter any number: ");
      
      Scanner sc = new Scanner(System.in);
      
      num = sc.nextInt();
      
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("Reverse number is: "+reversenum);
   }
}