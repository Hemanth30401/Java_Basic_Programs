package javahub;

public class Swap_using_m3_m2 {
	public static void main(String[] args) {
		int a=111,b=77;
		System.out.println("Before swapping: " + a +" "+  b);
		Swap s = new Swap();
		String r=s.calSwap(a,b);
		System.out.println("After swapping: " + r );
	}
}
class Swap{
	public String calSwap(int x,int y) {
		x=x+y;
		y=x-y;
		x=x-y;
		return x+" "+y;
	}
}
