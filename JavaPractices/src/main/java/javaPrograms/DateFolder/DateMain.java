package javaPrograms.DateFolder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateMain {
	public static void main(String[] args) {
//		Date dob = new Date();
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
//		System.out.println(formatter.format(dob));
//		System.out.println(sdf.format(dob));
		
		DateMethod dm = new DateMethod();
		System.out.println("Date :: " + dm.getCurrentDate());
		System.out.println("Local Date :: " +dm.getCurrentDateNow());
		System.out.println("Local Time :: " + dm.getCurrentTime());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E MMMM dd yyyy");
		LocalDate ld = dm.getCurrentDateNow();
		System.out.println("Date Time Formatter :: " + ld.format(dtf));
		System.out.println("Date of :: " + LocalDate.of(2023, 11, 14));
	}
}
