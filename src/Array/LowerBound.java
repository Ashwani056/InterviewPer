package Array;

public class LowerBound {
	public static void main(String[] args) {
		
		int a[]= {1,2,2,2,2,3,3,3,9,9,11};
		lowerBound(a,11);
		
	}
	
	public static void lowerBound(int[] a,int data)
	{
		int low=0;
		int hi=a.length-1;
		int ans=-1;
		while(low!=hi)
		{
			
			int mid=(low+hi)/2;
			if(a[mid]>data)
			{
				hi=mid-1;
			}
			else if(a[mid]<data)
			{
				low=mid+1;
			}
			else if(a[mid]==data)
			{
				ans=mid;
				hi=mid-1;
			}
			
		}
		System.out.println(ans);
		
	}

}
