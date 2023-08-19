package strings_practice;

public class SortAStringWithoutUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Apple");
		char c =(int)('A'),b=(int)('z');
		String s1="";
		for(int x=c;x<b;x++) {
			for(int y=0;y<s.length();y++) {
				if((char)(x)==s.charAt(y)) {
					s1=s1+s.charAt(y);
				}
			}
		}
		System.out.print(s1);
	}

}
