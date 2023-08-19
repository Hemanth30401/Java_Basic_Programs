package Array_Chapter1;
import java.util.Scanner;
public class Armstrong_ele_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] a = new int[5];
		int x;
		for(x=0;x<a.length;x++) {
			a[x]=s.nextInt();
		}
		Arms r = new Arms();
		System.out.println();
		System.out.println("Armstrong are: ");
		r.isArm(a,x);
	}

}
class Arms{
	public void isArm(int[] a,int x) {
		int y,count=0,n,rem=0,sum=0;
		for(x=0;x<a.length;x++) {
			count=0;
			for(y=a[x];y>0;y/=10) {
				count++;
			}
			sum=0;
			for(n=a[x];n>0;n/=10) {
				rem=n%10;
				sum=sum+(int)Math.pow(rem, count);
			}
			if(sum==a[x]) {
				System.out.print(a[x] + " ");
			}
		}
	}
}