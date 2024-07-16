//Date Time Formatter

package java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void main(String[] args) {

		String date = "1996-10-26";

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		LocalDate date1 = LocalDate.parse(date, dateTimeFormatter);

		DayOfWeek dayOfWeek = date1.getDayOfWeek();

		System.out.println(dayOfWeek);

	}
}