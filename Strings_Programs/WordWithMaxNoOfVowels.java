package string_assessment;

import java.util.Scanner;

public class WordWithMaxNoOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the input"); 
		String s = sc.nextLine();
		s=s.toUpperCase();
		String[] a = s.split(" ");
		String m="";
		int count=0,max=0;
		for(int x=0;x<a.length;x++){
			count=0;
			for(int y=0;y<a[x].length();y++){
				if(a[x].charAt(y)=='A' || a[x].charAt(y)=='E' || a[x].charAt(y)=='I' || a[x].charAt(y)=='O' || a[x].charAt(y)=='U')
					count++;
			}
			if(count>max) {
				max=count;
				m=a[x];
			}
		}
		System.out.println(m);
	}

}
