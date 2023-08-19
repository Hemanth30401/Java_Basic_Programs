package javahub;

import java.util.Scanner;

public class Patterns_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows and columns");
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int x=0,s=0,y=0,a=0,b=0,c=0;
		for(x=1;x<=r;x++) {
			for(s=1;s<x;s++) {
				System.out.print(" ");
			}
			for(y=x;y<=r;y++) {
				System.out.print(y + " ");
				
			}
			System.out.println();
		}
		for(a=r-1;a>=1;a--) {
			for(s=a;s>1;s--) {
				System.out.print(" ");
			}
			for(c=a;c<=r;c++) {
				System.out.print(c + " ");
				
			}
			System.out.println();
		}
	}

}
