package strings_practice;

import javax.swing.plaf.basic.BasicMenuUI.ChangeHandler;

public class RemoveDuplicatesAndFirstLetterCaptial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="hello all good morning";
		String[] a = s.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			char ch[] = a[i].toCharArray();
			boolean[] b = new boolean[ch.length];
			for(int y=0;y<ch.length;y++)
			{
				if(b[y]==true)
					continue;
				if(y==0) {
					char c=ch[y];
					ch[y]=(char)(c-32);
				}
				count=0;
				for(int j=y+1;j<ch.length;j++)
				{
					if(ch[j]==ch[y])
					{
						count++;
						b[j]=true;
					}
				}
				System.out.print(ch[y]);
			}
			System.out.print(" ");
		}
//		String s ="hello all good morning";
//		String[] a = s.split(" ");
//		s="";
//		for(int i=0;i<a.length;i++)
//		{
//			StringBuilder sb = new StringBuilder(a[i]);
//			sb.replace(0,1,sb.substring(0, 1).toUpperCase());
//			for(int j=0;j<sb.length();j++)
//			{
//				for(int k=j+1;k<sb.length();k++) 
//				{
//					if(sb.charAt(j)==sb.charAt(k)) 
//					{
//						sb.deleteCharAt(k);
//						k--;
//					}
//				}
//			}
//			s=s+sb+" ";
//		}
//		System.out.println(s);
	}
}
