package javahub;

import java.util.Scanner;

public class Patterns_Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows and columns");
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt(),num=1;
		for(int x=0;x<r;x++){
			for(int s=r-1;s>x;s--){
				System.out.print(" ");
			}
			for(int y=0;y<=x;y++){
				if(y==0 || x==0)
					num=1;
				else{
					num=num*(x-y+1)/y;}
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
