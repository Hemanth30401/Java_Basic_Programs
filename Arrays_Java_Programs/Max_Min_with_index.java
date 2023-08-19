package Array_Chapter1;

public class Max_Min_with_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {11,112,3,55,14,77};
		int x,max=0;
		for(x=0;x<a.length;x++) {
			if(a[max]<a[x]) {
				max=x;
			}
			
		}
		System.out.println(a[max]);
		
	}
	

}
