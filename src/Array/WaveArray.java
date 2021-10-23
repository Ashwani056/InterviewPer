package Array;

import java.util.Arrays;

public class WaveArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		System.out.println(arr.length);
		getWaveArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void getWaveArray(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length-1;i=i+2)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}


}
