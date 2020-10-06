
package ass7;

public class fiftysix
{
	public static void main(String[] args)
	{
		String str = "welcome to java";
		StringBuilder sb = new StringBuilder(str.length());
		String words[] = str.split("\\ "); 
		for (int i = 0; i < words.length; i++)
		{			
			sb.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
			
		}
		
		System.out.println(sb);
		
 
	}
 
}