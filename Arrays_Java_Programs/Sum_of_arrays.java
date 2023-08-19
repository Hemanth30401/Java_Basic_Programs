package Array_Chapter1;
import java.util.Scanner;
public class Sum_of_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S s1 = new S();
		s1.m1S();
	}

}
class S{
	public void m1S() {
		int[] s = new int[4];
		System.out.println("Enter array values");
		Scanner sc = new Scanner(System.in);
		int x,sum=0;
		for(x=0;x<s.length;x++) {
			s[x]=sc.nextInt();
		}
		for(x=0;x<s.length;x++) {
			sum=sum+s[x];
			
		}
		System.out.println(sum);
		
	}
}
