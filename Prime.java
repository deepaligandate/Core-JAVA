class Prime{
	public static void main(String args[]){
	int no=7;
	boolean flag=true;
	for(int i=2;i<no;i++)
	{
		if(no%i==0)
		{
			System.out.println("Not a prime no");
			flag=false;
			break;
		}
	}
		if(flag)
		{
		System.out.println("Prime no");
		}
	}
}