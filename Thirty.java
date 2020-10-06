import java.util.Scanner;

class Thirty{
		public static void main(String[] args){

		int i,j,r,c,sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of rows");
		 r=sc.nextInt();

		System.out.println("Enter no of columns");
		 c=sc.nextInt();

		int arr[][]=new int[r][c];

		System.out.println("Enter elements");

		for( i=0;i<r;i++){
			
		
		for( j=0;j<c;j++){

			arr[i][j]=sc.nextInt();
			}
		}

			System.out.println("Elements of array are");
			for( i=0;i<r;i++){

			for( j=0;j<c;j++){

			System.out.print(arr[i][j]+" ");
}

			System.out.println();
		}

			for( i=0;i<r;i++){

			for( j=0;j<c;j++){
				if(i==j){
				sum=sum+arr[i][j];
				}
		
			}
		}

	System.out.println("Sum of diagonal elements="+sum);


}
}