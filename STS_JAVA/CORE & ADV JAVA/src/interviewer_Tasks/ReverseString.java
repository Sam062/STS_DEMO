package interviewer_Tasks;

public class ReverseString {
	public static void main(String[] args) {
		String s="hello world";
		char[] c=s.toCharArray();
		String s1="";
		
		int i=c.length-1;
		while(i>=0) {
			s1+=c[i];
			i--;
			
		}
		System.out.println(s1);
		
		//Using StringBuilder
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
		
		//Using StringBuffer
		StringBuffer sb1=new StringBuffer(s);
		System.out.println(sb1.reverse());
	}

}
