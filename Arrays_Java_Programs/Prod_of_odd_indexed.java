package Array_Chapter1;

public class Prod_of_odd_indexed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odd d = new Odd();
		d.calIndex();
	}

}
class Odd{
	public void calIndex() {
		int[] a = new int[] {1,2,3,4,7,9,10,2,3};
		int x,prod=1;
		for(x=0;x<a.length;x++) {
			if(x%2!=0) {
				prod*=a[x];
			}
		}
		System.out.println("Product of odd indexed elements: " + prod);
	}
}