package strings_practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNotForTwoStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String ");
		String h = sc.next();
		System.out.println("Enter 2nd string ");
		String h1= sc.next();
		String s1 = new String(h).toUpperCase();
		String s2 = new String(h1).toUpperCase();
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		if(s1.length()==s2.length()) {
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.equals(a, b)) {
				System.out.println("Anagram");
			}
			else
				System.out.println("Not anagram");
		}
		else
			System.out.println("Not anagram");
	}
}
