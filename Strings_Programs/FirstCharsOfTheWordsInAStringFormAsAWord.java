package string_assessment;

import java.util.Scanner;

public class FirstCharsOfTheWordsInAStringFormAsAWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		 System.out.println("Enter the input"); 
		 String s = sc.nextLine(); 
				String[] a = s.split(" ");
				String s1="";
				for(int x=0;x<a.length;x++)
					s1=s1+a[x].charAt(0);	
				System.out.println(s1);
	}

}
