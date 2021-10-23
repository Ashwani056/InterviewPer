package MultiThreading;

public class AllInOneExmp {

	public static void main(String[] args) throws InterruptedException {

		ThreadB b = new ThreadB();
		b.start();
	
		synchronized (b) {
			System.out.println("main Thread calling wait() method");// step-1
			b.wait();
			System.out.println("main Thread got notification call");// step-4
			System.out.println(b.total);
		}
		B b1=new B(b);
		b1.m1();

	
	}
}
class B
{
	ThreadB b;
	B(ThreadB b)
	{
		this.b=b;
	}
	public void m1() throws InterruptedException
	{
		
		synchronized(b)
		{
			System.out.println("calling wait....");
			b.wait();
			System.out.println("m1 method got notification...");
			System.out.println("child thread"+b.total);
		}
		
	}
}

class ThreadB extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("child thread starts calcuation");// step-2
			for (int i = 0; i <= 5; i++) {
				total = total + i;
			}
			System.out.println("child thread giving notification call");// step-
			this.notify();
		}
	}
}
