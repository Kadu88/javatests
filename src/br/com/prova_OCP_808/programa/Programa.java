package br.com.prova_OCP_808.programa;

import java.util.ArrayList;
import java.util.Arrays;


public class Programa {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();
		
		lista.add("Teste");
		lista.add(false);
		lista.add(56);
		lista.add(24.3);
		lista.add(4.09f);
		lista.add(3604932L);
		lista.add("FIM!");
		
		System.out.println(lista);
		
	}
}