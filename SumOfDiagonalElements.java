  
import java.util.Scanner;
class SumOfDiagonalElements{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows");
        int r=s.nextInt();
        int arr[][]=new int[r][];
        for(int i=0;i<arr.length;i++){
            int count=0;
            System.out.println("Enter number of cols");
            int c=s.nextInt();
            arr[i]=new int[c];
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("Array");
        for(int ar[]:arr){
            for(int a:ar){
                System.out.print(a);
            }
            System.out.println("");
        }
        System.out.println("Sum of diagonal elements");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<=i;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);
    }
}