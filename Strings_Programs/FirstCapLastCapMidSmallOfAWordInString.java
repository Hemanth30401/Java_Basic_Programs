package strings_practice;

public class FirstCapLastCapMidSmallOfAWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("madam arora teaches malayalam");
		String[] a = s.split(" ");
//		String temp="";
//		String k="";
//		int x;
//		for(x=0;x<a.length;x++) {
//			temp=a[x];
//			k=k+temp.substring(0,1).toUpperCase()+temp.substring(1,temp.length()-1)+temp.substring(temp.length()-1).toUpperCase();
//			System.out.print(k + "");
//			k=" ";
//		}
		String i = "";
		String j="";
		for(int x=0;x<a.length;x++) {
			i="";j="";
			for(int y=0;y<a[x].length();y++) {
				if(y==0) {
					i=i+a[x].charAt(y);
					i=i.toUpperCase();
				}
				else if(y==a[x].length()-1) {
					j=j+a[x].charAt(y);
					j=j.toUpperCase();
				}
				else
					i=i+a[x].charAt(y);
			}
			i=i+j;
			a[x]=i;
			System.out.print(a[x] + " ");
		}
		
		
	}

}
