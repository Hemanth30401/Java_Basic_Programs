package javahub;

public class Highest_factor_prime_m3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=17549;
		Num1 n1 = new Num1();
		int r=n1.calLarg(num);
		n1.isfactor(r);
	}

}
class Num1{
	public int calLarg(int n) {
		int y,j=0;
		for(;n>0;n/=10) {
			y=n%10;
			if(y>j){
				j=y;
			}
		}
		return j;
	}
	public void isfactor(int j) {
		int l=0,m=0,count=0;
		for(int i=1;i<=j;i++) {
			if(j%i==0) {
				count=0;
				for(l=2;l<=i/2;l++) 
				{
					if(i%l==0) {
						count++;
						break;
					}
				}
				if(count==0) {
					if(i>m) 
						m=i;
				}
			}
		}
		System.out.println(m);
	}
}