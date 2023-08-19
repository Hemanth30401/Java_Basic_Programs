package javahub;

import java.util.Scanner;
public class first_10_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,count=0,temp=0,y=0,sum=0,c=0;
		System.out.println("Enter range:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for(int n=1;n<=1000;n++) {
			count=0;sum=0;
			for(x=n;x>0;x/=10) {
				count++;
			}
			temp=n;
			for(;temp>0;temp/=10) {
				y=temp%10;
				sum=sum+(int)Math.pow(y, count);
			}
			if(sum==n) {
				System.out.println(n);
				c++;
				if(c==a) {
					break;
				}
			}
		}
	}

}
