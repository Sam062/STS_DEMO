package interviewer_Tasks;

import java.util.ArrayList;
import java.util.List;

public class MultipleListDuplicateRemove {
	public static void main(String[] args) {
	
	List<String> li=new ArrayList();
	li.add("d");	
	li.add("c");	
	li.add("b");	
	li.add("a");

	
	List<String> li1=new ArrayList();
	li1.add("d");	
	li1.add("c");	
	li1.add("x");	
	li1.add("y");
	
	
	
	
	//temp list
	List<String> li2=new ArrayList(li);
	
	//intersection(contains only common elements)
	li2.retainAll(li1); //[d,c]
	li.removeAll(li2); 	//[a,b]
	li1.removeAll(li2);	//[a,b]
	
	System.out.println(li);
	System.out.println(li1);
	
	li.addAll(li1);
	System.out.println(li);
	}

}
