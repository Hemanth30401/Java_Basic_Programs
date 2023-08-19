package javahub;

public class Number_prime_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num q=new Num();
		q.n=123;
		q.callN();
		q.callN2();
	}

}
class Num{
	int n;
	public void callN() {
		int x,count=0;
		for(x=2;x<=n/2;x++) {
			if(n%x==0) {
			count++;
			break;}
		}
		if(count==0) {
			System.out.println(n + " is a prime");
		}
		else
			System.out.println(n + " is not a prime");
	}
	public void callN2() {
		int sum=0;
		int x=n%10;
		int y=n/10;
		sum=x*100+y;
		n=sum;
		callN();
		callN3();
	}
	public void callN3() {
		int x=n%10;
		int y=n/10;
		int sum=x*100+y;
		n=sum;
		callN();
	}
}
