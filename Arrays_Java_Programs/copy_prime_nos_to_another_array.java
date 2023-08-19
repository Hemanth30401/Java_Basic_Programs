package Array_Chapter1;

public class copy_prime_nos_to_another_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime1 p = new Prime1();
		p.isArr();
	}

}
class Prime1{
	public void isArr() {
		int[] a = new int[] {1,2,3,7,11};
		int[] arr = new int[a.length];
		int x,y,count=0,s=0,t=0;
		for(x=0;x<a.length;x++) {
			count=0;
			for(y=1;y<=a[x];y++) {
				if(a[x]%y==0) {
					count++;
				}
			}
			if(count==2) {
				arr[s]=a[x];
				s++;
			}
		}
		int[] arr2 = new int[s];
		for(x=0;x<arr.length;x++) {
			if(arr[x]!=0) {
				arr2[t++] = arr[x];
			}
		}
		for(t=0;t<arr2.length;t++)
			System.out.print(arr2[t] + " ");
		System.out.println("Length: " + arr2.length);
		
	}
}