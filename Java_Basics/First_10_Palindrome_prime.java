package javahub;

import java.util.Scanner;
public class First_10_Palindrome_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,rev=0,t1=0,y=0,count=0,c1=0;
		System.out.println("Enter range: ");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		for(int n=2;n<=1000;n++)
		{
			count=0;rev=0;
			
			for(x=n;x>0;x/=10)
			{
				y=x%10;
				rev=rev*10+y;
			}
			t1=n;
			for(y=2;y<=t1/2;y++) {
				if(t1%y==0) {
					count++;
					break;
				}
			}
			if(count==0 && rev==t1) { 
				System.out.println(t1);
				c1++;
				if(c1==a) {
					break;
				}
			}
		}
	}
}
