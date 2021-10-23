package String;

public class SumOfInt {
	
	public static void main(String[] args) {
		String s1="199";
		String s2="1";
		
		
		int intFromString1 = getIntFromString(s1);
		System.out.println(intFromString1);
		int intFromString2 = getIntFromString(s2);
		System.out.println(intFromString2);
		System.out.println(intFromString1+intFromString2);
		
	}
	
	public static int getIntFromString(String s)
	{
		int number=0;
		for(int i=0;i<s.length();i++)
		{
			number=number*10 + ((int)s.charAt(i) - 48); 
		}
		return number;
	}
	

}
