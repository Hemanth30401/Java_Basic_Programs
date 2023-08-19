package ArrayChapter4;
import java.util.Random;
public class InsertElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[11];
		Random r= new Random();
		int x,index=5,ele=67;
		for(x=0;x<a.length-1;x++) {
			a[x]=r.nextInt(100);
		}
		System.out.print("Generated are: ");
		for(x=0;x<a.length-1;x++) {
			System.out.print(a[x] + " ");
		}
		System.out.println();
		for(x=a.length-1;x>index;x--) {
			a[x]=a[x-1];
		}
		a[x]=ele;
		for(int h:a)
			System.out.print(h + " ");
	}

}
