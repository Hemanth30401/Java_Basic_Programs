package strings_practice;

public class Remove_Duplicate_In_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="hello all good morning";
		String[] a = s.split(" ");
		s="";
		for(int i=0;i<a.length;i++)
		{
			StringBuilder s1 = new StringBuilder(a[i]);
			s1.replace(0, 1, s1.substring(0, 1).toUpperCase());
			for(int j=0;j<s1.length();j++)
			{
				for(int k=j+1;k<s1.length();k++)
				{
					if(s1.charAt(j)==s1.charAt(k)) {
						s1.deleteCharAt(k);
						k--;
					}
				}
			}
			s=s+s1+" ";
		}
		System.out.println(s);
	}

}
