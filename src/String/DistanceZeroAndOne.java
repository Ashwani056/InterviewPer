package String;

public class DistanceZeroAndOne {
	
	public static void main(String[] args) {
		
		
		String S = "00111";
		getMaxSubString(S);
		
	}
	
	public static void getMaxSubString(String s)
	{
		int firstIndex=0;
		int index=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='0')
			{
				if(firstIndex==0)
				{
					firstIndex=i;
				}
				else
				{
					index=i;
				}
			}
			
			
		}
		int diff = getDiff(s,firstIndex,index);
		System.out.println(diff);
	}
	
	public static int getDiff(String s,int start,int end) {
		
		int zero=0;
		int ones=0;
		for(int i=start;i<=end;i++)
		{
			if(s.charAt(i)=='0')
			{
				zero++;
			}
			else
			{
				ones++;
			}
		}
		
		return zero-ones;
	}


}
