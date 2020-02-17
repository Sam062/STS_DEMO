package interviewer_Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
class Student1 implements Comparable<Student1>{
	public Integer sid;
	public String sname;
	public Integer marks;
	public Student1(Integer sid, String sname, Integer marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return marks + " ";
	}
	@Override
	public int compareTo(Student1 o) {
		Integer marks=this.marks;
		return (o.marks>marks)?1:(o.marks<marks)?-1:0;
	}
}
public class SecondHighestElement {
	public static void main(String[] args) {
		List<Student1> l=new ArrayList<Student1>();
		l.add(new Student1(101, "A", 10));
		l.add(new Student1(102, "B", 1));
		l.add(new Student1(103, "C", 5));
		l.add(new Student1(104, "D", 14));
		System.out.println(l);
		
		NavigableSet<Student1> ns=new TreeSet<Student1>(l);
		System.out.println(ns);
		System.out.println(ns.higher(ns.first()));
	}
}
