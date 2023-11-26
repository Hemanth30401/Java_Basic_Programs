
public class RunTimeErrors_In_Exceptions {

	public static void main(String[] args) {//JVM calls main method
		// TODO Auto-generated method stub
		RunTimeErrors_In_Exceptions r = new RunTimeErrors_In_Exceptions();
		r.method1();
	}
	public void method1()
	{
		System.out.println("I am method1");
		method2();
		System.out.println(12/0);
		System.out.println("After method2");
		System.out.println("Hello hi");
	}
	public void method2()
	{
		System.out.println("I am method2");
		method3();
	}
	public void method3()
	{
		System.out.println("I am method3");
	}

}
