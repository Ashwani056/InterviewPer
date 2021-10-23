package Genral;

class A
{
	final  int i=10;
	final public void m1() {
		System.out.println("asas");
	}
}

class B extends A
{

	
	
}
public class FinalKeyword {
	
	public static void main(String[] args) {
		
		B b=new B();
		System.out.println(b.i);
		b.m1();
		byte bb=10;
		int i=232323;
		bb=(byte)i;
		System.out.println(bb);
		System.getProperty("sun.arch.data.model");
		
	}

}
