package javahub;

public class Ranges_Tech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=1,e=10000,x=0,count=0,sum=0,p=1,div=0,mod=0,t1=0;
		for(;s<=e;s++) {
			count=0;p=1;
			for(x=s;x>0;x/=10) {
				count++;
			}
			if(count%2==0) {
			count=count/2;
			for(;count>=1;count--) {
				p=p*10;
			}}
			t1=s;
			div=t1/p;
			mod=t1%p;
			sum=div+mod;
			sum=sum*sum;
			if(sum==t1)
				System.out.println(s);
		}
	}

}
