package strings_practice;

public class PalindromeCountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Madam arora Teaches Malayalam").toUpperCase();
		String[] a = s.split(" ");
		int x,y,count=0;
		for(x=0;x<a.length;x++) {
			String rev="";
			for(y=a[x].length()-1;y>=0;y--) {
				rev=rev+a[x].charAt(y);
			}
			if(rev.equals(a[x])) {
				System.out.println(a[x]);
				count++;
			}
		}
		System.out.println("Palindrome words are " +count);
	}

}
