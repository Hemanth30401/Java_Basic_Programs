
public class Exceptions_and_Exceptions_Handling_using_TryCatch {

	public static void main(String[] args) throws MyClassException{
		// TODO Auto-generated method stub
		MyClassException c  = new MyClassException();
		try {
		c.MyClassException("Hello");}
		catch(MyClassException e) {
			System.out.println(e.getMessage());
		}
		try {
		throw new MyClassException("Come to this class");}
		catch(Exception ce) {
			System.out.println(ce.getMessage());
		}
	}

}
class MyClassException extends Exception
{
	MyClassException(){
		System.out.println("Default constructor");
	}
	MyClassException(String msg)
	{
		super(msg);
	}
	public void MyClassException(){
		System.out.println("Default");
	}
	public void MyClassException(String n) throws MyClassException
	{
		throw new MyClassException("Hello This is not my class");
	}
}