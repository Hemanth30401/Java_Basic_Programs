package Array_Chapter1;

public class Length_of_array_using_for_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foreach f = new Foreach();
		int r = f.isLen();
		System.out.println();
		System.out.println("Length is: " + r);
	}

}
class Foreach{
	public int isLen() {
		int[] a = new int[] {1,4,9,14,1,9,27,29};
		int count=0;
		for(int t:a) {
			count++;
			System.out.print(t + " ");
		}
		return count;
	}
}