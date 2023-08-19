package ArrayChapter4;
import java.util.Scanner;
public class FindArrayType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int x,count=0,count1=0;
		int n=sc.nextInt();
		int []a=new int[n];
	
		System.out.println("Enter elements ");
		for(x=0;x<n;x++) {
			a[x]=sc.nextInt();
		}
		for(x=0;x<n;x++) {
			if(a[x]%2==0) {
				count++;
			}
			else
				count1++;
		}
		if(count==n) {
			System.out.println("Even");
		}
		
		else if(count1==n)
			System.out.println("Odd");
		else 
			System.out.println("Mixed");
	}

}
