package javahub;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123,sum=0,x=0,prod=1,t1=n;;
		for(;n>0;n/=10) {
			x = n%10;
			sum += x;
			prod *= x;
		}
		if(sum==prod)
			System.out.println(t1 + " is a power number");
		else
			System.out.println(t1 + " is not a power number");

	}

}
