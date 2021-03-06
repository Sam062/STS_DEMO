package interviewer_Tasks;

import java.util.*;


class Student{
	private int id;
	String fname;
	double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code

class Chek1 implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		Double cgpa1 = s1.getCgpa();
		Double cgpa2 = s2.getCgpa();

	   /*For ascending order*/
	   if(cgpa1.equals(cgpa2))
	   {
		   String StudentName1 = s1.getFname();
		   String StudentName2 = s2.getFname();
		   //ascending order
		   return StudentName1.compareTo(StudentName2);
	   }
	   else
		   return cgpa2.compareTo(cgpa1);
}
}
public class ListSortComparator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		List<Student> studentList = new ArrayList<Student>();
		Chek1 ck=new Chek1();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next().toLowerCase();
			double cgpa = in.nextDouble();
			studentList.add(new Student(id, fname, cgpa));
			testCases--;
		}
		Collections.sort(studentList, ck);
		
		
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
