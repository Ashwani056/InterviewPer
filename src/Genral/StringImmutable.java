package Genral;

final public class StringImmutable {
	String s;
	private StringImmutable(String s) {
		this.s=s;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}
	
	public StringImmutable modify(String s)
	{
		if(this.s.equals(s))
		{
			return this;
		}
		return new StringImmutable(s);
	}
	
	public static void main(String[] args) {
		StringImmutable sm=new StringImmutable("Ass");
		System.out.println(sm.toString());
		 sm = sm.modify("aaaa");
		 System.out.println(sm.toString());
		
	}
	

}
