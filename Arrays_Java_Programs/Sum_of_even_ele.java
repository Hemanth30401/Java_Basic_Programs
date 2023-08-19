package Array_Chapter1;

public class Sum_of_even_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even e = new Even();
		e.calSum();
	}

}
class Even{
	public void calSum() {
		int[] a = new int[] {1,2,3,4,7,9,10,2,3};
		int x,sum=0;
		for(x=0;x<a.length;x++) {
			if(a[x]%2==0) {
				sum=sum+a[x];
			}
		}
		System.out.println(sum);
	}
}
