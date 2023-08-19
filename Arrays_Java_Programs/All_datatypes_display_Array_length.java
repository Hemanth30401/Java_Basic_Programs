package Array_Chapter1;
import java.util.Scanner;
public class All_datatypes_display_Array_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array a = new Array();
		a.isDt();
	}

}
class Array{
	public void isDt() {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[6];
		char[] c = new char[4];
		String[] s = new String[6];
		boolean[] b = new boolean[6];
		int x;
		for(x=0;x<a.length;x++) {
			a[x]=sc.nextInt();
		}
		for(x=0;x<c.length;x++) {
			c[x]=sc.next().charAt(0);}
		for(x=0;x<s.length;x++) {
			s[x]=sc.next();}
		for(x=0;x<b.length;x++) {
			b[x]=sc.nextBoolean();}
		System.out.println("Generated are: ");
		for(x=0;x<a.length;x++) {
			System.out.print(a[x]+ " ");
			
		}
		System.out.println("Length is: " + a.length);
		for(x=0;x<c.length;x++) {
			System.out.print(c[x]+ " ");
			
		}
		System.out.println("Length is: " + c.length);
		for(x=0;x<s.length;x++) {
			System.out.print(s[x]+ " ");
			
		}
		System.out.println("Length is: " + s.length);
		for(x=0;x<b.length;x++) {
			System.out.print(b[x]+ " ");
			
		}
		System.out.println("Length is: " + b.length);
	}
}