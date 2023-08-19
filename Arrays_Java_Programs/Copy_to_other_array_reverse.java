package Array_Chapter1;

import java.util.Random;

public class Copy_to_other_array_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rand1 r1 = new Rand1();
		r1.isCopy();
		 
	}

}
class Rand1{
	public void isCopy() {
		Random r = new Random();
		int[] a = new int[7];
		int[] b = new int[a.length];
		int x,s=0;
		for(x=0;x<a.length;x++) {
			a[x]=r.nextInt(50);
		}
		System.out.println("Elements are: ");
		for(x=0;x<a.length;x++) {
			System.out.print(a[x] + " ");
		}
		System.out.println();
		for(x=a.length-1;x>=((a.length-1)/2);x--) {
			b[s] = a[x];
			s++;
		}
		for(x=((a.length-1)/2)-1;x>=0;x--) {
			b[s] = a[x];
			s++;
		}
		System.out.println();
		System.out.println("Array b: First part ");
		for(s=0;s<=(b.length-1)/2;s++) {
			System.out.print(b[s] + " ");
		}
		System.out.println();
		System.out.println("Array b: Last part ");
		for(s=((b.length-1)/2)+1;s<=b.length-1;s++) {
			System.out.print(b[s] + " ");
		}
	}
}