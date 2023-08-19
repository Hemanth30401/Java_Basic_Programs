package string_assessment;

public class CharsFrequencyInAString {

		public static void main(String[] args){
			String s = new String("hello all");
			char[] a = s.toCharArray();
			boolean[] b = new boolean[a.length];
			int count=1;
			for(int x=0;x<a.length;x++){
				if(a[x]!=' ')
				{
					if(b[x]==true){
						continue;
					}
					count=1;
					for(int y=x+1;y<a.length;y++){
						if(a[x]==a[y]){
							count++;
							b[y]=true;
						}
					}
					System.out.println(a[x] + "->" + count);
				}
				
			}
	}
}
