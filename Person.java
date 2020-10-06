import java.util.Scanner;
class Person{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter gender m or f");
        String g=s.next();
        System.out.println("Enter age");
        int age=s.nextInt();
        if(((g=="f") && (age>=18)) || ((g=="m") && (age>=21)))
        {
            System.out.println("Eligible for marriage");
        }
        else 
        {
            System.out.println("Not eligible for marriage");
        }

    }
}