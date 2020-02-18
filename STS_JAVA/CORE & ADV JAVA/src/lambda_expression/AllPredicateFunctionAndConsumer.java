package lambda_expression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student1{
	private Integer stdId;
	private String stdName;
	private Integer marks;
	public Student1(Integer stdId, String stdName, Integer marks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.marks = marks;
	}
	public Integer getStdId() {
		return stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public Integer getMarks() {
		return marks;
	}
}
public class AllPredicateFunctionAndConsumer {
	public static void main(String[] args) {
		Predicate<Student1> p=s->s.getMarks()>50;

		Function<Student1, String> f1=s->{
			int marks=s.getMarks();
			String grade="";
			grade=(marks>80&&marks<=100)?"O[Excellent]":(marks>60&&marks<=80)?"A[Good]":(marks>30&&marks<=60)?"P[Work]":(marks<=30)?"Fail":"Something Wrong!!";
			return grade;
		};

		Consumer<Student1> c=s->{
			if(p.test(s)) //Predicate Interface 
			{
				System.out.println("Student name="+s.getStdName());
				System.out.println("Student marks="+s.getMarks());
				System.out.println("Student grades="+f1.apply(s)); //Function Interface
				System.out.println();
			}
			else System.out.println("FAIL");
		};
		
		Student1 s=new Student1(101, "ABC", 51);
		c.accept(s); //Consumer Interface
		
	}

}
