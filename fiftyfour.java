package ass7;

import java.util.*;

class fiftyfour
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to reverse it");
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
