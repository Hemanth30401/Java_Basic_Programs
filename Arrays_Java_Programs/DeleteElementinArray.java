package ArrayChapter4;

public class DeleteElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {10,20,30,04,50,60,70};
		int x,del=3;
		for(x=del;x<a.length-1;x++) {
			a[x]=a[x+1];
		}
		for(int j:a)
			System.out.print(j + " ");
	}

}
