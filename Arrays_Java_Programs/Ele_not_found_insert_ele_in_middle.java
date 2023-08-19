package Array_Chapter1;
import java.util.Scanner;
public class Ele_not_found_insert_ele_in_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int x,flag1=5,count=0;
		System.out.println("Enter a array: ");
		for(x=0;x<a.length-1;x++) {
			a[x]=sc.nextInt();
		}
		for(x=0;x<a.length;x++) {
			if(a[x]==flag1) {
				count++;
				System.out.println("Element found at index: " + x);
			}
		}  
		if(count==0) {
			System.out.println("Element not found ");
			for(x=a.length-1;x>a.length/2;x--) {
				a[x]=a[x-1];
			}
			a[x]=flag1;
			for(int h:a) {
				System.out.print(h + " ");
			}
		}
		
	}

}
