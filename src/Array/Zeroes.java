package Array;

public class Zeroes {
	
	public static void main(String[] args) {
		
		
        int arr[] = {1,0};
        int countZeros = countZeros(arr);
        System.out.println(countZeros);
		
	}
	
	public static int countZeros(int arr[])
	{
		int low=0,high=arr.length;
		int mid=0;
		while(low<=high)
		{
			 mid=(low+high)/2;
			
			if(arr[mid]==0 && arr[mid-1]==1)
			{
				//arr[mid] ==0 and first one
				return (arr.length-mid);
			}
			else if(arr[mid]==1)
			{
				//arr[mid]==1
				low=mid+1;
			}
			else
			{
				//arr[mid]==0 but not first
				high=mid-1;
			}
		}
		return (arr.length-mid);
	}

}
