package dailyTask;

public class SortString {
	public static void main(String[] args) {
		String original="SATHYA";
		int j=0;
		char temp=0;
		char[] chars=original.toCharArray();
		
		for(int i=0;i<chars.length;i++)
		{
			for (int j1 = 0; j1 < chars.length; j1++) {
				if(chars[j1]>chars[i])
				{
					temp=chars[i];
					chars[i]=chars[j];
					chars[j]=temp;			
				}
			}
		}
		for(char c:chars)
			System.out.println(c);
	}

}
