package br.com.prova_OCP_808.programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa4 {
	

	public static void main(String []args ) {
	
		fly(new int[] {0,1,2,3});
		flyer(new int[] {0,1,2,3});
		
//		fly(1 ,2 ,3, 4, 5, 6, 7, 8, 9, 10);
		flyer(1 ,2 ,3, 4, 5, 6, 7, 8, 9, 10);
		
		
	}
	
	public static void fly(int[] numeros) {
		System.out.println("Fly: " + numeros);
	}
	
	public static void flyer(int...numbers) {
		System.out.println("Flyer: " + numbers);
	}
	
	
}