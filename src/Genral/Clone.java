package Genral;

public class Clone implements Cloneable{
	
	int i=10;
	int j=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Clone c1=new Clone();
		Clone c2=(Clone) c1.clone();
		
		c2.i=888;
		c2.j=999;
		System.out.println(c1.i+" "+c1.j);
		
		
	}

}
