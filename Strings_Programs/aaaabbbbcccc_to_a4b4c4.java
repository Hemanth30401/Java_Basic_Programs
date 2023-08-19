package string_assessment;

import java.util.Scanner;

public class aaaabbbbcccc_to_a4b4c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the input"); 
		String s = sc.nextLine();
		char[] a = s.toCharArray();
		boolean[] b  =new boolean[a.length];
		int count=0;
		for(int x=0;x<a.length;x++){
			if(b[x]==true){
				continue;
			}
			count=0;
			for(int y=0;y<a.length;y++){
				if(a[x]==a[y]){
					count++;
					b[y]=true;
				}
			}
			
			System.out.print(a[x]+ "" +count);
			
		}
	}

}
