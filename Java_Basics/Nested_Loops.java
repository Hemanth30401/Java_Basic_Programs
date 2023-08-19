package javahub;
import java.util.Scanner;
public class Nested_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=0;
		System.out.println("Enter no of rows and colums");
		Scanner s = new Scanner(System.in);
		int r= s.nextInt();
		
//		for(x=1;x<=r;x++)
//		{	
//			for(y=1;y<=x;y++)
//			{
//				System.out.print(a+2 + " ");
//				a+=2;
//				
//			}
//			System.out.println(" ");
//		}
		
		for(x=1;x<=r;x++) {
			for(y=1;y<=x;y++) {
				if(x%2==0) {
					System.out.print("#" + " ");}
				else{
					System.out.print("*" + " ");
				}
			}
			System.out.println(" ");
		}
		for(int z=r;z>0;z--) {
			for(int q=1;q<z;q++) {
				if(z%2==0) {
					System.out.print("*" + " ");}
				else{
					System.out.print("#" + " ");
				}
			}
			System.out.println(" ");
		}
		
	}

}
