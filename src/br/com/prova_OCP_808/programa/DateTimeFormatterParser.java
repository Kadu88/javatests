package br.com.prova_OCP_808.programa;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeFormatterParser {

	public static void main(String []args ) {
	
		// LocalDate
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");		
		LocalDate localDate = LocalDate.parse("22-01-1986", dateFormatter);		
		DateTimeFormatter dateFormatterSaida = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(dateFormatterSaida.format(localDate)+"\n"); //1986-01-22

		// LocalTime
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime localTime = LocalTime.parse("20:31:27", timeFormatter);
		DateTimeFormatter timeFormatterSaida = DateTimeFormatter.ofPattern("HH:mm.ss");
		System.out.println(timeFormatterSaida.format(localTime)+"\n"); //20:31.27
		
		// LocalDateTime
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime localDateTimeParsed = LocalDateTime.parse("2012-01-02 21:34:48", dateTimeFormatter);
		LocalDateTime localDateTimeTogether = LocalDateTime.of(localDate, localTime);
		DateTimeFormatter dateTimeFormatterSaida = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm.ss");
		System.out.println(dateTimeFormatterSaida.format(localDateTimeParsed)); //02-01-2012 21:34.48
		System.out.println(dateTimeFormatterSaida.format(localDateTimeTogether)+"\n"); //22-01-1986 20:31.27	

		// Other possibilities that works	
		System.out.println(dateFormatterSaida.format(localDateTimeParsed)); //2012-01-02
		System.out.println(timeFormatterSaida.format(localDateTimeParsed)+"\n"); //21:34.48

		// Other possibilities that DON'T works		
		System.out.println(dateTimeFormatterSaida.format(localDate)); //RuntimeException 
		//java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
		
		System.out.println(dateTimeFormatterSaida.format(localTime)); //RuntimeException 
		//java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: DayOfMonth
		
	}
}