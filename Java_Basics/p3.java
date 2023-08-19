package javahub;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 238765,count=0,sum=0,prod=1,rem=0;
		for(;a>0;a/=10) {
			rem=a%10;
			count++;
			sum=sum+rem;
			prod=prod*rem;
		}
		
		System.out.println(count);
		if(count%2==0) {
			System.out.println("Count is even & sum of digits :" + sum);
		}
		else {
			System.out.println("Count is even & prod of digits :" + prod);
		}
	}

}
