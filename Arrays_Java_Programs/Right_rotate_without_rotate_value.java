package Array_Chapter1;

public class Right_rotate_without_rotate_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Right1 r = new Right1();
		r.wt_rot();
	}

}
class Right1{
	public void wt_rot() {
		int[] a = new int[] {1,2,3,4,5};
		int x,m=1;
		for(int y=1;y<=m;y++) {
			int temp=a[a.length-1];
			for(x=a.length-1;x>0;x--) {
				a[x]=a[x-1];
			}
			a[0]=temp;
			for(x=0;x<a.length;x++) {
				System.out.print(a[x] + " ");
				
			}
			System.out.println();
			m++;
			if(m==a.length) {
				break;
			}
		}
	}
}