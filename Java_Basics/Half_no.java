package javahub;

public class Half_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2025,count=0,x=0,sum=0,a=0,sum1=0,t1=n,t2=n,s=0,c=0;
		double p=0;
		while(n!=0) {
			n/=10;
			count++;
		}
		if(count%2==0) {//4
			while(x<count/2) {
				s=t1%10;
				sum=sum*10+s;//52
				t1/=10;//20
				x++;
			}
			while(sum!=0) {
				a = sum%10;
				sum1=sum1*10+a;
				sum/=10;
			}
			c=sum1+t1;//45
			p=Math.pow(c,2);
			if(t2==(int)p)
				System.out.println(t2 + " is a Half Number");
			else
				System.out.println(t2 + " is not a half number");
		}
		else 
			System.out.println("It supports only even digits");
	}

}
