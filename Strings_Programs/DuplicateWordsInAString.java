package strings_practice;

public class DuplicateWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello Hi hi Good mng Mng");
		String[] a = s.split(" ");
		int count=0;
		for(int x=0;x<a.length;x++) {
			count=0;
			for(int y=x+1;y<a.length;y++) {
				if(a[x].compareToIgnoreCase(a[y])==0) {
					count++;
				}
			}
			if(count==1)
				System.out.print(a[x] + " ");
		}
		
	}

}
