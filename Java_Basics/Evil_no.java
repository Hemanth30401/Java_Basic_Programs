package javahub;

public class Evil_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9,sum=0,s=0;
		s=n*n;
		if(s==(int)(s)) {
			while(s!=0) {
				sum=sum+s%10;
				s/=10;
			}
			System.out.println(sum);
		}
		if(sum==n) {
			System.out.println(n + " is a evil number");
		}
		else {
			System.out.println(n + " is not a evil number");
		}
	}

}
