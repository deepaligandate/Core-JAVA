class FindGreatestSmallestNumber {
 
        public static void main(String args[]) {
                int numbers[] = new int[]{33,56,75,194,27,45,20,85,13,65};
                int smallest = numbers[0];
                int greatest = numbers[0];
               
                for(int i=1; i< numbers.length; i++)
                {
                        if(numbers[i] > greatest)
                                greatest = numbers[i];
                        else if (numbers[i] < smallest)
                                smallest = numbers[i];
                       
                }
               
                System.out.println("Greatest Number is : " + greatest);
                System.out.println("Smallest Number is : " + smallest);
        }
}