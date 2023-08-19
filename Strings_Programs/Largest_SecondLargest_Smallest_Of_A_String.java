package strings_practice;

public class Largest_SecondLargest_Smallest_Of_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello All good Morning";
		String[] a = s.split(" ");
		String max=a[0],sl=a[1],min=a[0];
		for(int x=1;x<a.length;x++)
		{
			if(a[x].length()>max.length()) {
				sl=max;
				max=a[x];
			}
			else if(a[x].length()>sl.length()) {
				sl=a[x];
			}
			if(min.length()>a[x].length()) {
				min=a[x];
			}
		}
		System.out.println(max);
		System.out.println(sl);
		System.out.println(min);
	}

}
