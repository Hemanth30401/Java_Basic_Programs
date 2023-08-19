package strings_practice;

public class SecondHighestWordInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("H all Programming world");
		String[] a = s.split(" ");
		int x=0,se=0,max=0;
		for(x=1;x<a.length;x++) {
			if(a[max].length()<a[x].length()) { 
				se=max;
				max=x;
			}
			else if(a[x].length()>a[se].length()) {
				se=x;
			}
		}
		System.out.println(a[se] +" is second highest word and its word length is " + a[se].length());
	}

}
