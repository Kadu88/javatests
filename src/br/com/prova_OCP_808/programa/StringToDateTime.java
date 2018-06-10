package br.com.prova_OCP_808.programa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.swing.text.DateFormatter;

public class StringToDateTime {

	public static void main(String []args ) {

		String stringDateFormatterParser = "dd-MM-yyyy";
		DateTimeFormatter dateFormatterParser = DateTimeFormatter.ofPattern(stringDateFormatterParser);
		
		String stringTimeFormatterParser = "HH:mm:ss";
		DateTimeFormatter timeFormatterParser = DateTimeFormatter.ofPattern(stringTimeFormatterParser);
		
		DateTimeFormatter dateTimeFormatterParser = DateTimeFormatter.ofPattern("yyyy MM dd, HH:mm:ss");

		DateTimeFormatter dateTimeFormatterParser2 = DateTimeFormatter.ofPattern(stringDateFormatterParser + " - " + stringTimeFormatterParser);
		
		LocalDate date = LocalDate.parse("02-01-2012", dateFormatterParser);
		LocalTime time = LocalTime.parse("21:35:22", timeFormatterParser);
		LocalDateTime dateTime = LocalDateTime.parse("1986 01 22, 20:31:19", dateTimeFormatterParser);
		
		
		DateTimeFormatter saidaDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM);
		
		System.out.println(dateTime.format(saidaDateTime));
		System.out.println();
		
		System.out.println(date.format(dateFormatterParser));
		System.out.println(time.format(timeFormatterParser));
		System.out.println(dateTime.format(dateTimeFormatterParser2));
		System.out.println();
		System.out.println(dateTime.format(dateTimeFormatterParser));
		
		DateTimeFormatter dateTimeFormatterParserZ = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dateTimeFormatterParserZ.format(time));
		
		
	}	
}