package javahub;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any input: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(),sum=0,t1=n,x=0;
		while(n>0) {
			x=n%10;
			sum=sum*10+x;
			n/=10;
		}
		System.out.println(sum);
	}

}
