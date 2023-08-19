package javahub;

public class Palindrome_using_method_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palin p = new Palin();
		int num=12212;
		int r = p.revPal(num);
		p.isPalin(r,num);
		
	}

}
class Palin{
	
	public int revPal(int n) {
		int x,rev=0;
		for(;n>0;n/=10) {
			x=n%10;
			rev=rev*10+x;
		}
		return rev;
	}
	public void isPalin(int sum,int n) {
		if(sum==n)
			System.out.println(n + " is a palindrome");
		else
			System.out.println(n + " is not a palindrome");
	}
}
