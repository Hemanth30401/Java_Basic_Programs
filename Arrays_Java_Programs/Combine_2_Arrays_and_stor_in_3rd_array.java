package Array_Chapter1;

public class Combine_2_Arrays_and_stor_in_3rd_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comb d = new Comb();
		d.isArr();
	}

}
class Comb{
	public void isArr() {
		int[] a = new int[] {1,4,9,11};
		int[] b = new int[] {13,14,15,16};
		int[] c = new int[a.length+b.length];
		
		int x,s,t=0;
		for(x=0;x<a.length;x++) {
			c[t++] = a[x];
		}
		for(s=0;s<b.length;s++) {
			c[t++]=b[s];
		}
		for(t=0;t<c.length;t++) {
			System.out.print(c[t] + " ");
		}
		
	}
}