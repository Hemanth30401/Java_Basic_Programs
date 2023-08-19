package strings_practice;

public class Apple_to_Alepp_Alphabetical_Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Apple";
		String s1="";
		for(int x=65;x<=122;x++)
		{
			for(int y=0;y<s.length();y++)
			{
				if((char)(x)==s.charAt(y))
				{
					s1=s1+s.charAt(y);
				}
			}
		}
		System.out.println(s1);
	}

}
