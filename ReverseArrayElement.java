  
import java.util.Scanner;
class ReverseArrayElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int b:arr)
        {
            //System.out.println();
        }
        System.out.println();
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+",");
        }

    }
}