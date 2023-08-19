package Array_Chapter1;

public class Duplicate_ele_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dup p = new Dup();
		p.isDup();
	}

}
class Dup{
	public void isDup() {
		int[] a = new int[] {1,1,2,2,3,3,3,4,5};
		int x,y,count=0;
		for(x=0;x<a.length;x++) {
			count=0;
			for(y=x+1;y<a.length;y++) {
				if(a[x]==a[y]) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(a[x]+" ");
			}
		}
	}
}