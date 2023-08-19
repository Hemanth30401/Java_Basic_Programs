package Array_Chapter1;
import java.util.Random;
public class Copy_of_Array_first_part_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[7];
		int b[]=new int[a.length];
		Random r = new Random();
	
		int x=0,s=0;
		for(x=0;x<a.length;x++) {
			a[x]=r.nextInt(100);
		}
		Rand2 r2 = new Rand2();
		r2.isFirst(a,b,x,s);
		
	}

}
class Rand2{
	public void isFirst(int[] a, int[] b,int x,int s) {
		s=0;
		
		System.out.println("Generated are: ");
		for(x=0;x<a.length;x++) {
			System.out.print(a[x]+" ");
		}
		for(x=(a.length-1)/2;x>=0;x--) {
			b[s]=a[x];
			s++;
		}
		for(x=((a.length-1)/2)+1;x<=a.length-1;x++) {
			b[s]=a[x];
			s++;
		}
		System.out.println();
		for(s=0;s<b.length;s++) {
			System.out.print(b[s] + " ");
		}
	}
}