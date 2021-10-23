package Array;


public class CountOnes {
	
	public static void main(String[] args) {
		
		int[] arr= {1,0,1,0,1,1,0,0,1};
		
		System.out.println(CountOne(arr));
		
	}
	
	public static int CountOne(int arr[])
	{
		int c=0;
		int result = 0;
		for(int a:arr)
		{
			if(a==0)
			{
				c=0;
			}
			else
			{
				c++;
				result=Math.max(result,c);
				
			}
		}
		return result;
	}

}
