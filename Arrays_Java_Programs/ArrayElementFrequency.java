package ArrayChapter4;

public class ArrayElementFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,13,3,1,4,5,3,1,99,-1,0,0};
		boolean[] b  =new boolean[a.length];
		int x,y,count=1;
		System.out.println("Array Element frequency: ");
		for(x=0;x<a.length;x++) {
			if(b[x]==true) {
				continue;
			}
			count=1;
			for(y=x+1;y<a.length;y++) {
				if(a[x]==a[y]) {
					count++;
					b[y]=true;
				}
			}
			System.out.println(a[x] + " repated " + count + " times");
		}
	}

}
