package ArrayChapter4;

public class UniqueNonrepitive {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		int[] a = new int[7];
		int x;
		for(x=0;x<a.length;x++) {
			a[x]=Integer.parseInt(ar[x]);
		}
		Uni n = new Uni();
		n.isRep(a);
		
	}

}
class Uni{
	public void isRep(int[] a) {
		int x,y,count=0;
		for(x=0;x<a.length;x++) {
			count=0;
			for(y=0;y<a.length;y++) {
				if(a[x]==a[y]&& x!=y) {
					count++;
					break;
				}
			}
			if(count==0)
				System.out.print(a[x] + " ");
			
		}
	}
}