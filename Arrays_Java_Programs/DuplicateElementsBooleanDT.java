package ArrayChapter4;

public class DuplicateElementsBooleanDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,2,3,3,1,1,5,6,7};
		boolean[] b  =new boolean[a.length];
		int x,y,count=0;
		System.out.println("Duplicate elements in array are: ");
		for(x=0;x<a.length;x++) 
		{
			if(b[x]==true) 
			{
				continue;
			}
			count=0;
			for(y=x+1;y<a.length;y++) {
				if(a[x]==a[y]) {
					count++;
					b[y]=true;
				}
			}
			if(count>0) {
				System.out.print(a[x] + " ");
			}
		}
	}

}
