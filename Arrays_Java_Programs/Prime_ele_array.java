package Array_Chapter1;
import java.util.Random;
public class Prime_ele_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] a = new int[8];
		int x;
		for(x=0;x<a.length;x++) {
			a[x]=r.nextInt(200);
		}
		System.out.println("Generated are: ");
		for(x=0;x<a.length;x++) {
			System.out.print(a[x] + " ");
		}
		Prime p = new Prime();
		System.out.println("\n");
		p.isPrime(a,x);
	}

}
class Prime{
	public void isPrime(int[] a,int x) {
		int y,count=0;
		for(x=0;x<a.length;x++) {
			count=0;
			for(y=1;y<=a[x];y++) {
				if(a[x]%y==0) {
					count++;
				}
			}
			if(count==2)
				System.out.print(a[x] + " ");
		}
	}
}
