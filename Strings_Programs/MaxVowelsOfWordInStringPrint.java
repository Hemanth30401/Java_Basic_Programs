package strings_practice;

public class MaxVowelsOfWordInStringPrint {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s=new String("Haeppy neaioww Year");
		s=s.toUpperCase();
		String[] a = s.split(" ");
		String s2="";
		int max=0,index=0;
		for(int i=0;i<a.length;i++)
		{
			String k=a[i];
			int count=0;
			for(int j=0;j<k.length();j++)
			{
				if(k.charAt(j)=='A' || k.charAt(j)=='E' || k.charAt(j)=='I' || k.charAt(j)=='O' || k.charAt(j)=='U')
					count++;
				if(max<count) {
					max=count;
					index=i;
				}
			}
			
		}
		System.out.println(a[index]);
		
	}

}
