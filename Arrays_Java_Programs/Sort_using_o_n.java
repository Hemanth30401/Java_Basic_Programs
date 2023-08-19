package Array_Chapter1;

public class Sort_using_o_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {32,2,5,61,16,77};
		int x,temp;
		for(x=0;x<a.length-1;x++) {
			if(a[x]<a[x+1]) {
				temp=a[x];
				a[x]=a[x+1];
				a[x+1]=temp;
				x=-1;
			}
		}
		for(int h:a) {
			System.out.print(h + " ");
		}
	}

}
