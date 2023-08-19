package javahub;

import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows and columns: ");
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		/*for(int x=1;x<=r;x++)
		{
			for(int y=1;y<=x;y++) {
				if((x==1 && y==1) || (x==2 && y==2)) {
					System.out.print(" " + " ");
				}
				else if(y==1 || y==x) {
					System.out.print("*" + " ");}
				else {
						System.out.print("$" + " ");
				}
			}
			System.out.println(" ");					
		}*/
		
		for(int x=1;x<=r;x++) {
			for(int y=1;y<=x;y++) {
				if(x==1 || y==1 ) {
					System.out.print("*" + " ");
				}
				else {
					for(int z=1;z<x;z++)
						System.out.print("$" + " ");
					System.out.print("*" + " ");
					break;
				}
			}
			System.out.println();
		}
/*
		for(int i=1;i<=r;i++) {
			for(int s=r;s>i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
					System.out.print("*");
			}
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a = 2;a<=r;a++) {
			for(int s1=1;s1<a;s1++)
			{
				System.out.print(" ");
			}
			for(int j1=r;j1>=a;j1--) {
				
				System.out.print("*");
			}
			for(int k1=r;k1>a;k1--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	}

}
