package Array_Chapter1;

public class Comb_a_b_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comb1 c = new Comb1();
		c.isArr();
	}

}
class Comb1{
	public void isArr() {
		int[] a = new int[] {1,4,9,11,17};
		int[] b = new int[] {13,14,15,16};
		int[] d = new int[a.length+b.length];
		
		int x,t=0,i=0;
		for(x=0;x<d.length;x++) {
			if(x<a.length) {
				d[i++]=a[x];
			}
			if(x<b.length) {
				d[i++]=b[x];
			}
		}
		for(t=0;t<d.length;t++) {
			System.out.print(d[t] + " ");
		}
	}
}