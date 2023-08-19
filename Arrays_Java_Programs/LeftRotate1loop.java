package ArrayChapter4;

public class LeftRotate1loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {11,1,2,142,543,743,67,7};
		int x,r=5;
		for(x=r;x<a.length;x++) {
			System.out.print(a[x] + " ");
		}
		for(x=0;x<=r-1;x++) {
			System.out.print(a[x] + " ");
		}
	}

}
