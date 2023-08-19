package strings_practice;

public class SumOfNumbersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("a12b2c3");
		int x,prod=1;
		for(x=0;x<s.length();x++) {
			if(s.charAt(x)>='0' && s.charAt(x)<='9') {
				prod=prod*Character.getNumericValue(s.charAt(x));
			}
		}
		System.out.println(prod);
	}

}
