package javahub;

public class Strong_ranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 145,x=0,fact=1,sum=0,sum1=0,count=0;
		for(;n<=200;n++) {
			sum=0;
			for(int y=n;y!=0;y/=10) 
			{
				fact=1;
				x=y%10;
				for(int z=x;z>0;z--) {
					fact = fact*z;
				}
				sum=sum+fact;
			}
			if(sum==n) {
				count++;
				System.out.println(n);
				sum1=sum1+sum;
				
			}
		}
		System.out.println("Strong : " + sum1);
		
	}
		
}
