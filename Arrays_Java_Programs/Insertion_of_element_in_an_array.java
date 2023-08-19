package Array_Chapter1;

public class Insertion_of_element_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {10,20,21,22,23,33,35,67,98,11};
		Del d = new Del();
		d.isDeleted(a);
	}

}
class Del{
	public void isDeleted(int[] a) {
		int x,i=4;
		for(x=i;x<a.length-1;x++) {//Left rot
			a[x]=a[x+1];
		}
		System.out.println("Deleted at index " + i + " elements are: ");
		for(int y:a) {
			System.out.print(y + " ");
		}
	}
}