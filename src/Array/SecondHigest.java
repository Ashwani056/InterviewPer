package Array;

public class SecondHigest {
	
	public static void main(String[] args) {
		
		int[] a= {47498, 14526, 74562, 42681, 75283, 45796};
		int max=0,smax=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
				
			}
			else if(a[i]>smax && a[i]<max)
			{
				smax=a[i];
			}
		}
		System.out.println(max+" "+smax);
	}

}
