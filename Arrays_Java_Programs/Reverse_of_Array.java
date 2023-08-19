package Array_Chapter1;
import java.util.Scanner;
public class Reverse_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse1 r = new Reverse1();
		r.calRev();
	}

}
class Reverse1{
	public void calRev() {
		int[] a = new int[] {1,2,3,4};
		int[] b = new int[a.length];
		
		int x,r=0;
		for(x=a.length-1;x>=0;x--) {
			b[r]=a[x];//a[5]=b[0]=9,//a[4]=b[1]=7
			r++;
		}
		for( r=0;r<b.length;r++) {
			System.out.print(b[r] + " ");
		}
	}
}