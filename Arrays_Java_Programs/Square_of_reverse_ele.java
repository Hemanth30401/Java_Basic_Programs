package Array_Chapter1;

public class Square_of_reverse_ele {
	public static void main(String[] args) {
		Square s = new Square();
		s.sqArr();
	}
}
class Square{
	public void sqArr() {
		int[] m = new int[] {1,3,5,7};
		int[] n = new int[m.length];
		int t=0,x;
		for(x=m.length-1;x>=0;x--) {
			n[t]=m[x]*m[x];
			t++;
		}
		for(t=0;t<n.length;t++) {
			System.out.print(n[t] + " ");
		}
	}
}