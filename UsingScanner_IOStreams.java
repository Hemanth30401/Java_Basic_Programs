package fileinputstreamANDfileoutputstream;
import java.io.*;
import java.util.*;
public class UsingScanner_IOStreams {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\saina\\Documents\\File1.txt");
		Scanner sc = new Scanner(f);
		int count=0;
		while(sc.hasNextLine())
		{
			sc.nextLine();
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
