package Array_Chapter1;

public class sorting_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {11,1,4,1,4,144,19};
		Sort s = new Sort();
		s.isSort(a);
	}

}
class Sort{
	public void isSort(int[] a) {
		int x,y,temp;
		for(x=0;x<a.length;x++) {
			for(y=x+1;y<a.length;y++) {
				if(a[x]>a[y]) {
					temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		for(int z:a)
			System.out.print(z+ " ");
	}
}