package fileinputstreamANDfileoutputstream;
import java.io.*;
import java.util.*;
public class FileInputStream_reading {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\saina\\Documents\\File1.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\saina\\Documents\\File2.txt");
		int x;
		while((x=fis.read())!=-1) {
			fos.write(7070);
		}
		System.out.println("File Copied Successfully");
		fis.close();fos.close();
	}

}
