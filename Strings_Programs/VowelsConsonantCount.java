package strings_practice;

public class VowelsConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello HIi");
		int x,vc=0,con=0;
		for(x=0;x<s.length();x++) {
			if(s.charAt(x)=='A' || s.charAt(x)=='E' || s.charAt(x)=='I' || s.charAt(x)=='O' || s.charAt(x)=='U' || s.charAt(x)=='a' || s.charAt(x)=='e' || s.charAt(x)=='i' || s.charAt(x)=='o' || s.charAt(x)=='u') {
				vc++;
			}
			else if(s.charAt(x)==' ')
				continue;
			else
				con++;
		}
		System.out.println("Vowels " + vc);
		System.out.println("Consonants " + con);
	}

}
