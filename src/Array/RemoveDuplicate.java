package Array;

import java.util.Arrays;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;
         
        n = removeDuplicate(arr);
  
        // Print updated array
        for (int i=0; i<n; i++)
           System.out.print(arr[i]+" ");
	}

	//time:o(n)
	//space:o(n)
	private static int removeDuplicates(int[] arr) {
		
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
				temp[j++] =arr[i];
		}
		temp[j++]=arr[arr.length-1];
		
		for (int i=0; i<j; i++)
            arr[i] = temp[i];
		
		return j;
	}
	
	//time:o(n)
	//space:o(1)
	private static int removeDuplicate(int[] arr) {
		
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
				arr[j++] =arr[i];
		}
		arr[j++]=arr[arr.length-1];
		
		
		return j;
	}

}
