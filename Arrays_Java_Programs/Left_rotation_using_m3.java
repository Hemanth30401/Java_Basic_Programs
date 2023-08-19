package Array_Chapter1;
import java.util.Random;
public class Left_rotation_using_m3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] n = new int[8];
		int x,m=5;
		for(x=0;x<n.length;x++) {
			n[x]=r.nextInt(10);
		}
		System.out.println("Generated are: ");
		for(x=0;x<n.length;x++) {
			System.out.print(n[x] + " ");;
		}
		System.out.println();
		Left_R s = new Left_R();
		System.out.println("Left Rotation by " + m + " is: ");
		s.isRot(n,x,m);
	}

}
class Left_R{
	public void isRot(int[] n,int x,int r) {
		
		for(x=r;x<n.length;x++) {
			System.out.print(n[x]+ " ");
		}
		for(x=0;x<=r-1;x++) {
			System.out.print(n[x]+" ");
		}
		
	}
}