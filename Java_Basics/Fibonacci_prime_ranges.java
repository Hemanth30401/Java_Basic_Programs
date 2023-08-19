package javahub;

public class Fibonacci_prime_ranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,factor=0,z1=1,z2=0,z=0;
		System.out.println("Fibonnaci : " + z );
		for(int n=2;n<=10;n++) {
			factor=0;
			for(x=2;x<=n/2;x++) {
				if(n%x==0) {
					factor++;
					break;
				}
			}
			if(factor==0) {
				System.out.println("Prime: "+ n);
				
				z2=z1+z;
				z=z1;
				z1=z2;
				System.out.println("Fibonnaci :" + z);
			}
				
		}
	}

}
