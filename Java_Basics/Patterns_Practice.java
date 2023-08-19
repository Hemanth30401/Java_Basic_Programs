package javahub;
import java.util.Scanner;
public class Patterns_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter rows and columns: ");
		Scanner s = new Scanner(System.in);
		int r = s.nextInt(),c=s.nextInt();
		for(int x=r;x>0;x--)
		{
			for(int y=1;y<=x;y++) {
				System.out.print((char)(y+64) + " ");
			}
			System.out.println(" ");
		}
		for(int a=2;a<=r;a++)
		{
			for(int y1=1;y1<=a;y1++) {
				System.out.print((char)(y1+64) + " ");
			}
			System.out.println(" ");
		}
	}

}
