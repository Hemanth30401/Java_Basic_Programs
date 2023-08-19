package javahub;

public class Highest_Prime_factor_of_largest_digit_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number r = new Number();
		int k=r.n=1659;
		r.highPrime();
		
	}

}
class Number{
	int n,i=0;
	public int largest() {
		int x=0;
		for(;n>0;n/=10) {
			x=n%10;
			if(x>i)
				i=x;
		}
		return i;
	}
	public void highPrime() {
		i=largest();
		int y=1,z=0,count=0,p=0;
		for(;y<=i;y++) 
		{
			
			if(i%y==0) {
				z=y;
			}
			count=0;
			for(int h=1;h<=z;h++) {
				if(z%h==0)
					count++;
			}
			if(count==2) {
					if(z>p) {
						p=z;
					}
			}
		}
		if(p!=0)
			System.out.println(p);
	}
}
