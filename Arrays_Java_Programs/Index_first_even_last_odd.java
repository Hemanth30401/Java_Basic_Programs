package Array_Chapter1;

public class Index_first_even_last_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ind d = new Ind();
		d.calEle();
	}

}
class Ind{
	public void calEle() {
		
		int[] a = new int[] {1,2,3,4,5,6,7,8};
		int[] b = new int[a.length];
		int x,s=0;
		for(x=0;x<a.length;x++) {
			if(x%2==0) {
				b[s++]=a[x];
			}
		}
		for(x=0;x<a.length;x++) {
			if(x%2!=0) {
				b[s++]=a[x];
				
			}
		}
		for(s=0;s<b.length;s++) {
			System.out.print(b[s] + " ");
		}
	}
}