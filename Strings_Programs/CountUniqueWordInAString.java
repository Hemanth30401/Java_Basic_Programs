package strings_practice;

public class CountUniqueWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello Hello");
				String[] a =s.split(" ");
				boolean[] b = new boolean[a.length];
				int y,x, count=1,ind=0;
				for(x=0;x<a.length;x++){
				     b[x]=true;count=1;
				     for(y=x+1;y<a[x].length()-1;y++)
				      {
				if(a[x].compareToIgnoreCase(a[y])>0){
				     ind=x;
				     count++;
				     b[x]=true;
				     }
				 }
				 if(count==1)
				   System.out.println(count  + " time the word is present" + a[ind]) ;
				}
	}

}
