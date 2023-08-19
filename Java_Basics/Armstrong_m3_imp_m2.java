package javahub;

public class Armstrong_m3_imp_m2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong a = new Armstrong();
		int num=154;
		int res = a.calArm(num);
		a.isArm(res, num);
	}

}
class Armstrong{
	public int calArm(int n) {
		int x,sum=0,count=0,t1=n;
		for(;t1>0;t1/=10) {
			count++;
		}
		for(;n>0;n/=10) {
			x=n%10;
			sum=sum+(int)Math.pow(x,count);
		}
		return sum;
	}
	public void isArm(int sum,int n) {
		if(sum==n) {
			System.out.println(n + " is a armstrong");
		}
		else
			System.out.println(n + " is not a armstrong");
	}
}