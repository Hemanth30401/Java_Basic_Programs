package javahub;

public class Using_Methods_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palind p = new Palind();
		p.calPalin();
		p.checkPalin();
	}

}
class Palind{
	int n=111,t1=n,rev=0;
	public void calPalin() {
		int y=0;
		for(;n>0;n/=10) {
			y=n%10;
			rev=rev*10+y;
		}
		System.out.println(rev);
	}
	public void checkPalin() {
		if(rev==t1) {
			System.out.println(t1 + " is a palindrome");
		}
		else {
			System.out.println(t1 + " is not a palindrome");
		}
	}
}
