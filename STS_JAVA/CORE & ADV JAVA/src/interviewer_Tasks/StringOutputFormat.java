package interviewer_Tasks;

public class StringOutputFormat {
	public static void main(String[] args) {
		String s="Javavavavavav";
		int num=120;

		int s1=s.length();
		int numdig=0;
		int temp=num;
		while(temp>0) {
			numdig++;
			temp=temp/10;
		}
		String fin="";
		fin+=s;
		
		for (int i = 1; i <= 15-s1; i++) {
			fin+=' ';
		}
			for (int i = 0; i < 3 && numdig<3; i++) {
				if(num==0)
				{
					fin+="00";
					break;
				}
				else
				{
					fin+="0";
					numdig++;
				}
		}
			
		fin+=num;
		System.out.println(fin+" "+fin.length());
	}
}
