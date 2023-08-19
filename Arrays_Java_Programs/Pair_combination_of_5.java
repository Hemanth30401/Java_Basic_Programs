package Array_Chapter1;

public class Pair_combination_of_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair p=new Pair();
		p.callPair();
	}

}
class Pair{
	public void callPair() {
		int[] a = new int[] {1,2,4,3,-1,0,6};
		int x,y,flag=5,b=0;
		for(x=0;x<a.length;x++) {
			for(y=x+1;y<a.length;y++) {
				b=a[x]+a[y];
				if(flag==b) {
					System.out.println("{" + a[x] + "," + a[y] +"}");
				}
			}
		}
	}
}