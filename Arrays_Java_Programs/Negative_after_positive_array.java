package Array_Chapter1;

public class Negative_after_positive_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Neg n = new Neg();
		n.isNeg();
	}

}
class Neg{
	public void isNeg() {
		int[] a = new int[] {-1,5,-7,3,-99,5,-6};
		int[] b = new int[a.length];
		int x,m=0,s=0;
		for(x=0;x<a.length;x++) {
			if(a[x]<m) {
				b[s++]=a[x];
			}
		}
		for(x=0;x<a.length;x++) {
			if(a[x]>m) {
				b[s++]=a[x];
			}
		}
		for(s=0;s<b.length;s++) {
			System.out.print(b[s] + " ");
		}
	}
}