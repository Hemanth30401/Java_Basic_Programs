package javahub;

public class Palprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 11,n=0,sum=0,t1=x,count=0;
		for(;x>0;x/=10)
		{
			n=x%10;
			sum=sum*10+n;
		}
		for(int i=1;i<=t1;i++) {
			if(t1%i==0) {
				count++;
			}
		 }
		if(count==2 && sum==t1) {
			System.out.println(t1 + " is a palprime");
		}
		else {
			System.out.println(t1 + " is not a palprime");
		}
	}

}
