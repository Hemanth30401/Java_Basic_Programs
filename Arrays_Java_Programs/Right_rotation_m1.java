package Array_Chapter1;

public class Right_rotation_m1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Right r = new Right();
		r.isRot();
	}

}
class Right{
	public void isRot() {
		int[] f = new int[] {1,2,3,4,5,6,7,8};
		int x,r=2;
		for(x=f.length-r;x<f.length;x++) {
			System.out.println(f[x]);
		}
		for(x=0;x<f.length-r;x++) {
			System.out.println(f[x]);
		}
	}
}