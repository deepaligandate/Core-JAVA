class OneBHK{
	 int roomArea;
	 int hallArea;
	 int price;
	
	OneBHK()
	{
		int roomArea=45;
		int hallArea=23;
		price=2000;

	}

	OneBHK(int roomArea,int hallArea,int price)
	{
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}

	void show()
	{
		System.out.println(roomArea+ "  "+ hallArea+" "+price);
	}
}

	class TwoBHK extends OneBHK{
		int room2Area;
		
	TwoBHk()
	{
		int roomArea;
		int hallArea;
		int price;
		int room2Area;
	}

		
	TwoBHK(int roomArea,int hallArea,int price,int room2Area)
	{
		super();
		
		this.room2Area=room2Area;


	}

	 void show()
	{
		super.show();
		System.out.println(roomArea+ "  "+ hallArea+" "+price);
		
	}

}

	class Demo
	{
		public static void main(String args[]){
		TwoBHK t=new TwoBHK();
		t.show();
	}
}
	

	



	
		