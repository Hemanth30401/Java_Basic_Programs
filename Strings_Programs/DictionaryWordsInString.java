package strings_practice;

public class DictionaryWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello all Good Morning To Every one");
		String[] a = s.split(" ");
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a.length-x-1;y++) {
				if((a[y].compareToIgnoreCase(a[y+1]))>0) {
					String temp = a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			}
		}
		for(String t:a)
			System.out.print(t + " ");
	}

}
