package strings_practice;

public class HighestWordInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Helloo to Pro worldsd");
		String[] a = s.split(" ");
		int x,max=0,min=0;
		for(x=1;x<a.length;x++) {
			if(a[max].length()<a[x].length()) {
				
				max=x;
			}
			
			if(a[min].length()>a[x].length())
			{
				min=x;
			}
			
		}
		System.out.println(a[max] + " is max word and max length of " + a[max].length());
		System.out.println(a[min] + " is small word ");
	}
}
		
		/*for(x=1;x<a.length;x++) {
			
		}
		
	}*/

