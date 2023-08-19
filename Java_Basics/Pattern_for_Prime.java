package javahub;
import java.util.Scanner;
public class Pattern_for_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows and columns: ");
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
		int x=0,y=1,k=0,count=0;
		for(x=1;x<=r;x++) {
			for(int i=1;i<=x;i++) {
			k=++y;
				for(y=k;y>0;y++) {
					count=0;
					for(k=2;k<=y/2;k++) {
						if(y%k==0) {
							count++;
							break;
						}
					}
					if(count==0) {
						System.out.print(y + " ");
						break;
					}
				}
			}
			System.out.println();
		}
	}

}
