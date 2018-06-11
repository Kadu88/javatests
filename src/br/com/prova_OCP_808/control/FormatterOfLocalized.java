package br.com.prova_OCP_808.control;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatterOfLocalized {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2018,  Month.APRIL, 30);
		LocalTime time = LocalTime.of(21, 26, 50);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		DateTimeFormatter fDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter fTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		DateTimeFormatter fDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		System.out.println(date.format(fDate));
		//System.out.println(date.format(fTime));//java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
		//System.out.println(date.format(fDateTime));//java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
		
		//System.out.println(time.format(fDate));//java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: DayOfMonth
		System.out.println(time.format(fTime));
		//System.out.println(time.format(fDateTime)); //java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: DayOfMonth
		
		System.out.println(dateTime.format(fDate));
		System.out.println(dateTime.format(fTime));
		System.out.println(dateTime.format(fDateTime));
	}
}