package string_assessment;
import java.util.Scanner;
public class Palin_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		String[] a = s.split(" ");
		for(int x=0;x<a.length;x++){
			StringBuilder sb = new StringBuilder(a[x]);
			sb.reverse();
			if(sb.toString().equals(a[x]))
				System.out.print(a[x] + " ");
		}
	}
}
