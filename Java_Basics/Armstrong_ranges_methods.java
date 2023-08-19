package javahub;
import java.util.Scanner;
public class Armstrong_ranges_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter range: ");
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt(),e=sc.nextInt(),x=0;
		Arm11 a = new Arm11();
		for(x=s;x<=e;x++)
		{
			int r=a.countArm(x);
			int r1=a.calArm(r, x);
			a.checkArm(r1, x);
		}

	}

}
class Arm11{
	public int countArm(int x) {
		int y,count=0;
		y=x;count=0;
		for(;y>0;y/=10) {
			count++;
		}
		return count;
	}
	public int calArm(int count,int x) {
		int y,t=0,sum=0,z=0,r=0;
		y=x;
		for(;y>0;y/=10) {
			t=y%10;
			z=1;r=1;
			while(z<=count) {
				r=t*r;
				z++;
			}
			sum=sum+r;
		}
		return sum;
	}
	public void checkArm(int sum,int x) {
		if(sum==x)
			System.out.println(x);
	}
}