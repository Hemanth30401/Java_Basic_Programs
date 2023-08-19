package Array_Chapter1;

public class Insert_element_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert i = new Insert();
		i.isInsert();
	}

}
class Insert{
	public void isInsert() {
		int[] x = new int[] {11,111,12,122,13,133,14,144,0};
		int a,index=2,ele=22;
		for(a=x.length-1;a>index;a--) {
			x[a]=x[a-1];
		}
		x[a]=ele;
		for(int h:x) {
			System.out.print(h + " ");
		}
	}
}