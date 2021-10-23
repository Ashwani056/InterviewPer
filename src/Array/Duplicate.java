package Array;

import java.util.HashMap;
import java.util.Iterator;

public class Duplicate {

	public static void main(String[] args) {
		String[] strArray = { "Java", "JSP", "Servlets", "Java", "Struts", "wewe", "JDBC" };

		int[] a= {10,20,10,2,3,4,20};
		//using for loop
		//findDuplicate(strArray);
		//findDuplicate(a);
		//findDuplicat("ashwani");
		
		int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
		findDuplicat("ashwani");
	
	}
	
	
	
	public static void findDuplicate(String[] strArray)
	{
		for(int i=0;i<strArray.length;i++)
		{
			for(int j=i+1;j<strArray.length;j++)
			{
				if(strArray[i].equals(strArray[j]))
					System.out.println("duplicate elements="+strArray[i]);
			}
		}
	
	}public static void findDuplicate(int[] strArray)
	{
		for(int i=0;i<strArray.length;i++)
		{
			for(int j=i+1;j<strArray.length;j++)
			{
				if(strArray[i]==strArray[j])
					System.out.println("duplicate elements="+strArray[i]);
			}
		}
	
	}
	
	public static void findDuplicat(String s)
	{
		char[] str=s.toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		for(char c:str)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		System.out.println(map);
		Iterator<Character> it=map.keySet().iterator();
		while(it.hasNext())
		{
			Character next = it.next();
			if(map.get(next)>1)
			{
				System.out.println(next);
			}
		}
	}
	
	//time complexity=O(n) space complexity O(1) { 1, 2, 3, 1, 3, 6, 6 };
	public static void findDuplicates(int[] a)
	{
		System.out.println("Repeating elements are....");
		
		for(int i=0;i<a.length;i++)
		{
			int j=Math.abs(a[i]);
			if(a[j]>0)
			{
				a[j]=-a[j];
			}
			else
			{
				System.out.println(j+" ");
			}
		}
	}

}
