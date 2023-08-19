package javahub;

import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter input:");
		Scanner s = new Scanner(System.in);
		int n= s.nextInt(),sum=0,x=0,p=0;
		while(n!=0) {
			int rem = n%10;//2,8,6,6
			sum=sum*10+rem;//2,28,286,2866
			n/=10;//668,66,6
		}
		System.out.println(sum);
		for(;sum>0;sum/=10) {
			x=sum%10;
			if(x%2==0)
				x=x+2;
			else {
				x++;}
			System.out.print(x);//6682
		}
		
	}
}
