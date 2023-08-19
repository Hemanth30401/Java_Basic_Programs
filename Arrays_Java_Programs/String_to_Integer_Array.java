package ArrayChapter4;

import java.util.Arrays;

public class String_to_Integer_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("123 Hemanth 43 hub space 5455");
		StringBuffer sb = new StringBuffer(s);
		String[] a = s.split(" ");
		int[] b = new int[a.length];
		String s1="";int num=0;
		for(int x=0;x<a.length;x++) 
		{
			s1="";
			for(int y=0;y<a[x].length();y++) 
			{
				if(a[x].charAt(y)>='0' && a[x].charAt(y)<='9')
				{
					s1+=a[x].charAt(y);
				}
				else
				{
					s1="-1";
				}
			}
			num=Integer.parseInt(s1);
			b[x]=num;
		}
		System.out.println(Arrays.toString(b));
	}

}
