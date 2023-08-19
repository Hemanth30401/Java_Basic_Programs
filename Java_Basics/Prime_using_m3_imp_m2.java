package javahub;

public class Prime_using_m3_imp_m2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		Prime11 p = new Prime11();
		int r=p.countP(num);
		p.isPrime(r, num);
	}

}
class Prime11{
	public int countP(int n) {
		int x,count=0;
		for(x=2;x<=n/2;x++) {
			if(n%x==0) {
				count++;
				break;
			}
		}
		return count;
	}
	public void isPrime(int sum,int n) {
		if(sum==0)
			System.out.println(n + " is prime");
		else
			System.out.println(n + " is not a prime");
	}
}