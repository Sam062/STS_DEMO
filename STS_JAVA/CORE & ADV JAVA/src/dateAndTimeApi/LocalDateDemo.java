package dateAndTimeApi;

import java.time.LocalDate;

public class LocalDateDemo {
	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		
		System.out.println(date);
		
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		
		System.out.println(dd+"/"+mm+"/"+yy);
		
		//or One more way as :
		System.out.printf("%d-%d-%d", dd,mm,yy);
	}

}
