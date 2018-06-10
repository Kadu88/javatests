package br.com.prova_OCP_808.programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveIfTest {
	

	public static void main(String []args ) {
		
		List<String> l = new ArrayList<>();
		l = new ArrayList<>();
		l.add("Adão");
		l.add("Eva");
		l.add("Bradock");
		l.add("Anibal");
		l.add("Ester");
		l.add("Josi");
		l.add("Amanda");
		l.add("Luiza");
		l.add("Tereza");
		l.add("Jussara");
		l.add("Hermanoteu");
		l.add("Houston");
		l.add("Hudson");
		l.add("Hedson");
		l.add("Roger");
		l.add("Thais");
		l.add("Taliana");
		l.add("Tamara");
		l.add("Thiago");
		l.add("Rui");
		l.add("Rosana");
		l.add("Mônica");
		l.add("Maraia");
		l.add("Maraisa");
		l.add("Matheus");
		l.add("Cauâ");
		l.add("Rita");
		l.add("Bruna");
		l.add("Jessica");
		l.add("Josiane");
		l.add("Pâmela");
		l.add("Antônio");
		l.add("Cleiton");
		l.add("Clevis");
		l.add("Daniel");
		l.add("Oseias");
		l.add("Amós");
		l.add("Obadias");
		l.add("Jonas");
		l.add("Miqueias");
		l.add("Naum");
		l.add("Sofonias");
		l.add("Zacarias");
		l.add("Malaquias");
		l.add("Jó");
		l.add("Josué");
		l.add("Rute");
		l.add("Samuel");
		l.add("Macron");
		l.add("Puttin");
		l.add("Trump");
		
		Collections.sort(l);
		printarLista(l);
		
		l.removeIf(s -> s.charAt(0) == 'A');
		printarLista(l);

		l.removeIf(s -> s.charAt(0) == 'H');
		printarLista(l);

		l.removeIf(s -> s.charAt(0) == 'J');
		printarLista(l);

		l.removeIf(s -> s.length() < 5);
		printarLista(l);

		l.removeIf(s -> s.length() > 5);
		printarLista(l);

		l.removeIf(s -> s.contains("a"));
		printarLista(l);

		l.removeIf(s -> s.contains("e"));
		printarLista(l);

	}
	
	private static void printarLista(List<String> lista) {
		System.out.println("A lista tem " + lista.size() + " nomes.");
		System.out.println(lista);
		System.out.println();
	}
	
	
}