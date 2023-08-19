package Array_Chapter1;

public class Element_found_or_not_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = new int[] {1,2,3,4,5,7,5,6,6,8};
		int x,check=6;
		int count=0;
		for(x=0;x<b.length;x++) {
			if(b[x]==check) {
				count++;
				System.out.println("element found at " + (x+1));
			}
			
		}
		if(count==0)
			System.out.println("Element not found");
	}

}
