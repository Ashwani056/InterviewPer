package Array;

import java.util.Arrays;
import java.util.HashSet;

public class FindSumPair {

	public static void main(String[] args) {

	//	findThePairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);
		findPair(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);

	}

	public static void findThePairs(int inputArray[], int inputNumber)
	    {
	        System.out.println("Input Array : "+Arrays.toString(inputArray));
	         
	        System.out.println("Input Number : "+inputNumber);
	         
	        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
	  
	        for (int i = 0; i < inputArray.length; i++)
	        {
	            for (int j = i+1; j < inputArray.length; j++)
	            {
	                if(inputArray[i]+inputArray[j] == inputNumber)
	                {
	                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
	                }
	            }
	        }
	    }
	
	public static void findPair(int[] arr,int sum)
	{
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i:arr)
		{
			int temp=sum-i;
			
				if(set.contains(i))
				{
					System.out.println(sum+" of element= "+temp+","+i);
				}
			
			set.add(i);
		}
	}

}
