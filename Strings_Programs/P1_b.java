package string_assessment;
import java.util.Scanner; 
public class P1_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Enter the input"); 
		 String s = sc.nextLine(); 
		 String[] a = s.split(" ");
			for(int x=0;x<a.length;x++)
			{
				if(x%2==0){
					for(int y=a[x].length()-1;y>=0;y--){
						if(a[x].charAt(y)>='A' && a[x].charAt(y)<='Z')
						
							System.out.print((char)(a[x].charAt(y)+32));
						
						else if(a[x].charAt(y)>='a' && a[x].charAt(y)<='z')
							System.out.print((char)(a[x].charAt(y)-32));
						
					}
					System.out.print(" ");
				}
				else{
					for(int z=0;z<a[x].length();z++){
						if(a[x].charAt(z)>='A' && a[x].charAt(z)<='Z')
					
							System.out.print((char)(a[x].charAt(z)+32));
						
						else if(a[x].charAt(z)>='a' && a[x].charAt(z)<='z')
							System.out.print((char)(a[x].charAt(z)-32));
						
					}
					System.out.print(" ");
				}
			}
	}
}
