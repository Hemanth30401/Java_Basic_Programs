package javahub;

import java.util.Scanner;

public class Patterns_for_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,i=0,y=152,a=0,b=0,count=0,c=0,sum=0;
		System.out.println("Enter no of rows and columns: ");
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
		for(x=1;x<=r;x++) {
			for(i=1;i<=x;i++) {
				y=++y;
				for(;y>0;y++) {
					count=0;
					for(a=y;a>0;a/=10) {
						count++;
					}
					sum=0;
					for(b=y;b>0;b/=10) {
						c=b%10;
						sum=sum+(int)Math.pow(c, count);
					}
					if(sum==y)
					{
						System.out.print(y + " ");
						break;
					}
				}
				
			}
			System.out.println();
		}
	}

}
