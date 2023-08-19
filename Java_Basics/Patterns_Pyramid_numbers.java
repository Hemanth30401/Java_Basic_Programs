package javahub;
import java.util.Scanner;
public class Patterns_Pyramid_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows and columns: ");
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
		int x,y;
		for(x=1;x<=r;x++)
		{	
			for(int sp=r-1;sp>=x;sp--) {
				System.out.print(" "+" ");
			}
			for(y=x;y>0;y--) {
				System.out.print(y + " ");
			}
			for(int i=2;i<=x;i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for(int q=r-1;q>=1;q--)
		{
			for(int s=q;s<r;s++) {
				System.out.print(" " + " ");
			}
			for(int z=q;z>=1;z--) {
				System.out.print(z+ " ");
			}
			for(int f=2;f<=q;f++) {
				System.out.print(f+" ");
			}
			System.out.println();
		}
	}

}
