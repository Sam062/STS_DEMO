package Date_Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompare {
	public static void main(String[] args) throws ParseException {
		
		Date d=new Date();
		System.out.println(d);
		String str=new String(d.toString());
		
		Date d1=new SimpleDateFormat("yyyy-MM-dd").parse("2020-02-28");
		System.out.println(d1);
		
		Date d2=new Date();
		d2.setHours(00);
		d2.setMinutes(00);
		d2.setSeconds(00);
		System.out.println(d2);
		
		System.out.println(d1.toString().compareTo(d2.toString()));
		
		
	}

}