package ArrayChapter4;

public class RightrotateArray1loop {
	public static void main(String[] args) {
		int[] a = new int[] {11,1,2,142,543,743,67,7};
		int x,r=5;
		for(x=a.length-r;x<=a.length-1;x++)
			System.out.print(a[x]+" ");
		for(x=0;x<a.length-r;x++) {
			System.out.print(a[x] + " ");
		}
	}
}
