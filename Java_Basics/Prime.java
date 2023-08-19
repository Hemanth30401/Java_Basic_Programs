package javahub;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Enter yes or no: ");
			Scanner s = new Scanner(System.in);
			String a=s.nextLine();
			if(a.equals("yes")) {
				System.out.println("Enter number: ");
				Scanner sc=new Scanner(System.in);
				int x=sc.nextInt(),factor=0;
				for(int n=2;n<=x/2;n++) {
					if(x%n==0) {
						factor++;
						break;}
				}
				if(factor==0) {
					System.out.println("Prime");
				}
				else
					System.out.println("Not prime");
			}
			else {
				System.out.println("No");
				break;
			}
		}	
	}

}
