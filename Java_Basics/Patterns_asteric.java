package javahub;

import java.util.Scanner;

public class Patterns_asteric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows and columns");
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int x=0,s=0,y=0,a=0,b=0,c=0;
		for(x=1;x<=r;x++) {
			for(s=r-1;s>=x;s--) {
				System.out.print(" ");
			}
			for(y=1;y<=x;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(a=2;a<=r;a++) {
			for(b=1;b<a;b++) {
				System.out.print(" ");
			}
			for(c=r;c>=a;c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
