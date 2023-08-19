package strings_practice;
import java.util.Scanner;
public class AlphabetsPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String s = new String(sc.nextLine());
		int count=0;
		for(int x=65;x<=122;x++) {
			for(int y=0;y<s.length();y++) {
				if(s.charAt(y)!=' ') {
					if((char)(x)==s.charAt(y)) {
						count++;
						break;
					}
				}
			}
		}
		if(count==26)
			System.out.println("All Alphabets are Present");
		else
			System.out.println("All Alphabets are Not Present");
		
	}

}
