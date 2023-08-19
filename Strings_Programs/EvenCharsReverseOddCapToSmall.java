package strings_practice;

public class EvenCharsReverseOddCapToSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello all Good Morning");
		String[] a = s.split(" ");
		String t="";
		for(int x=0;x<a.length;x++) {
			if(x%2==0) {
				for(int y=0;y<a[x].length();y++) {
					if(a[x].charAt(y)>='A' && a[x].charAt(y)<='Z') 
						System.out.print((char)(a[x].charAt(y)+32));
					else if(a[x].charAt(y)>='a' && a[x].charAt(y)<='z')
						System.out.print((char)(a[x].charAt(y)-32));
				}
				System.out.print(" ");
			}
			else
			{
				t="";
				for(int y=a[x].length()-1;y>=0;y--) {
					t=t+a[x].charAt(y);
				}
				a[x]=t;
				System.out.print(a[x] + " ");
			}
			
			
		}
	}

}
