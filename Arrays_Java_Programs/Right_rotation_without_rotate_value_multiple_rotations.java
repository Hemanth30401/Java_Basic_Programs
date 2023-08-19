package Array_Chapter1;
import java.util.Random;
public class Right_rotation_without_rotate_value_multiple_rotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] a = new int[10];
		int x;
		for(x=0;x<a.length;x++) {
			a[x]=r.nextInt(100);
		}
		System.out.println("Generated are: ");
		for(int y:a) {
			System.out.print(y + " ");
		}
		System.out.println();
		Right11 k = new Right11();
		k.right_wt(a, x);
	}

}
class Right11{
	public void right_wt(int[] a,int x) {
		int temp,y,r=1;
		for(y=1;y<=r;y++) {
			temp=a[a.length-1];
			for(x=a.length-1;x>0;x--) {
				a[x]=a[x-1];
			}
			a[x]=temp;
			System.out.println("Right rotated of " + r + " is: ");
			for(int h: a) {
				System.out.print(h + " ");
			}
			System.out.println();
			r++;
			if(r==a.length) {
				break;
			}
		}
	}
}