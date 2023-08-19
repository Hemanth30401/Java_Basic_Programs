package javahub;
import java.util.Scanner;
public class Patterns_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows and columns");
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt(),c=sc.nextInt();
		int x=0,s=0,y=0,a=0,b=0,d=0;
		
		for(a=1;a<=r;a++) {
			for(b=r-1;b>=a;b--) {
				System.out.print(" ");
			}
			for(d=1;d<=a;d++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(x=2;x<=r;x++){
			for(s=1;s<x;s++) {
				System.out.print(" ");
			}
			for(y=r;y>=x;y--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
