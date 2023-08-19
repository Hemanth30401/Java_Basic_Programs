package strings_practice;

public class ReplaceCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello how ArE yOU";
		
		int x;
		for(x=0;x<s.length();x++) {
			if(s.charAt(x)>='A' && s.charAt(x)<='Z') 
				System.out.print((char)(s.charAt(x)+32));
			
			else if(s.charAt(x)>='a' && s.charAt(x)<='z')
				System.out.print((char)(s.charAt(x)-32));
			
			else
				System.out.print(" ");
		}
	}

}
