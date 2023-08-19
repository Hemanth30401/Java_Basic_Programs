package strings_practice;

public class StringBufferAndStringBuilderMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello");
		StringBuilder sb = new StringBuilder(s);
		sb.append("Hi");
		System.out.println(sb);
		String s1 = new String(sb.toString());
		s1.concat("Good");
		System.out.println(s1);
		StringBuffer s2 = new StringBuffer(s1);
		s2.append("Morning");
		System.out.println(s2);
	}

}
