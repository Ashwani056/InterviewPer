package Genral;

//Approch1
class SingleTone
{
	private static SingleTone t=new SingleTone();
	private SingleTone()
	{
		
	}
	public static SingleTone getSingleTone()
	{
		return t;
	}
	
}
//Approch2
class SingleTone1
{
	private static SingleTone1 t=null;
	private SingleTone1()
	{
		
	}
	public static SingleTone1 getSingleTone()
	{
		if(t==null)
			return new SingleTone1();
		return t;
	}
	
}

public class SingleToneClass {
	
	public static void main(String[] args) {
		
		SingleTone.getSingleTone();
		System.out.println(SingleTone.getSingleTone());
		
	}

}
