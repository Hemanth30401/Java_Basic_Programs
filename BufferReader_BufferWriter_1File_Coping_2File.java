
package fileinputstreamANDfileoutputstream;
import java.io.*;
public class BufferReader_BufferWriter_1File_Coping_2File 
{

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\saina\\Documents\\File1.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		File f1 = new File("C:\\Users\\saina\\Documents\\File2.txt");
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		String s = new String();
		while((s=br.readLine())!=null)
		{
			bw.write(s);
		}
		System.out.println("File Copied");
		br.close();
		bw.close();
	}

}
