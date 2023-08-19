package strings_practice;

import java.util.Scanner;

public class VowelsAfterConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String s1=sc.nextLine();
		String s=new String(s1);
		String s2="";
		int x;
		for(x=0;x<s.length();x++) {
			if(s.charAt(x)=='A' || s.charAt(x)=='E' || s.charAt(x)=='I'|| s.charAt(x)=='O' || s.charAt(x)=='U' || s.charAt(x)=='a' || s.charAt(x)=='e' || s.charAt(x)=='i' || s.charAt(x)=='o' || s.charAt(x)=='u') {
				s2=s2+s.charAt(x);
			}
		}
		for(x=0;x<s.length();x++) {
			if(s.charAt(x)!='A' && s.charAt(x)!='E' && s.charAt(x)!='I'&& s.charAt(x)!='O' && s.charAt(x)!='U' && s.charAt(x)!='a' && s.charAt(x)!='e' && s.charAt(x)!='i' && s.charAt(x)!='o' && s.charAt(x)!='u' ) {
				s2=s2+s.charAt(x);
			}
		}
		System.out.println(s2);
	}

}
