package strings_practice;

public class CharactersToInt_a4b3c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("aaaabbbcccc");
		char[] a = s.toCharArray();
		boolean[] b = new boolean[a.length];
		int n,count=0;
		String s1="";
		for(int x=0;x<a.length;x++) {
			if(b[x] == true) {
				continue;
			}
			count=0;s1="";
			for(int y=0;y<a.length;y++)
			{ 
				if(a[x]==a[y]) {
					count++;
					b[y]=true;
				}
			}
			s1=s1+a[x]+count;
			System.out.print(s1);
		}
		
	}
}
