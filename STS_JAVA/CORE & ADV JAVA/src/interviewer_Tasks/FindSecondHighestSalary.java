package interviewer_Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//yet to be completed...
class Employee{
	public Integer id;
	public Integer sal;
	public Employee(Integer id, Integer sal) {
		super();
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return sal + " ";
	}
}
public class FindSecondHighestSalary {
	public static void main(String[] args) {
		List<Employee> s=new ArrayList<Employee>();
		s.add(new Employee(101, 1000));
		s.add(new Employee(102, 5000));
		s.add(new Employee(101, 1111));
		s.add(new Employee(103, 5000));
		Comparator<Employee> c=(a,b)->a.sal.compareTo(b.sal);
		Collections.sort(s, (a,b)->b.sal.compareTo(a.sal));
		System.out.println(s);	

	}

}
