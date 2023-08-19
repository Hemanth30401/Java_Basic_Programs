package strings_practice;

public class Characters_a_bb_ccc_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("a17b15c14");
		int x;char temp = ' ';
		for(x=0;x<s.length();x++) {
			if(s.charAt(x)>='A' && s.charAt(x)<='Z' || s.charAt(x)>='a' && s.charAt(x)<='z') {
				temp=s.charAt(x);
			}
			else if(s.charAt(x)>='0' && s.charAt(x)<='9') {
				int num=Character.getNumericValue(s.charAt(x));
				for(int y=num;y>0;y--) {
					System.out.print(temp);
				}
				System.out.print(" ");
			}
		}
	}

}
