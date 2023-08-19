package Array_Chapter1;

public class Max_Min_in_a_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arr a = new Arr();
		a.isMax();
	}

}
class Arr{
	public void isMax() {
		int[] a = new int[] {999,999999,6,555,99999999,99999999};
		int x,m=0,s=0;
		for(x=0;x<a.length;x++) {
			if(a[x]>m && a[x]!=m) {
				s=m;
				m=a[x];
			}
			else if(s<a[x]) {
				s=a[x];
			}
				
		}
		System.out.println("Second Highest element is: " + s);
		for(x=0;x<a.length;x++) {
			if(a[x]<m) {
				m=a[x];
			}
		}
		System.out.println("Smallest element is: " + m);
	}
}