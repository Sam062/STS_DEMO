package Date_Time;

import java.util.Date;

public class DateTimeTest {
	public static void main(String[] args) {
		Date d=new Date();
		long t=d.getTime();
		
		System.out.println(t);
		System.out.println("DATE FORMAT");
		System.out.println(new Date(t));
		
		System.out.println("\n\njava.sql.Date FORMAT");
		System.out.println("Date :"+new java.sql.Date(t));
		System.out.println("Time :"+new java.sql.Time(t));
		System.out.println("Timestamp :"+new java.sql.Timestamp(t));
	}

}
