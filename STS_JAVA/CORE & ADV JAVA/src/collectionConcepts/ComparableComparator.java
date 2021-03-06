package collectionConcepts;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable {
	int empId;
	String empName;
	Employee(String name,int eid){
		this.empId=eid;
		this.empName=name;
	}
	
	@Override
	public String toString() {
		return empId+"---"+empName;
	}
	
	@Override
	public int compareTo(Object o) {
		int eid1=this.empId;
		Employee e=(Employee)o;
		int eid2=e.empId;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return +1;
		else
		 return 0;
	}
}
public class ComparableComparator{
	public static void main(String[] args) {
		Employee e1=new Employee("abcd", 21154);
		Employee e2=new Employee("defg", 21153);
		Employee e3=new Employee("ghij", 21155);
		Employee e4=new Employee("jklm", 21120);
		Employee e5=new Employee("mnop", 20);
		Employee e6=new Employee("pqrs", 15);
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2); //e2.compareTo(e1)
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t); //sorted by empId
		
		TreeSet t2=new TreeSet(new MyComparator());
		t2.add(e1);
		t2.add(e2); //e2.compare(e1)
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		t2.add(e6);
		System.out.println(t2); //sorted by empName
	}	
}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e=(Employee)o1;
		Employee e2=(Employee)o2;
		String s1=e.empName;
		String s2=e2.empName;
		return s1.compareTo(s2);
	}
	
}
