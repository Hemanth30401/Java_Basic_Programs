package Array_Chapter1;
import java.util.Scanner;
public class Left_rotate_without_giving_rotate_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		int x;
		int[] a = new int[7];
		for(x=0;x<a.length;x++) {
			a[x] = r.nextInt();
		}
		System.out.print("Generated are: ");
		Left_wr l= new Left_wr();
		l.isRo_wr(a);
	}

}
class Left_wr{
	public void isRo_wr(int[] a){
		int x,temp,m=1;
		for(int t : a) {
			System.out.print(t + " ");
		}
		for(int y=1;y<=m;y++) {
			temp=a[0];
			for(x=0;x<a.length-1;x++) {
				a[x]=a[x+1];
			}
		//x=a.length-1
			a[x]=temp;
			//temp=a[0];
			System.out.println("\n");
			System.out.println("Left rotated by "+ m + " is: ");
			
			
			for(int h:a)
				System.out.print(h + " ");
			m++;
			if(m==a.length)
				break;
		}
		
		
	}
}