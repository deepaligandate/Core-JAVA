class MathOperation{
	static void multiply(int i,int j)
	{
		int k=i*j;
		System.out.println(k);
	}

	static void multiply(float p,float q,float r)
	{
		float s=p*q*r;
		System.out.println(s);
	}

	static void multiply(double a,int b)
	{
		double d=a*b;
		System.out.println(d);
	}
}

class MathOperationDemo{
	public static void main(String args[]){
	MathOperation.multiply(45,25);
	MathOperation.multiply(12.5f,34.7f,23.2f);
	MathOperation.multiply(12,34);
	}
}
		