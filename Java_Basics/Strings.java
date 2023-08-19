package javahub;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f = new F();
		f.a=100;f.b=220;
		String s=f.swap();
	}

}
class F{
	int a,b;
	public String swap() {
		a=a+b;
		b=a-b;
		a=a-b;
		return a+" ";
	}
}
