package javaPrograms.DateFolder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DateMethod {
	public Date getCurrentDate() {
		return new Date();
	}
	
	public LocalDate getCurrentDateNow() {
		return LocalDate.now();
	}
	public LocalTime getCurrentTime() {
		return LocalTime.now();
	}
}
