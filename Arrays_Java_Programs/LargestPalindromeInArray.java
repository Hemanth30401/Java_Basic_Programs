package ArrayChapter4;
import java.util.Scanner;
public class LargestPalindromeInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array ");
		int size = sc.nextInt();
		int x,y,rev,max=0;
		int[] a = new int[size];
		System.out.println("Enter the elements of array ");
		for(x=0;x<size;x++) {
			a[x]=sc.nextInt();
		}
		for(x=0;x<size;x++) {
			rev=0;
			if(max<a[x]) {
				for(y=a[x];y>0;y/=10) {
					rev=rev*10+y%10;
				}
				if(rev==a[x]) {
					max=a[x];
				}
			}
		}
		System.out.println(max);
		
	}

}
