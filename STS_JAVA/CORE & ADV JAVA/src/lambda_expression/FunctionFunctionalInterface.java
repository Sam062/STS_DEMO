package lambda_expression;

import java.util.function.Function;

class Student{
	private Integer stdId;
	private String stdName;
	private Integer marks;
	public Student(Integer stdId, String stdName, Integer marks) {
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

public class FunctionFunctionalInterface {
	public static void main(String[] args) {
		
		Function<Student,String> f=S->{
			int marks=S.getMarks();
			String grade="";

			grade=(marks>80&&marks<=100)?"O[Excellent]":(marks>60&&marks<=80)?"A[Good]":(marks>30&&marks<=60)?"P[Work]":(marks<=30)?"Fail":"Something Wrong!!";
			return grade;
		};
		
		Student s=new Student(101, "ABC", 20);
		System.out.println(f.apply(s));
		
	}

}
