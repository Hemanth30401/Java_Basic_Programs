package javahub;
import java.util.Scanner;
public class Patterns_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows and columns: ");
		Scanner s = new Scanner(System.in);
		int r=s.nextInt();
		for(int x=1;x<=r;x++) {
			for(int y=1;y<=x;y++) {
				if(x==1 || y==1) {
					System.out.print(y+" ");
				}
				else {
					for(int z=1;z<x;z++) {
						System.out.print(z+1 + " ");}
					for(int p=x-1;p>=1;p--) {
						System.out.print(p+" ");
					}
					break;
				}
			}
			System.out.println();
		}
	}

}
