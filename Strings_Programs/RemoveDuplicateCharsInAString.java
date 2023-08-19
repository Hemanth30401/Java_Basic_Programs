package strings_practice;

public class RemoveDuplicateCharsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello All Good Morning");
		int x,y;
		for(x=0;x<sb.length();x++) {
			for(y=x+1;y<sb.length();y++) {
				if(sb.charAt(x)==sb.charAt(y)) {
					sb.replace(y, y+1, "_");
				}
			}
		}
		String t=sb.toString();
		
		for(x=0;x<t.length();x++) {
			
			if(t.charAt(x)!='_') {
				System.out.print(t.charAt(x));
		}
		}
	}

}
