package strings_practice;

import java.util.Arrays;

public class CharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("3:30pm ashes");
		char[] a = s.toCharArray();
		int x,num=0,sp=0,al=0;
		for(x=0;x<a.length;x++) {
			if(a[x]>='0' && a[x]<='9')
				num++;
			else if(a[x]>=0 && a[x]<=9)
				sp++;
			else
				al++;
		}
		System.out.println(num + " " + sp + " " + al);
	}

}
