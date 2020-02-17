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
public class EmployeeSalCheck {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("A", 140.0));
		al.add(new Employee("B", 160.0));
		al.add(new Employee("C", 180.0));
		al.add(new Employee("D", 110.0));
		
		//the impl of test function present in Predicate(I)
		Predicate<Employee> p=I->I.getSal()<150.0;
		
		for (Employee employee : al) {
			if(p.test(employee))
				System.out.println(employee.getName()+":"+employee.getSal());
		}
	}

}
