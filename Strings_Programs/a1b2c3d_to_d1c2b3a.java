package strings_practice;

public class a1b2c3d_to_d1c2b3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("a1b2c3d");
		char[] a = s.toCharArray();
		String s1="";
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>='0' && a[x]<='9')
				s1=s1+a[x];
			else
				s1=s1+a[a.length-1-x];
		}
		System.out.println(s1);
	}

}
