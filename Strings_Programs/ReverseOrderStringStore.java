package strings_practice;

public class ReverseOrderStringStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello how are you?");
		String s1="";
		int x,y=0;
		for(x=s.length()-1;x>=0;x--) {
				s1=s1+s.charAt(x);
		}
		System.out.print(s1+ " ");
		
	}

}
