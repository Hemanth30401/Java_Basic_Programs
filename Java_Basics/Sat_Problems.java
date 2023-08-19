package javahub;

import java.util.Scanner;
public class Sat_Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows and columns: ");
		Scanner s = new Scanner(System.in);
		int r=s.nextInt(),a=1,factor=0,k=0;
		for(int x=1;x<=r;x++) {
			for(int y=1;y<=x;y++) {
				factor=0;
				for(k=2;k<=y/2;k++) {
					if(y%k==0) {
						factor++;
						break;
					}
				}
				if(factor==0) {
					System.out.print(k + " ");
				}
			}
			System.out.println();
		}
	}

}
