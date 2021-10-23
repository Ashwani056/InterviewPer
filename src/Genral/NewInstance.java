package Genral;

abstract class BC
{
	public void m1()
	{
		
	}
	abstract public void m2(); 



	
}


class NewInstance {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Object o =Class.forName(args[0]).newInstance();
		System.out.println(o.getClass().getName());
	}

}
