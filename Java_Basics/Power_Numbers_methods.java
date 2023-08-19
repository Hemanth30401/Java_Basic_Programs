package javahub;

public class Power_Numbers_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=1,e=100,x;
		for(x=s;x<=e;x++) {
			Power11 p = new Power11();
			p.callPow(x);
		}
	}

}
class Power11{
	
	public void callPow(int x) {
		int y=1,r=1;
		while(y<=2) {
			r=x*r;
			
			y++;
		}
		System.out.println(r);
	}
}
