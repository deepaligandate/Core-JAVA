class SumOfEvenOdd{
    public static void main(String args[]){
        int Evensum=0,Oddsum=0;
      
        int arr[]=new int [] {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                Evensum=Evensum+arr[i];
            }
            else
            {
                Oddsum=Oddsum+arr[i];
            }
        }
        System.out.println(Evensum);
        System.out.println(Oddsum);
        
    }
}