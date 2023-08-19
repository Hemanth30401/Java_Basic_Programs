package strings_practice;
import java.util.Scanner;
public class CountNoOfWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String s1=sc.nextLine();
		int x,count=0;
		s1=s1.trim();
		for(x=0;x<s1.length();x++) {
			if(s1.charAt(x)==' ') {
				if(s1.charAt(x-1)==' ')
					continue;
				else
					count++;
			}
		}
		System.out.print("No of words are: " + (count+1));
		
	}

}
