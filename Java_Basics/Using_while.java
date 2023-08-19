package javahub;

public class Using_while {
	public static void main(String[] args) {
		int a = 20,n =10,x=1;
		while(a>=x) {
			if(n<a) {
				System.out.print(a + " ");
				a--;
			}
			else {
				System.out.print(x + " ");
				x++;
			}
		}
	}
}
