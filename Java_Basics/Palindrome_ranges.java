package javahub;

public class Palindrome_ranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,x,a=100,rem = 0,rev=0;
		for(;n<=a;n++) {
			rev=0;
			x=n;
			for(x=n;x>0;x/=10) {
				rem=x%10;
				rev=rev*10+rem;
			}
			x=n;
			if(x==rev)
				System.out.println(n);
		}
	}
}
		