package Array_Chapter1;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {10,18,1,55,88,8,45,17};
		int x,y,temp;
		
		for(x=0;x<a.length-1;x++) {
			
			for(y=0;y<a.length-x-1;y++) {
				if(a[y]>a[y+1]) {
					temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			}
			
		}
		for(int h:a)
			System.out.print(h + " ");
	}

}
