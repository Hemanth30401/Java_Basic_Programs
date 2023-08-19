package Array_Chapter1;

public class Selecton_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {23,2,11,1,5,6};
		int x,min,y,temp;
		for(x=0;x<a.length;x++) {
			min=x;
			for(y=x+1;y<a.length;y++) {
				if(a[min]<a[y]) {
					min=y;
				}
			}
			temp=a[min];
			a[min]=a[x];
			a[x]=temp;
		}
		for(int t:a) {
			System.out.print(t+" ");
		}
	}

}
