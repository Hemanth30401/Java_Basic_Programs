package Array_Chapter1;

public class Prime_and_not_prime_summed_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ele e = new Ele();
		e.isPrime();
	}

}
class Ele{
	public void isPrime() {
		int[ ] a= new int[] {1,11,13,21,27,29};
		int x,y,count=0,sum=0,n;
		for(x=0;x<a.length;x++) {
			if(a[x]==1 || a[x] == 0) {
				System.out.print(a[x] + " ");
			}
			else {
				count=0;sum=0;
				for(y=2;y<=a[x];y++) {
					if(a[x]%y==0) {
						for(n=2;n<=y/2;n++) {
							if(y%n==0) {
								count++;
								break;
							}
						}
						if(count==0) {
							sum=sum+y;
			
						}
					}
				}
				System.out.print(sum + " ");
			}
			
			
		}

//			
//			
//		}
	}
}