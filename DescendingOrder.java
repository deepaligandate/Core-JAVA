import java.util.Scanner;
class DescendingOrder{
    public static void main(String args[]){
       int temp;
       Scanner s=new Scanner(System.in);
       int arr[]=new int[10];
       for(int i=0;i<arr.length;i++)
       {
           System.out.println("Enter element");
           arr[i]=s.nextInt();
       }
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]<arr[j])
               {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
               }
           }
       }
       System.out.println("Descending order");
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
   }
}