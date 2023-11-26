package usingFiles;
import java.io.*;
public class Serialization_Using_Files_By_Exceptions  {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:\\Users\\saina\\Documents\\Java hub\\Hello.txt");;
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Students s = new Students();
		s.name = "Hemanth";
		s.age = 23;
		s.gender='M';
		oos.writeObject(s);
		FileInputStream fis = new FileInputStream("C:\\Users\\saina\\Documents\\Java hub\\Hello.txt");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		Students s1 = (Students)ois.readObject();
		System.out.println(s1);
		
	}

}
class Students implements Serializable
{
	String name;
	int age;
	double mobile;
	char gender;
	public String toString() {
		return "[ " + name+" " + age + " "+ gender + " ]";
	}
}