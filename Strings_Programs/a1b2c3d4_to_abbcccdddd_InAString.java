package strings_practice;

public class a1b2c3d4_to_abbcccdddd_InAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a1b2c3d4";
		char temp=' ';int num=0;
		for(int x=0;x<s.length();x++)
		{
			if(s.charAt(x)>='a' && s.charAt(x)<='z')
			{
				temp=s.charAt(x);
			}
			else
			{
				num=Character.getNumericValue(s.charAt(x));
				for(int y=1;y<=num;y++)
					System.out.print(temp);
			}
		}
		
	}

}
