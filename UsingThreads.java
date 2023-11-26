
public class UsingThreads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable s = new St();
		Thread t1 = new Thread(s);//new state
		//runnable state
		t1.start();
		t1.join();
		
		Thread t2 = new Thread(s);
		t2.setName("Hemanth");
		for(int y=1;y<=100;y++)
			System.out.println(t2.getName());
		
		Thread t3 = new Thread(s);
		t3.setName("Sai");
		for(int x=0;x<=100;x++) {
			System.out.println(t3.getName());
		}
		t2.start();
		t2.join();
		System.out.println("Bye");
	}

}
class St implements Runnable
{
	@Override
	
	public void run() {
		for(int x=1;x<=100;x++)
			System.out.println(x);
	}
	
}
