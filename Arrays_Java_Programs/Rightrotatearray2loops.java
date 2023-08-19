package ArrayChapter4;

public class Rightrotatearray2loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,2,13,12,11,111,7,51};
		int r=5,x,y,temp;
		for(y=1;y<=r;y++) {
			temp=a[a.length-1];
		for(x=a.length-1;x>0;x--) {
			a[x]=a[x-1];
		}
		a[x]=temp;
		}
		for(int h:a)
			System.out.println(h);
		
		
		
	}

}
