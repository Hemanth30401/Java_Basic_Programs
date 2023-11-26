package fileinputstreamANDfileoutputstream;
import java.io.*;
import java.util.*;
public class CreateAFileAndSetWriting {

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\saina\\Documents\\File2.txt");
		System.out.println(f.exists());
		if(f.exists())
		{
			System.out.println(f.delete());
		}
		System.out.println(f.createNewFile());
		System.out.println(f.setWritable(true));
	}

}
