package Array_Chapter1;

public class Reverse_an_array_without_another_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r = new Reverse();
		r.isRev();
	}

}
class Reverse{
	public void isRev() {
		int[] a = new int[] {1,2,3,4,5};
		int x;
		int b=a.length-1;
		for(x=0;x<a.length/2;x++) {
				int temp=a[x];
				a[x]=a[b];
				a[b]=temp;
				b--;
		}
		for(x=0;x<a.length;x++) {
			System.out.print(a[x] + " ");
		}
	}
}