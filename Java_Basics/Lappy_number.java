package javahub;

public class Lappy_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=192,t1=0,x=0,p=0,sum=0,y=0,count=0,factor=0;
		for(x=1;x<=3;x++) {
			p=n*x;
			sum=sum*1000+p;
		}
		System.out.println(sum);
		t1=sum;
		for(;sum>0;sum/=10) {
			factor++;
		}
		for(int i=1;i<=9;i++) {
			count=0;sum=t1;
			for(;sum>0;sum/=10) {
				y=sum%10;
				if(y==i) {
					count++;//1
				}
			}
			if(count==2) {
				break;
			}
		}
		if(count==1 && factor==9) {
			System.out.println(n + " is lappy number");
		}
		else
			System.out.println(n + " is not lappy number");
		
	}
}
