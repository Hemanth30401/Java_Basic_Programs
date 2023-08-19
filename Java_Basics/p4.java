package javahub;

import java.util.Scanner;

public class p4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n:");
		Scanner aj = new Scanner(System.in);
		int n = aj.nextInt(),x=0,y=0,z=0,q=0;
		for(;n>0;n/=10) {
			x=n%10;
			if(x>y) {
				q=z;
				z=y;
				y=x;
			}
			else if(x>=z) {
				q=z;
				z=x;
			}
			else if(x>=q) {
				q=x;
			}
			
		}
		System.out.println(q);
	}
}
