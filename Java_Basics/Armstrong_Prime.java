package javahub;

public class Armstrong_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,n,z=1,factor=0,count=0,sum=0,y=0;
		System.out.println("Armstrong " + z);
		for(n=2;n<=153;n++) {
			factor=0;count=0;
			for(x=2;x<=n/2;x++) {
				if(n%x==0) {
					factor++;
					break;
				}
			}
			if(factor==0) {
				System.out.println("Prime " + n);
			}
			sum=0;
			for(int c=n;c>0;c/=10) {
				count++;
			}
			for(int r=n;r>0;r/=10)
			{
				y=r%10;
				sum=sum+(int)Math.pow(y, count);
			}
			if(sum==n) {
				System.out.println("Armstrong: " + n);
			}
				
		}
	}

}
