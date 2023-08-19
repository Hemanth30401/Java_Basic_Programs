package javahub;

public class Armstrong_alternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		Arm1 a = new Arm1();
		a.calAr(num);
	}

}
class Arm1{
	public void calAr(int n) {
		int x,count=0,count1=0,t1=0,t2=0,sum=0;
		while(n<=407) {
			count=0;
			for(t1=n;t1>0;t1/=10) {
				count++;
			}
			sum=0;
			for(t2=n;t2>0;t2/=10) {
				x=t2%10;
				sum=sum+(int)Math.pow(x,count);
			}
			if(sum==n) {
				count1++;
				if(count1%2!=0) {
					System.out.println(n);
				}
			}
				
			n++;
		}
		
	}
}
