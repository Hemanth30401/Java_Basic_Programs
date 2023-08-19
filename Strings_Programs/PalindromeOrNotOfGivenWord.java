package strings_practice;

public class PalindromeOrNotOfGivenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MADAM";
		StringBuilder sb=new StringBuilder(s);
		for(int x=0;x<sb.length();x++) {
			
			sb.reverse();	
			
		}
		if(sb.toString().equals(s)) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("NOt");
	}

}
