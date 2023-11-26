
public class NullPointerExceptionsUsingObjectsasVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] b = null;
//		System.out.println(b.hashCode());
		
		String s = "Hello";
		System.out.println(s.hashCode());
		String s1="Hi";
		s.concat(s1);
		System.out.println(s.hashCode());
	}

}
