package javahub;

public class Twisted_Prime_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tp p = new Tp();
		p.calPrime();
	}
}
class Tp{
	public void calPrime() {
		int n=13,t1=n,rev=0,factor=0,x=0,s=0,t=0,count=0;
		for(x=2;x<=n/2;x++) {
			if(n%x==0) {
				factor++;
				break;
			}
		}
		if(factor==0) {
			System.out.println(n + " Prime");
			for(;t1>0;t1/=10) {
				s=t1%10;
				rev=rev*10+s;
			}
			for(t=2;t<=rev/2;t++) {
				if(rev%t==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(rev + " Prime");
				System.out.println(n + " Twisted prime");
			}
			else {
				System.out.println(rev + " Not prime");
				System.out.println(n + " Not twisted prime");}
		}
		else {
			System.out.println(n + " Not prime");
		}
	}
}
