package javahub;

public class Using_Methods_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Arm a = new Arm();
			a.calArmstrong();
			a.checkArm();
	}
}
class Arm{
	int count=0,n=153,sum=0;
	public void calArmstrong() {
		int x=0,y=0,s=0;
		for(x=n;x>0;x/=10) {
			count++;
		}
		for(y=n;y>0;y/=10) {
			s=y%10;
			sum=sum+(int)Math.pow(s, count);
		}
		System.out.println(sum);
	}
	public void checkArm() {
		if(sum==n)
			System.out.println(n + " is a armstrong");
		else
			System.out.println(n + " is not a armstrong");
	}
}
