package day_1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GetDate {

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		String str = formatter.format(date);
		System.out.println("Current date: "+str);


		System.out.println("============================");
		LocalDate date1 = LocalDate.now();
		System.out.println("Current Date: "+date1);


		System.out.println("============================");
		SimpleDateFormat formatte = new SimpleDateFormat("dd/MM/yy");
		Calendar obj = Calendar.getInstance();
		String str1 = formatte.format(obj.getTime());
		System.out.println("Current Date: "+str1 );

		System.out.println("============================");
		LocalTime myObj = LocalTime.now();
		System.out.println(myObj);

		System.out.println("============================");
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);

		System.out.println("============================");
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);

		System.out.println("============================");
		Date date3 = new Date();
		System.out.println("Current Time is : " + date3);
		// set format in 12 hours
		SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
		// hh = hours in 12hr format
		// mm = minutes
		// aa = am/pm
		String time1 = formatTime.format(
				date3); // changing the format of 'date'
		// display time as per format
		System.out.println(
				"Current Time in AM/PM Format is : " + time1);
	}
}


