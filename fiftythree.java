package ass7;

public class fiftythree {

	public static void main(String[] args) {
		int sum=0;
		String s[]= {"67","89","23","67","12","55","66"};
		
		for(String a : s) {
			System.out.println(a);
			sum=sum+Integer.parseInt(a);
		}
		System.out.println("Sum is "+sum);
	}

}
