package Genral;
 class Engine
{
	int speed;
	public Engine(int speed) {
		this.speed=speed;
		// TODO Auto-generated constructor stub
	}
}

public final class ImmutableClass {
	
	private final int id;
	private final String name;
	private final Engine engine;
	

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	//deep copy
	public ImmutableClass(int id,String name,Engine e)
	{
		this.id=id;
		this.name = name;
		Engine newEngine=new Engine(e.speed);
		this.engine =newEngine;
	}
	
	public static void main(String[] args) {
		
		Engine e=new Engine(50);
		
		ImmutableClass im=new ImmutableClass(10,"Abc",e);
		System.out.println(im.name=="Abc");
		System.out.println(im.engine.speed);
		e.speed=70;
		System.out.println(im.engine.speed);
		
	}
	
	

}
