package javahub;

public class Ranges_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,x=0,y=0,sum=0,prod=1;
		for(;n<=500;n++)
		{
			sum=0;prod=1;
			for(x=n;x>0;x/=10) {
				y=x%10;
				sum=sum+y;
				prod=prod*y;
			}
			if(prod==sum) {
				System.out.println("Power numbers: " + n);
			}
		}
	}

}
