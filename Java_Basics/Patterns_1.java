package javahub;
import java.util.Scanner;
public class Patterns_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows and columns: ");
		Scanner s = new Scanner(System.in);
		int r=s.nextInt();
		for(int x=1;x<=r;x++) {
			for(int y=x;y>0;y--) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
