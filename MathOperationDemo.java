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
	MathOperation.multiply(4,21);
	MathOperation.multiply(5.1f,3.7f,23.3f);
	MathOperation.multiply(8,3);
	}
}
		