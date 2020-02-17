package lambda_expression;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	private String name;
	private Double sal;

	public Employee(String name, Double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
}
public class EmployeeSalCheckPredicate {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("A", 140.0));
		al.add(new Employee("Z", 145.0));
		al.add(new Employee("X", 143.0));
		al.add(new Employee("Y", 144.0));
		al.add(new Employee("B", 160.0));
		al.add(new Employee("C", 180.0));
		al.add(new Employee("D", 110.0));

		//the impl of test function present in Predicate(I)
		Predicate<Employee> p=I->I.getSal()<160.0;

		for (Employee employee : al) {
			if(p.test(employee))
				System.out.println(employee.getName()+":"+employee.getSal());
		}
		System.out.println("Even and Less than 160");
		//Predicate Joining- Here Multiple Predicates can be tested.. as:
		Predicate<Employee> p1=I->I.getSal()%2==0;

		

		//To get salary odd and less than 160
		for (Employee employee : al) {
			if(p.and(p1).negate().test(employee))
				System.out.println(employee.getName()+":"+employee.getSal());
		}
		
		System.out.println("Odd and less than 160");
		//To get salary odd and less than 160
		for (Employee employee : al) {
			if(p.and(p1).negate().test(employee))
				System.out.println(employee.getName()+":"+employee.getSal());
		}
	}

}
