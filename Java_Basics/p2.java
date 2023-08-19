package javahub;

public class p2 {
	public static void main(String[] args) {
		int a = 1754,x=1;
		for(;a>0;a/=10) {
			x=a%10;
			if(x%2==0) {
				x=x+2;
			}
			else {
				x++;
				}
			System.out.print(x);
		}
		
		
	}
}
