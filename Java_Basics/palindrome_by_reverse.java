package javahub;

import java.util.Scanner;
public class palindrome_by_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		System.out.println("Enter any number: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int temp=n;
		while(n!=0) {
			sum=sum*10+n%10;
			n/=10;
		}
		System.out.println(sum==temp?temp+" Palindrome":temp+" Not palindrome");
	}

}
