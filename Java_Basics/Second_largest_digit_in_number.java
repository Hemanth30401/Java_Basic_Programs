package javahub;

public class Second_largest_digit_in_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12567534,a,c=0,m=0,j=0;
		for(;x>0;x/=10) {
			a=x%10;
			if(a>m) {
				c=m;
				m=a;
			}
			else if(a>=c) {
				j=c;
				c=a;
				
			}
			else if(a>=j) {
				j=a;
				System.out.println(j);
			}
		}
		
		
	}

}
