package interviewer_Tasks;

public class StringTokens {
	public static void main(String[] args) {
		String a="He is a very very good boy, isn't he2554s ss?";
		a=a.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(a);
	}

}
