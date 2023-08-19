package javahub;

public class Armstrong_ranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1,y,count=0,a=0,t1,sum=0;
		for(;x<=500;x++) {
			t1=x;
			count=0;
			for(y=x;y>0;y/=10) {
				count++;
			}
			sum=0;
			for(;t1>0;t1/=10) {
				a=t1%10;
				sum = sum+(int)Math.pow(a, count);
			}
			
			if(sum==x)
				System.out.println(x);
			
		}
		
	}

}
