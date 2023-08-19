package javahub;

public class for_loop {
	public static void main(String args[]) {
		int a = 236480,x=1;
		for(;a>0;a/=10) {
			x=a%10;
			if(x%2==0) {
				System.out.println(x + " even");
			}
			else
				System.out.println(x + " odd");
		}
	}

}
