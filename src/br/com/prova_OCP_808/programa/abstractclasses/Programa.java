package br.com.prova_OCP_808.programa.abstractclasses;

import java.util.ArrayList;

public class Programa {

	private static Shih_tzu chewie = new Shih_tzu();
	
	public static void main(String [] args) {
		
		
		System.out.println(chewie.getNumeroTetas());
		
		System.out.println(AnimalMamiferoNoturnoInterface.getAno());

		String a = new String("nome");
		String b = new String("nome");

		String a1 = (("nome"));
		String b1 = "nome";
		System.out.println(a1 == b1);
		System.out.println(a == b);

		
		System.out.println(a.equals(b));
	}
}
