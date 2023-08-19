package Array_Chapter1;

public class Swap_adjacent_ele_in_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap p = new Swap();
		p.isAdj();
	}

}
class Swap{
	public void isAdj() {
		int[] a = new int[] {1,23,4,5,7,9};
		int x,b,t;
		for(x=0;x<a.length;x+=2) {
			b=a[x];
			a[x]=a[x+1];
			a[x+1]=b;
		}
		for(t=0;t<a.length;t++) {
			System.out.print(a[t] + " ");
		}
	}
}