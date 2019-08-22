package dailyTask;

public class SortStringAPI {
	public static void main(String[] args) {
		String original="SATYA";
		char[] c=original.toCharArray();
		Arrays.sort(c);
		String sorted=new String(c);
		System.out.println(sorted);
		
		
		//16bit UUID generator
		//System.out.println(java.util.UUID.randomUUID().toString());
	}
}
