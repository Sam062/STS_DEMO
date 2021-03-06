package interviewer_Tasks;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JavaMapPhonebook {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input no :");
		int entries=sc.nextInt();
		Map<String, Integer> phonebook=new LinkedHashMap<>();
		sc.nextLine();
		for(int i=0;i<entries;i++)
		{
			String name=sc.nextLine();
			int phone=sc.nextInt();
			sc.nextLine();
			phonebook.put(name, phone);
		}
//        String[] str=new String[entries];
//        for (int i = 0; i < str.length; i++) {
//			str[i]=sc.nextLine();
//		}
//		//System.out.println(phonebook);
//       // Set s1=phonebook.entrySet();
//      //  Iterator itr=s1.iterator();
//       // && itr.hasNext()
//        
//        for (int j = 0; j < str.length; j++) 
//        {
//        	//Map.Entry m1=(Map.Entry) phonebook.entrySet();
//        	if(phonebook.containsKey(str[j]))
//        		//System.out.println(m1.getKey()+"="+m1.getValue());
//        	{	//Integer a=phonebook.get(str[j]);
//        		System.out.println(str[j]+"="+phonebook.get(str[j]));
//        	}
//        	else
//        		System.out.println("Not found");
//		}
		while(sc.hasNext())
	      {
	         String s=sc.nextLine();
	          if (phonebook.containsKey(s)) {
	              System.out.println(s + "=" + phonebook.get(s));
	          }
	          else {
	              System.out.println("Not found");
	          }
	      }
	}
}
