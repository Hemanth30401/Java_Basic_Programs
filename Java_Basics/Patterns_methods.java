package javahub;
import java.util.Scanner;

public class Patterns_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter rows: ");
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt(),x=0;
		for(x=1;x<=s;x++) {
			new Pat().calPat(x);
			System.out.println();
		}
	}

}
class Pat{
	public void calPat(int x) {
		int y=1;
		for(;y<=x;y++) {
			System.out.print("*" + " ");
		}
	}
}
