package Array_Chapter1;
import java.util.Scanner;
public class Palindrome_ele_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int[] a = new int[5];
		 int x;
		 System.out.print("Elements are:");
		 for(x=0;x<a.length;x++) {
			 a[x]=sc.nextInt();
		 }
		 
		 Palin p = new Palin();
		 System.out.println();
		 System.out.print("Palindrome are: ");
		 p.isPalin(a,x);
	}

}
class Palin{
	public void isPalin(int[] a,int x) {
		int y,rev=0;
		for(x=0;x<a.length;x++) {
			rev=0;
			for(y=a[x];y>0;y/=10) {
				rev=rev*10+(y%10);
			}
			if(rev==a[x]) {
				System.out.print(a[x] + " ");
			}
		}
	}
}