package strings_practice;

import java.util.Arrays;

public class OddIndexReverseInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Aus vs Eng At 3pm");
		String[] a = s.split(" ");
		int x=0,y;
		String i="";
		for(x=1;x<a.length;x+=2) {
			i="";
			for(y=a[x].length()-1;y>=0;y--) {
				i=i+a[x].charAt(y);
			}
			a[x]=i;
		}
		for(String t:a)
			System.out.print(t + " ");
	}

}
