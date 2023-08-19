package javahub;

public class Palprime_alteranate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		Palprime1 p = new Palprime1();
		p.calPalprime(num);
	}

}
class Palprime1{
	public void calPalprime(int n) {
		int t1=0,count=0,count1=0,i=0,rev=0;
		while(n<=1000) {
			count=0;rev=0;
			for(t1=2;t1<=n/2;t1++) {
				if(n%t1==0) {
					count++;
					break;
				}
			}
			for(i=n;i>0;i/=10) {
				rev=rev*10+i%10;
			}
			if(count==0 && rev==n) {
				count1++;
				if(count1%2!=0)
					System.out.println(n);
			}
			n++;
		}
	}
}
