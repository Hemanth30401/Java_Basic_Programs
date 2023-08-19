package strings_practice;

public class CharactersA17B15C14InAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("a17b15c14");
		int n=0,n2=0;
		for(int x=0;x<s.length();x++) {
			n=0;n2=0;
			if(s.charAt(x)>='A' && s.charAt(x)<='Z' || s.charAt(x)>='a' && s.charAt(x)<='z') {
				if(s.charAt(x+1)>='0' && s.charAt(x+1)<='9') {
					n=Character.getNumericValue(s.charAt(x+1))*10;
					n2=Character.getNumericValue(s.charAt(x+2));                                                                                                                         
					n=n+n2;
					System.out.println(n);
				}
				for(int y=0;y<n;y++)
					System.out.println(s.charAt(x));
			}
			
		}
	}

}
