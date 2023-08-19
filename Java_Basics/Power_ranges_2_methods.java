package javahub;

public class Power_ranges_2_methods {
	public static void main(String[] args) {
		
		Power1 p = new Power1();
		int x=2;
		p.calPower(x);
		
		}
}
class Power1{
	
	public void calPower(int x) {
		long y=0l,p=1;
		while(p<=100) {
			y=(long)Math.pow(x, p);
			System.out.println(y);
			p++;
		
		}
		
	}
}