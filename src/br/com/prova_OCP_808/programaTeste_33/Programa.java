package br.com.prova_OCP_808.programaTeste_33;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Programa {
	
	static double area;
	int b =2, h=3;
	
	public static void main(String []args) {
		
		double p,b,h;
		
		if(area==0) {
			b=3;
			h=4;
			p=0.5;			
		}
		
//		area = p * b * h;
	
		short a = 2;
		

		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014, 6, 20);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
		
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);
		System.out.println("date3 = " + date3);
		
		
		System.out.println();
		System.out.println();

		
		Boolean[] bool = new Boolean[2];
		bool[0] = new Boolean(Boolean.parseBoolean("true"));
		bool[1] = new Boolean(null);
		
		System.out.println(bool[0] + " " + bool[1]);
		
		
		System.out.println();

		
	}
}
