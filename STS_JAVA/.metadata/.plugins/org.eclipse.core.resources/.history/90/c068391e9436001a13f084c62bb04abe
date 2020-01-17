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
        String[] str=new String[entries];
        for (int i = 0; i < str.length; i++) {
			str[i]=sc.nextLine();
		}
		//System.out.println(phonebook);
        Set s1=phonebook.entrySet();
        Iterator itr=s1.iterator();
        int i=0;
        while(itr.hasNext()) {
        	Map.Entry m1=(Map.Entry) itr.next();
        	if(phonebook.containsKey(str[i]))
        		System.out.println(m1.getKey()+"="+m1.getValue());
        	else
        		System.out.println("Not found");
        	i++;
        }	
	}
}
