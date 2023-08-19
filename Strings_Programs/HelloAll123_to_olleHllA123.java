package strings_practice;

public class HelloAll123_to_olleHllA123 {

	static public void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345 Hello all";
		String[] a = s.split(" ");
		String temp="";
		//char[] b=s.toCharArray();
		for(int x=0;x<a.length;x++) 
		{       
			temp="";
		    for(int k=0;k<a[x].length();k++)
		    {
		    	if(a[x].charAt(k)>='0'&&a[x].charAt(k)<='9') 
		    	{
		    		temp=temp+a[x].charAt(k);
		    	}
		    	else
		    	{
		    		temp="";
				   for(int h=a[x].length()-1;h>=0;h--)
				   {
					   temp=temp+a[x].charAt(h);
				   }
				}
		    }
		    System.out.print(temp+" ");  
		}
 
	}

}
