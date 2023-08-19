package javahub;

import java.util.Scanner;

public class Digits_to_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rev=0,digit1=0,digit2=0,x=0;
		System.out.println("Enter any number: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		while(n!=0) {
			rev=rev*10+n%10;
			n/=10;
			digit1++;
		}
		for(;rev>0;rev/=10) {
			digit2++;
			x=rev%10;
			switch(x) {
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9:
					System.out.println("Nine"); 
					break;
				default:
					System.out.println("Zero");
			}
		}
		digit1 = digit1-digit2;
		for(x=1;x<=digit1;x++) {
			System.out.println("Zero");
		}
	}

}
