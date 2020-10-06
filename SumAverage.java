import java.util.Scanner;
class SumAverage{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[10];
		int len=arr.length;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the numbers");
			arr[i]=sc.nextInt();
		}
		
		for(int k:arr)
		{
			sum=sum+k;
		}
		System.out.println("sum="+sum);
		System.out.println("Average="+sum/len);
	}
}
		
