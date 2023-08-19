package javahub;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0,b=1,c=0,x=1,n=10;
		while(x<=n) {
			c=a+b;
			a=b;
			b=c;
		x++;
		System.out.println(c);
		}
		
	}
}
