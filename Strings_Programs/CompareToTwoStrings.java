package strings_practice;

public class CompareToTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		System.out.println((s1.compareToIgnoreCase(s2)>0)?"Equal":"Not equal");
	}

}
