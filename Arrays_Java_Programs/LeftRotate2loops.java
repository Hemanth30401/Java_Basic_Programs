package ArrayChapter4;

public class LeftRotate2loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {11,1,2,142,543,743,67,7};
		int x,y,r=5,temp;
		for(y=1;y<=r;y++) {
			temp=a[0];
		for(x=0;x<a.length-1;x++) {
			a[x]=a[x+1];
		}
		a[x]=temp;
		}
		for(int j :a)
			System.out.print(j + " ");
	}

}
