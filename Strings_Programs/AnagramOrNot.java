package strings_practice;

public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Silent").toLowerCase();
		String s1 = new String("Eaten").toLowerCase();
		String temp="";
		String temp2="";
		if(s.length()==s1.length()) {
			char[] a1=s.toCharArray();
			char[] a2=s1.toCharArray();
			Sort q = new Sort();
			q.isSort(a1);
			q.isSort(a2);
			for(int x=0;x<a1.length;x++) { 
				temp=temp+a1[x];
			}
			for(int x=0;x<a2.length;x++){
				temp2=temp2+a2[x];
			}
			if(temp.equals(temp2)) {
				System.out.println("Anagram");
			}
		}
		else
			System.out.println("Not Anagram");
	}

}
class Sort{
	public void isSort(char[] a) {
		int x,y;
		for(x=0;x<a.length;x++) {
			for(y=0;y<a.length;y++) {
				if(a[x]>a[y])
				{
					char temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
	}
}